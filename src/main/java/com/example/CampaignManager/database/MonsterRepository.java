package com.example.CampaignManager.database;

import com.example.CampaignManager.mapper.monster.MonsterMapper;
import com.example.CampaignManager.model.Monster;
import com.example.CampaignManager.modelDTO.monster.MonsterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class MonsterRepository {
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Monster> getMonsters() {
        try {
            List<MonsterDTO> monsterDTOS = mapper.readValue(
                    new File("src/main/resources/dnd5data/monsters.json"),
                    new TypeReference<List<MonsterDTO>>() {}
            );

            return  monsterDTOS.stream().map(MonsterMapper::fromDTO).toList();

        } catch (IOException e) {
            throw new RuntimeException("Failed to load monsters.json", e);
        }
    }

}
