package com.example.CampaignManager.controller;

import com.example.CampaignManager.database.MonsterRepository;
import com.example.CampaignManager.model.Monster;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.io.IOException;

public class MainController {

    private final MonsterRepository repository = new MonsterRepository();

    @FXML
    private TabPane editorTabs;

    @FXML
    private TreeView<Object> navigationTree;

    private void openMonsterTab(Monster monster){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MonsterDisplay.fxml"));

            Parent root = loader.load();

            MonsterController monsterController = loader.getController();

            monsterController.setMonster(monster);

            Tab tab = new Tab(monster.getName());

            tab.setContent(root);

            editorTabs.getTabs().add(tab);
            editorTabs.getSelectionModel().select(tab);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        TreeItem<Object> root = new TreeItem<>("Library");
        TreeItem<Object> monsterTree = new TreeItem<>("Monsters");

        for (Monster monster : repository.getMonsters()){
            monsterTree.getChildren().add(
                    new TreeItem<>(monster)
            );
        }
        monsterTree.setExpanded(false);
        root.setExpanded(true);
        root.getChildren().add(monsterTree);
        navigationTree.setRoot(root);


        navigationTree.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2){
                TreeItem<Object> item = navigationTree.getSelectionModel().getSelectedItem();

                if (item == null)
                    return;
                if (item.getValue() instanceof Monster monster){
                    openMonsterTab(monster);
                }
            }
        });
    }

}


