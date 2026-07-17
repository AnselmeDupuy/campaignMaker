package com.example.CampaignManager.services;

import com.example.CampaignManager.model.monster.Monster;
import com.example.CampaignManager.model.monster.SpecialAbility;
import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.repositories.SpellRepository;

import java.util.ArrayList;
import java.util.List;

public class MonsterService {

    private final SpellRepository spellRepository;

    public MonsterService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> getSpellsFromMonster(Monster monster) {
        List<Spell> spells = new ArrayList<>();

        if (monster == null || monster.getSpecialAbility() == null) {
            return spells;
        }

        for (SpecialAbility ability : monster.getSpecialAbility()) {

            if (!"Spellcasting".equalsIgnoreCase(ability.getName())) {
                continue;
            }

            if (ability.getSpell() == null) {
                continue;
            }

            for (String spellName : ability.getSpell()) {
                Spell spell = spellRepository.getSpellByName(spellName);

                if (spell != null) {
                    spells.add(spell);
                }
            }
        }

        return spells;
    }
}