package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SenseDTO {

    private String blindsight;
    private String darkvision;
    private String tremorsense;
    private String truesight;

    @JsonProperty("passive_perception")
    private int passivePerception;

    public SenseDTO() {}

    public int getPassivePerception() {
        return passivePerception;
    }

    public String getBlindsight() {
        return blindsight;
    }

    public String getDarkvision() {
        return darkvision;
    }

    public String getTremorsense() {
        return tremorsense;
    }

    public String getTruesight() {
        return truesight;
    }

    public void setBlindsight(String blindsight) {
        this.blindsight = blindsight;
    }

    public void setDarkvision(String darkvision) {
        this.darkvision = darkvision;
    }

    public void setPassivePerception(int passivePerception) {
        this.passivePerception = passivePerception;
    }

    public void setTremorsense(String tremorsense) {
        this.tremorsense = tremorsense;
    }

    public void setTruesight(String truesight) {
        this.truesight = truesight;
    }
}