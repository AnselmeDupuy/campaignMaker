package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.Condition;
import com.example.CampaignManager.modelDTO.monster.ConditionImmunityDTO;

public class ConditionMapper {
    public static Condition fromDTO(ConditionImmunityDTO dto) {
        Condition condition = new Condition();

        condition.setName(dto.getName());

        return condition;
    }
}
