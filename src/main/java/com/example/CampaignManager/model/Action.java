package com.example.CampaignManager.model;

import com.example.CampaignManager.modelDTO.monster.ActionReferenceDTO;

import java.util.List;

public class Action {
    private String name;
    private String description;
    private int attackBonus;
    private String multiAttack;
    private List<Damage> damage;
    private List<ActionReference> actionReference;

    public Action() {}

    //getters
    public String getName() {return name;}

    public String getDescription() {return description;}

    public int getAttackBonus() {return attackBonus;}

    public String getMultiAttack() {return multiAttack;}

    public List<Damage> getDamage() {return damage;}

    public List<ActionReference> getActionReference() {return actionReference;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setAttackBonus(int attackBonus) {this.attackBonus = attackBonus;}

    public void setMultiAttack(String multiAttack) {this.multiAttack = multiAttack;}

    public void setDamage(List<Damage> damage) {this.damage = damage;}

    public void setActionReference(List<ActionReference> actionReference) {this.actionReference = actionReference;}
}
