package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArmorClassDTO {

    private String type;
    private int value;

    public ArmorClassDTO() {}

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}