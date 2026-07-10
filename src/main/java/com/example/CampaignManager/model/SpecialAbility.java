package com.example.CampaignManager.model;

public class SpecialAbility {
    private String name;
    private String description;
    private DifficultyClass difficultyClass;

    public SpecialAbility() {}

    //getters
    public String getName() {return name;}

    public String getDescription() {return description;}

    public DifficultyClass getDifficultyClass() {return difficultyClass;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setDifficultyClass(DifficultyClass difficultyClass) {this.difficultyClass = difficultyClass;}
}
