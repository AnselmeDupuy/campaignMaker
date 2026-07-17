package com.example.CampaignManager.repositories;

import com.example.CampaignManager.mapper.spell.SpellMapper;
import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.modelDTO.monster.MonsterDTO;
import com.example.CampaignManager.modelDTO.spell.SpellDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpellRepository {

    private final List<Spell> spells;
    private final Map<String, Spell> spellMap;

    public SpellRepository() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<SpellDTO> spellDTOs = mapper.readValue(
                    new File("src/main/ressources/dnd5data/spells.json"),
                    new TypeReference<>() {}
            );

            spells = spellDTOs.stream().map(SpellMapper::fromDTO).toList();

            spellMap = spells.stream().collect(Collectors.toMap(
                            spell -> spell.getName().toLowerCase(),
                            spell -> spell
                    ));

        } catch (IOException e) {
            throw new RuntimeException("Failed to load spells.json", e);
        }
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public Spell getSpellByName(String name) {
        return spellMap.get(name.toLowerCase());
    }
}