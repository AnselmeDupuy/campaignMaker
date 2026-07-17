package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.monster.Speed;
import com.example.CampaignManager.modelDTO.monster.SpeedDTO;

public class SpeedMapper {
    public static Speed fromDTO(SpeedDTO dto) {

        if (dto == null) return null;

        Speed speed = new Speed();

        speed.setWalk(dto.getWalk());
        speed.setFly(dto.getFly());
        speed.setSwim(dto.getSwim());

        return speed;
    }
}
