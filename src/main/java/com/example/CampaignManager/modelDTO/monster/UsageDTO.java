package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsageDTO {

    private String type;
    private Integer times;

    private String dice;

    @JsonProperty("min_value")
    private Integer minValue;

    public UsageDTO() {}

    public String getType() {
        return type;
    }

    public Integer getTimes() {
        return times;
    }

    public String getDice() {
        return dice;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}