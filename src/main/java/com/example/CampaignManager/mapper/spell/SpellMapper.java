package com.example.CampaignManager.mapper.spell;

import com.example.CampaignManager.mapper.DifficultyClassMapper;
import com.example.CampaignManager.model.spell.Spell;
import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.example.CampaignManager.modelDTO.spell.SpellDTO;

public class SpellMapper {
    public static Spell fromDTO(SpellDTO dto) {
        Spell spell = new Spell();

        if (dto == null) return null;

        spell.setName(dto.getName());
        spell.setDescription(dto.getDescription());
        if (dto.getHigherLevel() != null){
            spell.setHigherLevel(dto.getHigherLevel());
        }
        spell.setRange(dto.getRange());
        spell.setComponents(dto.getComponents().stream().toList());
        spell.setMaterial(dto.getMaterial());
        spell.setRitual(dto.getRitual());
        spell.setConcentration(dto.getConcentration());
        spell.setDuration(dto.getDuration());
        spell.setCastingTime(dto.getCastingTime());
        spell.setLevel(dto.getLevel());
        if (dto.getDamage() != null) {
            spell.setDamage(DamageMapper.fromDTO(dto.getDamage()));
        }
        if (dto.getDc() != null) {
            spell.setDifficultyClass(DifficultyClassMapper.fromDTO(dto.getDc()));
        }
        spell.setAttackType(dto.getAttackType());
        spell.setAreaOfEffect(AreaOfEffectMapper.fromDTO(dto.getAreaOfEffect()));
        spell.setSchool(dto.getSchool().getName());
        if (dto.getClasses() != null){
        spell.setClasses(dto.getClasses().stream().map(ApiReferenceDTO::getName).toList());
        }
        if (dto.getSubclasses() != null) {
            spell.setSubClasses(dto.getSubclasses().stream().map(ApiReferenceDTO::getName).toList());
        }
        if (dto.getHealAtSlotLevel() != null) {
            spell.setHealAtSlotLevel(dto.getHealAtSlotLevel());
        }



        return spell;

    }
}
