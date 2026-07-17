package com.example.CampaignManager.modelDTO.spell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AreaOfEffectDTO {

    private String type;
    private int size;

    // getters


    public String getType() {return type;}

    public int getSize() {return size;}

    //Setters

    public void setType(String type) {this.type = type;}

    public void setSize(int size) {this.size = size;}
}