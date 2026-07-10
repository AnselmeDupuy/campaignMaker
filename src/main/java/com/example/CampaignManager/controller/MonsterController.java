package com.example.CampaignManager.controller;

import com.example.CampaignManager.model.Action;
import com.example.CampaignManager.model.ArmorClass;
import com.example.CampaignManager.model.Monster;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;


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


    public void setMonster(Monster monster){

        if (monster.getLegendaryAction() == null || monster.getLegendaryAction().isEmpty()) {
            displayMonsterLegendaryActions.setVisible(false);
            displayMonsterLegendaryActions.setManaged(false);
        } else {
            displayMonsterLegendaryActions.setVisible(true);
            displayMonsterLegendaryActions.setManaged(true);
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
        gridSpeed.setText(String.valueOf(monster.getSpeed()));
        gridSenses.setText(String.valueOf(monster.getSense()));
        gridLanguages.setText(monster.getLanguages());

        gridStatCharisma.setText(String.valueOf(monster.getCharisma()));
        gridStatStrength.setText(String.valueOf(monster.getStrength()));
        gridStatDexterity.setText(String.valueOf(monster.getDexterity()));
        gridStatIntelligence.setText(String.valueOf(monster.getIntelligence()));
        gridStatConstitution.setText(String.valueOf(monster.getConstitution()));
        gridStatWisdom.setText(String.valueOf(monster.getWisdom()));


        //Display of arrays of actions
        actionsBox.getChildren().clear();

        if (monster.getAction() != null){
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
        }


    }


}
