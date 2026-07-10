package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.Proficiency;
import com.example.CampaignManager.modelDTO.monster.ProficiencyDTO;
import com.example.CampaignManager.modelDTO.monster.ProficiencyEntryDTO;

public class ProficiencyMapper {
    public static Proficiency fromDTO(ProficiencyEntryDTO dto) {
        Proficiency proficiency = new Proficiency();

        proficiency.setName(dto.getProficiency().getName());
        proficiency.setValue(dto.getValue());

        return proficiency;
    }
}
