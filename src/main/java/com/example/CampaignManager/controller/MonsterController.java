package com.example.CampaignManager.controller;

import com.example.CampaignManager.model.monster.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

import java.util.List;


public class MonsterController {
    @FXML
    private Label monsterName;

    @FXML
    private Label monsterAlignment;

    @FXML
    private TitledPane displayMonsterAbilities;

    @FXML
    private TitledPane displayMonsterActions;

    @FXML
    private TitledPane displayMonsterLegendaryActions;

    @FXML
    private TitledPane displayMonsterProficiencies;

    @FXML
    private Label gridName;

    @FXML
    private Label gridSize;

    @FXML
    private Label gridType;

    @FXML
    private Label gridAlignment;

    @FXML
    private Label gridHitPoint;

    @FXML
    private Label gridArmorClass;

    @FXML
    private Label gridSpeed;

    @FXML
    private Label gridLanguages;

    @FXML
    private Label gridSenses;

    @FXML
    private Label gridStatStrength;

    @FXML
    private Label gridStatDexterity;

    @FXML
    private Label gridStatConstitution;

    @FXML
    private Label gridStatIntelligence;

    @FXML
    private Label gridStatWisdom;

    @FXML
    private Label gridStatCharisma;

    @FXML
    private VBox actionsBox;

    @FXML VBox abilitiesBox;

    @FXML
    private VBox legendaryActionsBox;

    @FXML
    private VBox proficienciesBox;


    public void setMonster(Monster monster){

        if (monster.getLegendaryAction() == null || monster.getLegendaryAction().isEmpty()) {
            displayMonsterLegendaryActions.setVisible(false);
            displayMonsterLegendaryActions.setManaged(false);
        } else {
            displayMonsterLegendaryActions.setVisible(true);
            displayMonsterLegendaryActions.setManaged(true);

            legendaryActionsBox.getChildren().clear();

            for(Action action : monster.getLegendaryAction()){
                VBox legendaryActionCard = new VBox(5);

                Label name = new Label(action.getName());
                name.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");

                Label description = new Label(action.getDescription());
                description.setWrapText(true);
                description.prefWidthProperty().bind(legendaryActionsBox.widthProperty().subtract(20));

                legendaryActionCard.getChildren().addAll(name, description);
                legendaryActionsBox.getChildren().add(legendaryActionCard);
            }
        }

        monsterName.setText(monster.getName());
        monsterAlignment.setText(monster.getAlignment());

        gridName.setText(monster.getName());
        gridSize.setText(monster.getSize());
        gridType.setText(monster.getSize());
        gridAlignment.setText(monster.getAlignment());
        gridHitPoint.setText(String.valueOf(monster.getHp()));
        if (monster.getArmorClass() != null){
            String list = "";
            for (ArmorClass armor : monster.getArmorClass()){
                list = armor.getType() + ": " + armor.getValue();
            }
            gridArmorClass.setText(list);
        }
        gridSenses.setText(String.valueOf(monster.getSense()));
        gridLanguages.setText(monster.getLanguages());
        gridSpeed.setText(monster.getSpeed().getAllSpeeds().toString());

        gridSenses.setText(String.join(", ", monster.getSense().getAllSenses()));

        gridStatCharisma.setText(String.valueOf(monster.getCharisma()));
        gridStatStrength.setText(String.valueOf(monster.getStrength()));
        gridStatDexterity.setText(String.valueOf(monster.getDexterity()));
        gridStatIntelligence.setText(String.valueOf(monster.getIntelligence()));
        gridStatConstitution.setText(String.valueOf(monster.getConstitution()));
        gridStatWisdom.setText(String.valueOf(monster.getWisdom()));


        //Display of arrays of actions
        actionsBox.getChildren().clear();
        if (!monster.getAction().isEmpty()){
            displayMonsterActions.setVisible(true);
            displayMonsterActions.setManaged(true);

            for (Action action : monster.getAction()){
                VBox actionCard = new VBox(5);

                Label name = new Label(action.getName());
                name.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");

                Label description = new Label(action.getDescription());
                description.setWrapText(true);
                description.prefWidthProperty().bind(actionsBox.widthProperty().subtract(20));

                actionCard.getChildren().addAll(name, description);
                actionsBox.getChildren().add(actionCard);
            }
        } else {
            displayMonsterActions.setVisible(false);
            displayMonsterActions.setManaged(false);
        }

        //Display of Arrays of abilities
        abilitiesBox.getChildren().clear();
        if (!monster.getSpecialAbility().isEmpty()){
            displayMonsterAbilities.setVisible(true);
            displayMonsterAbilities.setManaged(true);
            for (SpecialAbility ability : monster.getSpecialAbility()){
                VBox abilityCard = new VBox(5);

                Label name = new Label(ability.getName());
                name.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");

                Label description = new Label(ability.getDescription());
                description.setWrapText(true);
                description.prefWidthProperty().bind(actionsBox.widthProperty().subtract(20));

                abilityCard.getChildren().addAll(name, description);
                abilitiesBox.getChildren().add(abilityCard);
            }
        } else {
            displayMonsterAbilities.setVisible(false);
            displayMonsterAbilities.setManaged(false);
        }

        proficienciesBox.getChildren().clear();
        if (!monster.getProficiency().isEmpty()){
            displayMonsterProficiencies.setVisible(true);
            displayMonsterProficiencies.setManaged(true);

            for(Proficiency proficiency : monster.getProficiency()){
                VBox proficiencyCard = new VBox(5);
                String proficiencyString = proficiency.getName() + ": " + proficiency.getValue();
                Label name = new Label(proficiencyString);

                proficiencyCard.getChildren().addAll(name);
                proficienciesBox.getChildren().add(proficiencyCard);
            }
        } else {
            displayMonsterProficiencies.setVisible(false);
            displayMonsterProficiencies.setManaged(false);
        }


    }


}
