package com.example.CampaignManager.mapper;

import com.example.CampaignManager.model.DifficultyClass;
import com.example.CampaignManager.modelDTO.DcDTO;

public class DifficultyClassMapper {
    public static DifficultyClass fromDTO(DcDTO dto){
        DifficultyClass difficultyClass = new DifficultyClass();

        if (dto == null) return null;

        if (dto.getDcType().getName() != null) {
            difficultyClass.setName(dto.getDcType().getName());
        }
        if (String.valueOf(dto.getDcValue()) != null) {
            difficultyClass.setDcValue(dto.getDcValue());
        }
        if (dto.getSuccessType() != null) {
            difficultyClass.setSuccessType(dto.getSuccessType());
        }
        if (dto.getDcSuccess() != null) {
            difficultyClass.setDcSuccess(dto.getDcSuccess());
        }
        return difficultyClass;
    }
}
