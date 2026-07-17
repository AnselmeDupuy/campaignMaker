package com.example.CampaignManager.model.monster;

import com.example.CampaignManager.model.DifficultyClass;

import java.util.List;

public class SpecialAbility {
    private String name;
    private String description;
    private DifficultyClass difficultyClass;
    private List<String> spell;

    public SpecialAbility() {}

    //getters
    public String getName() {return name;}

    public String getDescription() {return description;}

    public DifficultyClass getDifficultyClass() {return difficultyClass;}

    public List<String> getSpell() {return spell;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setDifficultyClass(DifficultyClass difficultyClass) {this.difficultyClass = difficultyClass;}

    public void setSpell(List<String> spell) {this.spell = spell;}
}
