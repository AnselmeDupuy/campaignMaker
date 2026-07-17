package com.example.CampaignManager.controller;

import com.example.CampaignManager.model.LibraryObject;
import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.repositories.MonsterRepository;
import com.example.CampaignManager.model.monster.Monster;
import com.example.CampaignManager.repositories.SpellRepository;
import com.example.CampaignManager.services.MonsterService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;

public class MainController {

    private final MonsterRepository monsterRepository = new MonsterRepository();
    private final SpellRepository spellRepository = new SpellRepository();

    @FXML
    private TabPane editorTabs;

    @FXML
    private TreeView<Object> navigationTree;

    @FXML
    private ListView<Object> relatedObjectsList;

    @FXML
    private ScrollPane previewScrollPane;

    private MonsterService monsterService = new MonsterService(spellRepository);

    private void openMonsterTab(Monster monster){
        Tab existing = findOpenTab(monster);

        if (existing != null) {
            editorTabs.getSelectionModel().select(existing);
            return;
        }
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MonsterDisplay.fxml"));

            Parent root = loader.load();

            MonsterController monsterController = loader.getController();

            monsterController.setMonster(monster);

            Tab tab = new Tab(monster.getName());
            tab.setUserData(monster);
            tab.setContent(root);


            editorTabs.getTabs().add(tab);
            editorTabs.getSelectionModel().select(tab);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openSpellTab(Spell spell) {
        Tab existing = findOpenTab(spell);

        if (existing != null) {
            editorTabs.getSelectionModel().select(existing);
            return;
        }
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SpellDisplay.fxml"));

            Parent root = loader.load();

            SpellController spellController = loader.getController();

            spellController.setSpell(spell);

            Tab tab = new Tab(spell.getName());
            tab.setUserData(spell);
            tab.setContent(root);

            editorTabs.getTabs().add(tab);
            editorTabs.getSelectionModel().select(tab);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Tab findOpenTab(LibraryObject object) {
        for (Tab tab : editorTabs.getTabs()){
            if (tab.getUserData() instanceof LibraryObject open && open.getName().equalsIgnoreCase(object.getName())){
                return tab;
            }
        }

        return null;
    }

    private void displayRelatedSpells(Monster monster) {
        relatedObjectsList.getItems().clear();

        List<Spell> spells =
                monsterService.getSpellsFromMonster(monster);


        relatedObjectsList.getItems().addAll(spells);
    }

    private void showSpellPreview(Spell spell) {

        VBox preview = new VBox(8);

        preview.getChildren().addAll(
                new Label("Name: " + spell.getName()),
                new Label("Level: " + spell.getLevel()),
                new Label("School: " + spell.getSchool()),
                new Label("Range: " + spell.getRange()),
                new Label("Duration: " + spell.getDuration())
        );

        previewScrollPane.setContent(preview);
    }

    @FXML
    public void initialize() {
        TreeItem<Object> root = new TreeItem<>("Library");
        TreeItem<Object> monsterTree = new TreeItem<>("Monsters");
        TreeItem<Object> spellTree = new TreeItem<>(("Spells"));

        for (Spell spell : spellRepository.getSpells()){
            spellTree.getChildren().add(
                    new TreeItem<>(spell)
            );
        }

        spellTree.setExpanded(false);

        for (Monster monster : monsterRepository.getMonsters()){
            monsterTree.getChildren().add(
                    new TreeItem<>(monster)
            );
        }
        monsterTree.setExpanded(false);
        root.setExpanded(true);
        root.getChildren().add(monsterTree);
        root.getChildren().add(spellTree);
        navigationTree.setRoot(root);

        editorTabs.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldTab, newTab) -> {

                    if (newTab == null) {
                        return;
                    }

                    Object object = newTab.getUserData();

                    if (object instanceof Monster monster) {
                        displayRelatedSpells(monster);
                    } else {
                        relatedObjectsList.getItems().clear();
                        previewScrollPane.setContent(null);
                    }
                });


        navigationTree.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2){
                TreeItem<Object> item = navigationTree.getSelectionModel().getSelectedItem();

                if (item == null)
                    return;
                if (item.getValue() instanceof Monster monster){
                    openMonsterTab(monster);
                } else if (item.getValue() instanceof Spell spell){
                    openSpellTab(spell);
                }
            }
        });

        relatedObjectsList.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2){
                Object selected = relatedObjectsList.getSelectionModel().getSelectedItem();

                if (selected instanceof Spell spell) {
                    openSpellTab(spell);
                }
                else if (selected instanceof Monster monster) {
                    openMonsterTab(monster);
                }

            }
        });

        relatedObjectsList.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldValue, newValue)->{
            if(newValue == null){
                previewScrollPane.setContent(null);
                return;
            }
            if(newValue instanceof Spell spell){
                showSpellPreview(spell);
            }
//            else if (newValue instanceof Monster monster) {
//                showMonsterPreview(monster);
//            }
        });
    }

}


