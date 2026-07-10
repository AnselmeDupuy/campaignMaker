package com.example.CampaignManager.modelDTO.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpeedDTO {

    private String walk;
    private String fly;
    private String swim;
    private String climb;
    private String burrow;

    public SpeedDTO() {}

    public String getWalk() {
        return walk;
    }

    public String getSwim() {
        return swim;
    }

    public String getFly() {
        return fly;
    }

    public String getClimb() {
        return climb;
    }

    public String getBurrow() {
        return burrow;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public void setClimb(String climb) {
        this.climb = climb;
    }

    public void setBurrow(String burrow) {
        this.burrow = burrow;
    }
}