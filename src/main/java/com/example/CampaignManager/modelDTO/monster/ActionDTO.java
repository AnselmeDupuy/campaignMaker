package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionDTO {

    private String name;
    private String desc;

    @JsonProperty("attack_bonus")
    private int attackBonus;

    @JsonProperty("multiattack_type")
    private String multiattackType;

    private List<ActionReferenceDTO> actions;

    private List<DamageDTO> damage;

    private DcDTO dc;

    private UsageDTO usage;

    public ActionDTO() {}

    //getters
    public String getName() {
        return name;
    }

    public DcDTO getDc() {
        return dc;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public List<ActionReferenceDTO> getActions() {
        return actions;
    }

    public List<DamageDTO> getDamage() {
        return damage;
    }

    public String getDesc() {
        return desc;
    }

    public String getMultiattackType() {
        return multiattackType;
    }

    public UsageDTO getUsage() {
        return usage;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setActions(List<ActionReferenceDTO> actions) {
        this.actions = actions;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setDamage(List<DamageDTO> damage) {
        this.damage = damage;
    }

    public void setDc(DcDTO dc) {
        this.dc = dc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setMultiattackType(String multiattackType) {
        this.multiattackType = multiattackType;
    }

    public void setUsage(UsageDTO usage) {this.usage = usage;}
}