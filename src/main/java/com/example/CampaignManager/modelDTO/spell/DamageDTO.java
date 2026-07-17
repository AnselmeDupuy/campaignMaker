package com.example.CampaignManager.modelDTO.spell;

import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DamageDTO {

    @JsonProperty("damage_type")
    private ApiReferenceDTO damageType;

    @JsonProperty("damage_at_slot_level")
    private Map<String, String> damageAtSlotLevel;

    @JsonProperty("damage_at_character_level")
    private Map<String, String> damageAtCharacterLevel;

    //Getters
    public ApiReferenceDTO getDamageType() {return damageType;}

    public Map<String, String> getDamageAtSlotLevel() {return damageAtSlotLevel;}

    public Map<String, String> getDamageAtCharacterLevel() {return damageAtCharacterLevel;}

    //Setters

    public void setDamageType(ApiReferenceDTO damageType) {this.damageType = damageType;}

    public void setDamageAtSlotLevel(Map<String, String> damageAtSlotLevel) {
        this.damageAtSlotLevel = damageAtSlotLevel;
    }

    public void setDamageAtCharacterLevel(Map<String, String> damageAtCharacterLevel) {
        this.damageAtCharacterLevel = damageAtCharacterLevel;
    }
}