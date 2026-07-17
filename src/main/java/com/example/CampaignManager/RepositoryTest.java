package com.example.CampaignManager;

import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.repositories.MonsterRepository;
import com.example.CampaignManager.model.monster.*;
import com.example.CampaignManager.repositories.SpellRepository;
import com.example.CampaignManager.services.MonsterService;

import java.util.List;

public class RepositoryTest {

    public static void main(String[] args) {
        MonsterRepository monsterRepository = new MonsterRepository();
        SpellRepository spellRepository = new SpellRepository();

        MonsterService monsterService = new MonsterService(spellRepository);


        Spell s = spellRepository.getSpells().get(3);
        Monster m = monsterRepository.getMonsters().get(1);

        Spell spellName = spellRepository.getSpellByName("sacred Flame");
//        System.out.println(spell.getName());

        System.out.println(m.getName());

        List<Spell> spells = monsterService.getSpellsFromMonster(m);
        for (Spell spell : spells) {
            System.out.println(spell.getName());
            System.out.println(spell.getDescription());
        }



//
//        List<Action> actions = m.getAction();
//        List<Proficiency> proficiencies = m.getProficiency();
//        List<SpecialAbility> specialAbilities = m.getSpecialAbility();
//        int x = 0;




//        System.out.println("=== MONSTER ===");
//        System.out.println("Name: " + m.getName());
//        System.out.println("HP: " + m.getHp());
//        System.out.println("Size: " + m.getSize());
//        System.out.println("Type: " + m.getType());
//        System.out.println("DiceRoll: " + m.getHitDiceRoll());
//        System.out.println("Alignment: " + m.getAlignment());
//        System.out.println("STR: " + m.getStrength());
//        System.out.println("DEX: " + m.getDexterity());
//        System.out.println("CON: " + m.getConstitution());
//        System.out.println("INT: " + m.getIntelligence());
//        System.out.println("WIS: " + m.getWisdom());
//        System.out.println("CHA: " + m.getCharisma());
//        System.out.println("Speed: " + m.getSpeed().getAllSpeeds());
//        System.out.println(("Sense: " + m.getSense().getAllSenses()));
//        for (Action action : actions) {
//            x++;
//            System.out.println("Action: " + x);
//            System.out.println(action.getDescription());
//            if (action.getMultiAttack() != null){
//                System.out.println("Multiattack: ");
//            }
//            List<ActionReference> subAction = action.getActionReference();
//            if (subAction != null){
//                for (ActionReference sub : subAction){
//                    System.out.println(sub.getActionName());
//                    System.out.println(sub.getType());
//                    System.out.println(sub.getCount());
//                }
//            }
//        }
//        for (Proficiency proficiency : proficiencies){
//            System.out.println("Proficiency " + proficiency.getName());
//            System.out.println("value: " + proficiency.getValue());
//            System.out.println();
//        }
//        for (SpecialAbility specialAbility : specialAbilities) {
//            System.out.println("Special Abilities: " + specialAbility.getName());
//            System.out.println(specialAbility.getDescription());
//            if (specialAbility.getDifficultyClass() != null) {
//                System.out.println("Proficiency Type : " + specialAbility.getDifficultyClass().getName());
//                System.out.println("Proficiency DC: " + specialAbility.getDifficultyClass().getDcValue());
//            }
//            System.out.println();
//        }
//        for (Action legendaryAction : m.getLegendaryAction()){
//            System.out.println("Legendary Action: " + legendaryAction.getName());
//        }
//
//        System.out.println("====== SPELL ======");
//        System.out.println();
//        System.out.println("Spell: " + s.getName());
//        System.out.println();
//        System.out.println("Description: ");
//        for (String description : s.getDescription()){
//            System.out.println(" - " + description);
//        }
//        System.out.println();
//        if (s.getHigherLevel() != null){
//            System.out.println("At Higher Level: ");
//            for (String level : s.getHigherLevel()){
//                System.out.println(" - " + level);
//            }
//        }
//        System.out.println();
//        System.out.println("Range: " + s.getRange());
//        if (s.getComponents() != null){
//            System.out.println("Components: ");
//            for (String component : s.getComponents()){
//                System.out.println(" - " + component);
//            }
//        }
//        System.out.println();
//
//        if (s.getMaterial() != null) {
//            System.out.println("Materials: " + s.getMaterial());
//        }
//        System.out.println("Ritual: " +s.getRitual());
//        System.out.println("Duration: " + s.getDuration());
//        System.out.println("Concentration: " + s.getConcentration());
//        System.out.println("Casting time: " + s.getCastingTime());
//        if (s.getDamage() != null) {
//            System.out.println("Damage: ");
//            if (s.getDamage().getDamageAtCharacterLevel() != null) {
//                System.out.println("Damage by character level: "
//                        + s.getDamage().getDamageAtCharacterLevel());
//            }
//
//            if (s.getDamage().getDamageAtSlotLevel() != null) {
//                System.out.println("Damage by slot level: "
//                        + s.getDamage().getDamageAtSlotLevel());
//            }
//
//            if (s.getDamage().getName() != null) {
//                System.out.println("Damage type: " + s.getDamage().getName());
//            }
//        }
//        System.out.println("Level: " + s.getLevel());
//
//        if (s.getDifficultyClass() != null) {
//            if (s.getDifficultyClass().getName() != null) {
//                System.out.println("Dc: " + s.getDifficultyClass().getName());
//            }
//            System.out.println(s.getDifficultyClass().getDcValue());
//
//            if (s.getDifficultyClass().getSuccessType() != null){
//                System.out.println(s.getDifficultyClass().getSuccessType());
//            }
//            if (s.getDifficultyClass().getDcSuccess() != null) {
//                System.out.println(s.getDifficultyClass().getDcSuccess());
//            }
//        }
//        if (s.getAttackType() != null) {
//            System.out.println("Attack type: " + s.getAttackType());
//        }
//        System.out.println("School: " + s.getSchool());
//        if (s.getHealAtSlotLevel() != null) {
//            System.out.println(s.getHealAtSlotLevel());
//        }
//        if (s.getAreaOfEffect() != null){
//            System.out.println("AoE Type: " + s.getAreaOfEffect().getType());
//            System.out.println("AoE Size: " + s.getAreaOfEffect().getSize());
//        }
//
//        System.out.println("Classes: " + s.getClasses());
//
//        if (s.getHealAtSlotLevel() != null){
//            System.out.println("Heal At Slot Level: " + s.getHealAtSlotLevel());
//        }
//
//
    }
}