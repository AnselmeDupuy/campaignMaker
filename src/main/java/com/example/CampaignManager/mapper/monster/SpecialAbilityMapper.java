package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.SpecialAbility;
import com.example.CampaignManager.modelDTO.monster.SpecialAbilityDTO;

public class SpecialAbilityMapper {
    public static SpecialAbility fromDTO(SpecialAbilityDTO dto) {
        SpecialAbility specialAbility = new SpecialAbility();

        specialAbility.setName(dto.getName());
        specialAbility.setDescription(dto.getDesc());
        specialAbility.setDifficultyClass(DifficultyClassMapper.fromDTO(dto.getDc()));


        return specialAbility;
    }
}
