package com.example.CampaignManager.model.monster;

import java.util.ArrayList;
import java.util.List;

public class Speed {

    private String walk;
    private String swim;
    private String fly;
    private String climb;
    private String burrow;

    public Speed(){}

    //getter
    public String getBurrow() {return burrow;}

    public String getClimb() {return climb;}

    public String getFly() {return fly;}

    public String getSwim() {return swim;}

    public String getWalk() {return walk;}

    public List<String> getAllSpeeds() {
        List<String> speeds = new ArrayList<>();
        if (walk != null) {
            speeds.add("Walk: " + walk);
        }
        if (burrow != null) {
            speeds.add("Burrow: " + burrow);
        }
        if (swim != null) {
            speeds.add("Swim: " + swim);
        }
        if (climb != null) {
            speeds.add("Climb: " + climb);
        }
        if (fly != null) {
            speeds.add("Fly: " + fly);
        }

        return speeds;
    }

    //setters

    public void setBurrow(String burrow) {this.burrow = burrow;}

    public void setClimb(String climb) {this.climb = climb;}

    public void setFly(String fly) {this.fly = fly;}

    public void setSwim(String swim) {this.swim = swim;}

    public void setWalk(String walk) {this.walk = walk;}
}
