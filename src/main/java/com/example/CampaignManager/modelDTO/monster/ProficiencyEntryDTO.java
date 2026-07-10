package com.example.CampaignManager.modelDTO.monster;

public class ProficiencyEntryDTO {

    private int value;
    private ProficiencyDTO proficiency;

    public ProficiencyEntryDTO() {}

    public int getValue() {
        return value;
    }

    public ProficiencyDTO getProficiency() {
        return proficiency;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setProficiency(ProficiencyDTO proficiency) {
        this.proficiency = proficiency;
    }
}