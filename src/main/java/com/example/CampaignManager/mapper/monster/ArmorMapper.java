package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.ArmorClass;
import com.example.CampaignManager.modelDTO.monster.ArmorClassDTO;

public class ArmorMapper {
    public static ArmorClass fromDTO(ArmorClassDTO dto) {
        ArmorClass armorClass = new ArmorClass();

        armorClass.setType(dto.getType());
        armorClass.setValue(dto.getValue());

        return armorClass;
    }
}
