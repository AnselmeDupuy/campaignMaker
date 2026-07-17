package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.Action;
import com.example.CampaignManager.modelDTO.monster.ActionDTO;

public class ActionMapper {
    public static Action fromDTO(ActionDTO dto) {
        Action action = new Action();

        action.setName(dto.getName());
        action.setDescription(dto.getDesc());
        action.setAttackBonus(dto.getAttackBonus());
        if (dto.getMultiattackType() != null){
            action.setMultiAttack(dto.getMultiattackType());
        }
        if (dto.getDamage() != null) {
            action.setDamage(dto.getDamage().stream().map(DamageMapper::fromDTO).toList());
        }
        if (dto.getActions() != null) {
            action.setActionReference(dto.getActions().stream().map(ActionReferenceMapper::fromDTO).toList());
        }

        return action;
    }
}
