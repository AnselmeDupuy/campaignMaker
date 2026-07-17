package com.example.CampaignManager.model.monster;

public class Damage {
    private String name;
    private String damageType;
    private String damageDice;

    public Damage(){}

    //getters
    public String getName() {return name;}

    public String getDamageType() {return damageType;}

    public String getDamageDice() {return damageDice;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setDamageType(String damageType) {this.damageType = damageType;}

    public void setDamageDice(String damageDice) {this.damageDice = damageDice;}
}
