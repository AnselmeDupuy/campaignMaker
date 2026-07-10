package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectIdDTO {

    @JsonProperty("$oid")
    private String oid;

    public ObjectIdDTO() {}

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}