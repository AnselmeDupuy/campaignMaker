package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellDTO {

    private String name;
    private int level;
    private String url;

    public SpellDTO() {}

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getUrl() {
        return url;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}