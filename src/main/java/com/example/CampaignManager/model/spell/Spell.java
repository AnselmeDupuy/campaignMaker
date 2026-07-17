package com.example.CampaignManager.model.spell;

import com.example.CampaignManager.model.DifficultyClass;
import com.example.CampaignManager.model.LibraryObject;
import com.example.CampaignManager.modelDTO.spell.AreaOfEffectDTO;

import java.util.List;
import java.util.Map;

public class Spell implements LibraryObject {
    private String name;
    private List<String> description;
    private List<String> higherLevel;
    private String range;
    private List<String> components;
    private String material;
    private boolean ritual;
    private String duration;
    private boolean concentration;
    private String castingTime;
    private int level;
    private Damage damage;
    private DifficultyClass difficultyClass;
    private String attackType;
    private AreaOfEffect areaOfEffect;
    private String school;
    private List<String> classes;
    private List<String> subClasses;
    private Map<String, String> healAtSlotLevel;

    public Spell(){}

    @Override
    public String toString() {
        return name;
    }

    //Getters
    public String getName() {return name;}

    public Map<String, String> getHealAtSlotLevel() {return healAtSlotLevel;}

    public String getRange() {return range;}

    public String getMaterial() {return material;}

    public Boolean getRitual(){return ritual;}

    public String getAttackType() {return attackType;}

    public Boolean getConcentration(){return concentration;}

    public String getDuration() {return duration;}

    public String getCastingTime() {return castingTime;}

    public List<String> getHigherLevel() {return higherLevel;}

    public List<String> getDescription() {return description;}

    public List<String> getComponents() {return components;}

    public int getLevel() {return level;}

    public DifficultyClass getDifficultyClass() {return difficultyClass;}

    public AreaOfEffect getAreaOfEffect() {return areaOfEffect;}

    public Damage getDamage() {return damage;}

    public List<String> getClasses() {return classes;}

    public List<String> getSubClasses() {return subClasses;}

    public String getSchool() {return school;}

    //Setters

    public void setHealAtSlotLevel(Map<String, String> healAtSlotLevel) {this.healAtSlotLevel = healAtSlotLevel;}

    public void setName(String name) {this.name = name;}

    public void setClasses(List<String> classes) {this.classes = classes;}

    public void setRitual(boolean ritual) {this.ritual = ritual;}

    public void setRange(String range) {this.range = range;}

    public void setSchool(String school) {this.school = school;}

    public void setMaterial(String material) {this.material = material;}

    public void setHigherLevel(List<String> higherLevel) {this.higherLevel = higherLevel;}

    public void setDuration(String duration) {this.duration = duration;}

    public void setConcentration(boolean concentration) {this.concentration = concentration;}

    public void setComponents(List<String> components) {this.components = components;}

    public void setAreaOfEffect(AreaOfEffect areaOfEffect) {this.areaOfEffect = areaOfEffect;}

    public void setCastingTime(String castingTime) {this.castingTime = castingTime;}

    public void setAttackType(String attackType) {this.attackType = attackType;}

    public void setDamage(Damage damage) {this.damage = damage;}

    public void setLevel(int level) {this.level = level;}

    public void setDescription(List<String> description) {this.description = description;}

    public void setDifficultyClass(DifficultyClass difficultyClass) {this.difficultyClass = difficultyClass;}

    public void setSubClasses(List<String> subClasses) {this.subClasses = subClasses;}
}
