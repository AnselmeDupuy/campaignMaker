package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.Sense;
import com.example.CampaignManager.modelDTO.monster.SenseDTO;

public class SenseMapper {
    public static Sense fromDTO(SenseDTO dto){
        if (dto == null) return null;

        Sense sense = new Sense();

        sense.setTremorSense(dto.getTremorsense());
        sense.setBlindSight(dto.getBlindsight());
        sense.setDarkVision(dto.getDarkvision());
        sense.setTrueSight(dto.getTruesight());
        sense.setPassivePerception(dto.getPassivePerception());

        return sense;
    }
}
