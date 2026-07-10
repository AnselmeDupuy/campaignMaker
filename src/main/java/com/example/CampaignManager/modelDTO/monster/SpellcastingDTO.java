package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellcastingDTO {

    private int level;

    private AbilityDTO ability;

    private int dc;

    private int modifier;

    @JsonProperty("components_required")
    private List<String> componentsRequired;

    private String school;

    private Map<String, Integer> slots;

    private List<SpellDTO> spells;

    public SpellcastingDTO() {}

    public int getLevel() {
        return level;
    }

    public AbilityDTO getAbility() {
        return ability;
    }

    public int getDc() {
        return dc;
    }

    public int getModifier() {
        return modifier;
    }

    public List<String> getComponentsRequired() {
        return componentsRequired;
    }

    public String getSchool() {
        return school;
    }

    public Map<String, Integer> getSlots() {
        return slots;
    }

    public List<SpellDTO> getSpells() {
        return spells;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public void setAbility(AbilityDTO ability) {
        this.ability = ability;
    }

    public void setComponentsRequired(List<String> componentsRequired) {
        this.componentsRequired = componentsRequired;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSlots(Map<String, Integer> slots) {
        this.slots = slots;
    }

    public void setSpells(List<SpellDTO> spells) {
        this.spells = spells;
    }
}