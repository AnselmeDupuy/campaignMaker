package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.Damage;
import com.example.CampaignManager.modelDTO.monster.DamageDTO;

public class DamageMapper {
    public static Damage fromDTO(DamageDTO dto) {
        Damage damage = new Damage();

        if (dto.getDamageType() != null) {
            damage.setName(dto.getDamageType().getName());
        }
        damage.setDamageDice(dto.getDamageDice());
        damage.setDamageType(dto.getDamageDice());

        return damage;
    }
}
