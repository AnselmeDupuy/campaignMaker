package com.example.CampaignManager.mapper.spell;

import com.example.CampaignManager.model.spell.Damage;
import com.example.CampaignManager.modelDTO.spell.DamageDTO;

public class DamageMapper {
    public static Damage fromDTO(DamageDTO dto) {
        if (dto == null) return null;

        Damage damage = new Damage();

        if (dto.getDamageType() != null) {
            damage.setName(dto.getDamageType().getName());
        }
        if (dto.getDamageAtCharacterLevel() != null) {
            damage.setDamageAtCharacterLevel(dto.getDamageAtCharacterLevel());
        }
        if (dto.getDamageAtSlotLevel() != null) {
            damage.setDamageAtSlotLevel(dto.getDamageAtSlotLevel());
        }

        return damage;

    }
}
