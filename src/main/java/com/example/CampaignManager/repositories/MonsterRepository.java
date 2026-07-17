package com.example.CampaignManager.repositories;

import com.example.CampaignManager.mapper.monster.MonsterMapper;
import com.example.CampaignManager.model.monster.Monster;
import com.example.CampaignManager.model.monster.SpecialAbility;
import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.modelDTO.monster.MonsterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MonsterRepository {
    private final List<Monster> monsters;
    private final Map<String, Monster> monsterMap;

    public MonsterRepository() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<MonsterDTO> monsterDTOs = mapper.readValue(
                    new File("src/main/ressources/dnd5data/monsters.json"),
                    new TypeReference<>() {}
            );

            monsters = monsterDTOs.stream().map(MonsterMapper::fromDTO).toList();
            monsterMap = monsters.stream().collect(Collectors.toMap(
                    monster -> monster.getName().toLowerCase(),
                    monster -> monster
            ));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load monsters.json", e);
        }

    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public Monster getMonsterByName(String name){
        return monsterMap.get(name.toLowerCase());
    }


}
