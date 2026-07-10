package com.example.CampaignManager.model;

import java.util.List;

public class Monster {

    private String name;
    private String type;
    private String size;
    private String alignment;
    private int hp;
    private String hitDiceRoll;
    private List<ArmorClass> armorClass;
    private Speed speed;

    //stats
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private List<Proficiency> proficiency;
    private List<String> damageResistance;
    private List<String> damageVulnerability;
    private List<String> damageImmunity;
    private List<Condition> conditionImmunity;
    private Sense sense;
    private String languages;
    private double challengeRating;
    private List<Action> action;
    private List<SpecialAbility> specialAbility;
    private List<Action> LegendaryAction;

    //init class
    public Monster(){}

    // display name as default
    @Override
    public String toString() {
        return name;
    }

    //getters
    public String getName() {return name;}

    public String getType() {return type;}

    public String getSize() {return size;}

    public String getAlignment() {return alignment;}

    public int getHp() {return hp;}

    public String getHitDiceRoll() {return hitDiceRoll;}

    public List<ArmorClass> getArmorClass() {return armorClass;}

    public Speed getSpeed() {return speed;}

    public int getStrength() {return strength;}

    public int getDexterity() {return dexterity;}

    public int getConstitution() {return constitution;}

    public int getIntelligence() {return intelligence;}

    public int getWisdom() {return wisdom;}

    public int getCharisma() {return charisma;}

    public List<Proficiency> getProficiency() {return proficiency;}

    public List<String> getDamageResistance() {return damageResistance;}

    public List<String> getDamageVulnerability() {return damageVulnerability;}

    public List<String> getDamageImmunity() {return damageImmunity;}

    public List<Condition> getConditionImmunity() {return conditionImmunity;}

    public Sense getSense() {return sense;}

    public String getLanguages() {return languages;}

    public double getChallengeRating() {return challengeRating;}

    public List<Action> getAction() {return action;}

    public List<SpecialAbility> getSpecialAbility() {return specialAbility;}

    public List<Action> getLegendaryAction() {return LegendaryAction;}

    //setters

    public void setName(String name) {this.name = name;}

    public void setType(String type) {this.type = type;}

    public void setSize(String size) {this.size = size;}

    public void setAlignment(String alignment) {this.alignment = alignment;}

    public void setHp(int hp) {this.hp = hp;}

    public void setHitDiceRoll(String hitDiceRoll) {this.hitDiceRoll = hitDiceRoll;}

    public void setArmorClass(List<ArmorClass> armorClass) {this.armorClass = armorClass;}

    public void setSpeed(Speed speed) {this.speed = speed;}

    public void setStrength(int strength) {this.strength = strength;}

    public void setDexterity(int dexterity) {this.dexterity = dexterity;}

    public void setConstitution(int constitution) {this.constitution = constitution;}

    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}

    public void setWisdom(int wisdom) {this.wisdom = wisdom;}

    public void setCharisma(int charisma) {this.charisma = charisma;}

    public void setProficiency(List<Proficiency> proficiency) {this.proficiency = proficiency;}

    public void setDamageResistance(List<String> damageResistance) {this.damageResistance = damageResistance;}

    public void setDamageVulnerability(List<String> damageVulnerability) {this.damageVulnerability = damageVulnerability;}

    public void setDamageImmunity(List<String> damageImmunity) {this.damageImmunity = damageImmunity;}

    public void setConditionImmunity(List<Condition> conditionImmunity) {this.conditionImmunity = conditionImmunity;}

    public void setSense(Sense sense) {this.sense = sense;}

    public void setLanguages(String languages) {this.languages = languages;}

    public void setChallengeRating(double challengeRating) {this.challengeRating = challengeRating;}

    public void setAction(List<Action> action) {this.action = action;}

    public void setSpecialAbility(List<SpecialAbility> specialAbility) {this.specialAbility = specialAbility;}

    public void setLegendaryAction(List<Action> legendaryAction) {LegendaryAction = legendaryAction;}
}
