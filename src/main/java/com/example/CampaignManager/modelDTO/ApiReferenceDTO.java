package com.example.CampaignManager.modelDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiReferenceDTO {

    private String index;
    private String name;
    private String url;

    public ApiReferenceDTO() {}

    //Getter
    public String getIndex() {
        return index;
    }

    public String getName() {return name;}

    public String getUrl() {
        return url;
    }

    //Setter
    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
