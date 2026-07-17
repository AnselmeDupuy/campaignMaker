package com.example.CampaignManager.modelDTO.monster;

import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DamageDTO {

    @JsonProperty("damage_type")
    private ApiReferenceDTO damageType;

    @JsonProperty("damage_dice")
    private String damageDice;

    public DamageDTO() {}

    public ApiReferenceDTO getDamageType() {
        return damageType;
    }

    public String getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(String damageDice) {
        this.damageDice = damageDice;
    }

    public void setDamageType(ApiReferenceDTO damageType) {
        this.damageType = damageType;
    }
}