package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionReferenceDTO {

    @JsonProperty("action_name")
    private String actionName;

    private String count;
    private String type;

    public ActionReferenceDTO() {}

    public String getActionName() {
        return actionName;
    }

    public String getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setCount(String count) {
        this.count = count;
    }
}