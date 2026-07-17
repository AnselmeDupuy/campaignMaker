package com.example.CampaignManager.controller;

import com.example.CampaignManager.model.spell.Spell;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;


public class SpellController {

    @FXML
    private Label spellName;

    @FXML
    private Label level;

    @FXML
    private Label spellSchool;

    @FXML
    private Label gridSpellDuration;

    @FXML
    private Label gridSpellConcentration;

    @FXML
    private Label gridSpellRange;

    @FXML
    private Label gridSpellRitual;

    @FXML
    private Label gridSpellCastingTime;

    @FXML
    private Label gridSpellComponents;

    @FXML
    private Label gridSpellAoe;

    @FXML
    private VBox spellDescription;

    @FXML
    private TitledPane displaySpellMaterial;

    @FXML
    private TitledPane displaySpellAtHigherLevel;

    @FXML
    private TitledPane displaySpellDamage;

    @FXML
    private TitledPane displaySpellClasses;

    @FXML
    private TitledPane displaySpellHeal;

    @FXML
    private VBox materialBox;

    @FXML
    private VBox higherLevelBox;

    @FXML
    private VBox damageBox;

    @FXML
    private VBox classesBox;

    @FXML
    private VBox healBox;

    public void setSpell(Spell spell){
        spellName.setText(spell.getName());
        level.setText("Level " + spell.getLevel());
        spellSchool.setText(spell.getSchool() +  " spell");

        for (String description : spell.getDescription()) {
            spellDescription.getChildren().clear();
            Label descriptionBox = new Label(description);
            descriptionBox.setWrapText(true);
            descriptionBox.prefWidthProperty().bind(spellDescription.widthProperty().subtract(20));
            spellDescription.getChildren().addAll(descriptionBox);
        }

        gridSpellDuration.setText(spell.getDuration());
        if (spell.getAreaOfEffect() != null) {
            gridSpellAoe.setText(spell.getAreaOfEffect().getType());
        }
        gridSpellRange.setText(spell.getRange());
        gridSpellRitual.setText(spell.getRitual() ? "Yes" : "No");
        gridSpellComponents.setText(spell.getComponents().toString());
        gridSpellCastingTime.setText(spell.getCastingTime());
        gridSpellConcentration.setText(spell.getConcentration() ? "Yes" : "No");

        materialBox.getChildren().clear();
        if(spell.getMaterial() != null){
            displaySpellMaterial.setVisible(true);
            displaySpellMaterial.setManaged(true);

            VBox materialCard = new VBox(5);

            Label materialLabel = new Label(spell.getMaterial());
            materialLabel.setWrapText(true);
            materialCard.getChildren().add(materialLabel);
            materialBox.getChildren().add(materialCard);
        } else {
            displaySpellMaterial.setVisible(false);
            displaySpellMaterial.setManaged(false);
        }

        higherLevelBox.getChildren().clear();
        if (spell.getHigherLevel() != null && !spell.getHigherLevel().isEmpty()) {
            displaySpellAtHigherLevel.setVisible(true);
            displaySpellAtHigherLevel.setManaged(true);

            VBox higherLevelCard = new VBox(5);

            for (String text : spell.getHigherLevel()) {
                Label label = new Label(text);
                label.setWrapText(true);
                higherLevelCard.getChildren().add(label);
            }

            higherLevelBox.getChildren().add(higherLevelCard);
        } else {
            displaySpellAtHigherLevel.setVisible(false);
            displaySpellAtHigherLevel.setManaged(false);
        }

        damageBox.getChildren().clear();
        if (spell.getDamage() != null) {
            displaySpellDamage.setVisible(true);
            displaySpellDamage.setManaged(true);

            VBox damageCard = new VBox(5);

            if (spell.getDamage().getName() != null) {
                damageCard.getChildren().add(new Label("Type: " + spell.getDamage().getName()));
            }

            if (spell.getDamage().getDamageAtSlotLevel() != null) {
                damageCard.getChildren().add(
                        new Label("Damage: " + spell.getDamage().getDamageAtSlotLevel())
                );
            }

            if (spell.getDamage().getDamageAtCharacterLevel() != null) {
                damageCard.getChildren().add(
                        new Label("Damage: " + spell.getDamage().getDamageAtCharacterLevel())
                );
            }

            damageBox.getChildren().add(damageCard);
        } else {
            displaySpellDamage.setVisible(false);
            displaySpellDamage.setManaged(false);
        }

        classesBox.getChildren().clear();
        if (spell.getClasses() != null && !spell.getClasses().isEmpty()) {
            displaySpellClasses.setVisible(true);
            displaySpellClasses.setManaged(true);

            VBox classesCard = new VBox(5);

            for (String clazz : spell.getClasses()) {
                classesCard.getChildren().add(new Label(clazz));
            }

            classesBox.getChildren().add(classesCard);
        } else {
            displaySpellClasses.setVisible(false);
            displaySpellClasses.setManaged(false);
        }

        healBox.getChildren().clear();
        if (spell.getHealAtSlotLevel() != null && !spell.getHealAtSlotLevel().isEmpty()) {
            displaySpellHeal.setVisible(true);
            displaySpellHeal.setManaged(true);

            VBox healCard = new VBox(5);

            spell.getHealAtSlotLevel().forEach((level, amount) -> {
                healCard.getChildren().add(
                        new Label("Level " + level + ": " + amount)
                );
            });

            healBox.getChildren().add(healCard);
        } else {
            displaySpellHeal.setVisible(false);
            displaySpellHeal.setManaged(false);
        }




    }



}


