package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.ActionReference;
import com.example.CampaignManager.modelDTO.monster.ActionReferenceDTO;

public class ActionReferenceMapper {
    public static ActionReference fromDTO(ActionReferenceDTO dto) {
        ActionReference actionReference = new ActionReference();

        actionReference.setActionName(dto.getActionName());
        actionReference.setCount(dto.getCount());
        actionReference.setType(dto.getType());

        return actionReference;
    }
}
