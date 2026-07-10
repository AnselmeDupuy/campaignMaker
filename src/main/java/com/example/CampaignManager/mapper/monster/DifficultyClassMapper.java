package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.DifficultyClass;
import com.example.CampaignManager.modelDTO.monster.DcDTO;

public class DifficultyClassMapper {
    public static DifficultyClass fromDTO(DcDTO dto){
        DifficultyClass difficultyClass = new DifficultyClass();

        if (dto == null) return null;

        difficultyClass.setName(dto.getDcType().getName());
        difficultyClass.setDcValue(dto.getDcValue());
        difficultyClass.setSuccessType(dto.getSuccessType());

        return difficultyClass;
    }
}
