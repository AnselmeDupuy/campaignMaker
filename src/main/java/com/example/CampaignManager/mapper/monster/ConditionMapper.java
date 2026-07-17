package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.Condition;
import com.example.CampaignManager.modelDTO.ApiReferenceDTO;

public class ConditionMapper {
    public static Condition fromDTO(ApiReferenceDTO dto) {
        Condition condition = new Condition();

        condition.setName(dto.getName());

        return condition;
    }
}
