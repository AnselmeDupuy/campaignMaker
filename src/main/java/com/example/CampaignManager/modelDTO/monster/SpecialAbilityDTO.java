package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecialAbilityDTO {

    private String name;
    private String desc;

    // For abilities like Mucous Cloud / Enslave / Frightful Presence
    private DcDTO dc;

    // For Spellcasting block (very nested + variable)
    private SpellcastingDTO spellcasting;

    // Some abilities include usage limits (like per day)
    private UsageDTO usage;

    public SpecialAbilityDTO() {}

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public DcDTO getDc() {
        return dc;
    }

    public SpellcastingDTO getSpellcasting() {
        return spellcasting;
    }

    public UsageDTO getUsage() {
        return usage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setUsage(UsageDTO usage) {
        this.usage = usage;
    }

    public void setDc(DcDTO dc) {
        this.dc = dc;
    }

    public void setSpellcasting(SpellcastingDTO spellcasting) {
        this.spellcasting = spellcasting;
    }
}