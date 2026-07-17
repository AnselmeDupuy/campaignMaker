package com.example.CampaignManager.modelDTO.monster;

import com.example.CampaignManager.modelDTO.ApiReferenceDTO;

public class ProficiencyEntryDTO {

    private int value;
    private ApiReferenceDTO proficiency;

    public ProficiencyEntryDTO() {}

    public int getValue() {
        return value;
    }

    public ApiReferenceDTO getProficiency() {
        return proficiency;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setProficiency(ApiReferenceDTO proficiency) {
        this.proficiency = proficiency;
    }
}