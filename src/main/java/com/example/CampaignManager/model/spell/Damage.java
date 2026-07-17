package com.example.CampaignManager.model.spell;

import java.util.Map;

public class Damage {
    private String name;
    private Map<String, String> damageAtSlotLevel;
    private Map<String, String> damageAtCharacterLevel;

    public Damage(){}

    public String getName() {
        return name;
    }

    public Map<String, String> getDamageAtCharacterLevel() {return damageAtCharacterLevel;}

    public Map<String, String> getDamageAtSlotLevel() {return damageAtSlotLevel;}

    //Setters
    public void setName(String name) {this.name = name;}

    public void setDamageAtCharacterLevel(Map<String, String> damageAtCharacterLevel) {
        this.damageAtCharacterLevel = damageAtCharacterLevel;
    }

    public void setDamageAtSlotLevel(Map<String, String> damageAtSlotLevel) {
        this.damageAtSlotLevel = damageAtSlotLevel;
    }
}
