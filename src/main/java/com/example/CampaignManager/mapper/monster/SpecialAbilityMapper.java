package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.mapper.DifficultyClassMapper;
import com.example.CampaignManager.model.monster.SpecialAbility;
import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.example.CampaignManager.modelDTO.monster.SpecialAbilityDTO;

public class SpecialAbilityMapper {
    public static SpecialAbility fromDTO(SpecialAbilityDTO dto) {
        if (dto == null) return null;
        SpecialAbility specialAbility = new SpecialAbility();

        specialAbility.setName(dto.getName());
        specialAbility.setDescription(dto.getDesc());
        specialAbility.setDifficultyClass(DifficultyClassMapper.fromDTO(dto.getDc()));
        if (dto.getSpellcasting() != null &&
                dto.getSpellcasting().getSpells() != null) {

            specialAbility.setSpell(
                    dto.getSpellcasting().getSpells().stream()
                            .map(ApiReferenceDTO::getName)
                            .toList()
            );
        }



        return specialAbility;
    }
}
