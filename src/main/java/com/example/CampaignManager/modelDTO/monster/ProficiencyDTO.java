package com.example.CampaignManager.modelDTO.monster;

public class ProficiencyDTO {

    private String index;
    private String name;
    private String url;

    public ProficiencyDTO() {}

    public String getUrl() {
        return url;
    }

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }
}