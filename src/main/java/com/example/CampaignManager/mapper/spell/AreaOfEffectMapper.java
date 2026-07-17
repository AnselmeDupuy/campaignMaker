package com.example.CampaignManager.mapper.spell;

import com.example.CampaignManager.model.spell.AreaOfEffect;
import com.example.CampaignManager.modelDTO.spell.AreaOfEffectDTO;

public class AreaOfEffectMapper {
    public static AreaOfEffect fromDTO(AreaOfEffectDTO dto){
        if (dto == null) return null;

        AreaOfEffect areaOfEffect = new AreaOfEffect();

        areaOfEffect.setSize(dto.getSize());
        areaOfEffect.setType(dto.getType());

        return areaOfEffect;
    }
}
