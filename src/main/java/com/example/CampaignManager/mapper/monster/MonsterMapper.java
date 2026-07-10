package com.example.CampaignManager.mapper.monster;

import com.example.CampaignManager.model.Monster;
import com.example.CampaignManager.modelDTO.monster.MonsterDTO;

public class MonsterMapper {
    public static Monster fromDTO(MonsterDTO dto){
        Monster monster = new Monster();

        if (dto == null) return null;

        monster.setName(dto.getName());
        monster.setType(dto.getType());
        monster.setSize(dto.getSize());
        monster.setAlignment(dto.getAlignment());
        monster.setHp(dto.getHitPoints());
        monster.setHitDiceRoll(dto.getHitPointsRoll());
        monster.setArmorClass(dto.getArmorClass().stream().map(ArmorMapper::fromDTO).toList());
        monster.setSpeed(SpeedMapper.fromDTO(dto.getSpeed()));
        monster.setStrength(dto.getStrength());
        monster.setDexterity(dto.getDexterity());
        monster.setConstitution(dto.getConstitution());
        monster.setIntelligence(dto.getIntelligence());
        monster.setWisdom(dto.getWisdom());
        monster.setCharisma(dto.getCharisma());
        monster.setProficiency(dto.getProficiencies().stream().map(ProficiencyMapper::fromDTO).toList());
        monster.setDamageResistance(dto.getDamageResistances());
        monster.setDamageImmunity(dto.getDamageImmunities());
        monster.setDamageVulnerability(dto.getDamageVulnerabilities());
        monster.setConditionImmunity(dto.getConditionImmunities().stream().map(ConditionMapper::fromDTO).toList());
        monster.setSense(SenseMapper.fromDTO(dto.getSenses()));
        monster.setLanguages(dto.getLanguages());
        monster.setChallengeRating(dto.getChallengeRating());
        if (dto.getActions() != null) {
            monster.setAction(dto.getActions().stream().map(ActionMapper::fromDTO).toList());
        }
        if (dto.getSpecialAbilities() != null) {
            monster.setSpecialAbility(dto.getSpecialAbilities().stream().map(SpecialAbilityMapper::fromDTO).toList());
        }

        return monster;
    }
}
