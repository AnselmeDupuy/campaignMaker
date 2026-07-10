package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DamageTypeDTO {

    private String index;
    private String name;
    private String url;

    public DamageTypeDTO() {}

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}