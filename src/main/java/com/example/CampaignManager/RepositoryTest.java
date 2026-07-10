package com.example.CampaignManager;

import com.example.CampaignManager.database.MonsterRepository;
import com.example.CampaignManager.model.*;
import com.example.CampaignManager.modelDTO.monster.ActionDTO;
import com.example.CampaignManager.modelDTO.monster.MonsterDTO;

import java.util.List;

public class RepositoryTest {

    public static void main(String[] args) {
        MonsterRepository repository = new MonsterRepository();

        Monster m = repository.getMonsters().get(0);
        List<Action> actions = m.getAction();
        List<Proficiency> proficiencies = m.getProficiency();
        List<SpecialAbility> specialAbilities = m.getSpecialAbility();
        int x = 0;


        System.out.println("=== MONSTER ===");
        System.out.println("Name: " + m.getName());
        System.out.println("HP: " + m.getHp());
        System.out.println("Size: " + m.getSize());
        System.out.println("Type: " + m.getType());
        System.out.println("DiceRoll: " + m.getHitDiceRoll());
        System.out.println("Alignment: " + m.getAlignment());
        System.out.println("STR: " + m.getStrength());
        System.out.println("DEX: " + m.getDexterity());
        System.out.println("CON: " + m.getConstitution());
        System.out.println("INT: " + m.getIntelligence());
        System.out.println("WIS: " + m.getWisdom());
        System.out.println("CHA: " + m.getCharisma());
        for (Action action : actions) {
            x++;
            System.out.println("Action: " + x);
            System.out.println(action.getDescription());
            if (action.getMultiAttack() != null){
                System.out.println("Multiattack: ");
            }
            List<ActionReference> subAction = action.getActionReference();
            if (subAction != null){
                for (ActionReference sub : subAction){
                    System.out.println(sub.getActionName());
                    System.out.println(sub.getType());
                    System.out.println(sub.getCount());
                }
            }
        }
        for (Proficiency proficiency : proficiencies){
            System.out.println("Proficiency " + proficiency.getName());
            System.out.println("value: " + proficiency.getValue());
            System.out.println();
        }
        for (SpecialAbility specialAbility : specialAbilities) {
            System.out.println("Special Abilities: " + specialAbility.getName());
            System.out.println(specialAbility.getDescription());
            if (specialAbility.getDifficultyClass() != null) {
                System.out.println("Proficiency Type : " + specialAbility.getDifficultyClass().getName());
                System.out.println("Proficiency DC: " + specialAbility.getDifficultyClass().getDcValue());
            }
            System.out.println();
        }
    }
}