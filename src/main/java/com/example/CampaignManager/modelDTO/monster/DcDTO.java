package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DcDTO {

    @JsonProperty("dc_type")
    private AbilityDTO dcType;

    @JsonProperty("dc_value")
    private int dcValue;

    @JsonProperty("success_type")
    private String successType;

    public DcDTO() {}

    public AbilityDTO getDcType() {
        return dcType;
    }

    public int getDcValue() {
        return dcValue;
    }

    public String getSuccessType() {
        return successType;
    }

    public void setDcType(AbilityDTO dcType) {
        this.dcType = dcType;
    }

    public void setDcValue(int dcValue) {
        this.dcValue = dcValue;
    }

    public void setSuccessType(String successType) {
        this.successType = successType;
    }
}
