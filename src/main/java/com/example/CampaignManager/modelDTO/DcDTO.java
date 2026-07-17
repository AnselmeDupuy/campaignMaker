package com.example.CampaignManager.modelDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DcDTO {

    @JsonProperty("dc_type")
    private ApiReferenceDTO dcType;

    @JsonProperty("dc_value")
    private int dcValue;

    @JsonProperty("success_type")
    private String successType;

    @JsonProperty("dc_success")
    private String dcSuccess;

    public DcDTO() {}

    //Getter
    public ApiReferenceDTO getDcType() {
        return dcType;
    }

    public int getDcValue() {
        return dcValue;
    }

    public String getSuccessType() {
        return successType;
    }

    public String getDcSuccess() {return dcSuccess;}

    //Setter
    public void setDcType(ApiReferenceDTO dcType) {
        this.dcType = dcType;
    }

    public void setDcValue(int dcValue) {
        this.dcValue = dcValue;
    }

    public void setSuccessType(String successType) {
        this.successType = successType;
    }

    public void setDcSuccess(String dcSuccess) {this.dcSuccess = dcSuccess;}
}
