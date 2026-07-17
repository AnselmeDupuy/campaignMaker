package com.example.CampaignManager.model.monster;

import java.util.ArrayList;
import java.util.List;

public class Sense {
    private String blindSight;
    private String darkVision;
    private String tremorSense;
    private String trueSight;
    private int passivePerception;

    public Sense(){}

    //getters
    public String getBlindSight() {return blindSight;}

    public String getDarkVision() {return darkVision;}

    public String getTremorSense() {return tremorSense;}

    public String getTrueSight() {return trueSight;}

    public int getPassivePerception() {return passivePerception;}

    public List<String> getAllSenses() {
        List<String> senses = new ArrayList<>();

        senses.add("Passive Perception: " + passivePerception);

        if (blindSight != null) {
            senses.add("Blindsight: " + blindSight);
        }
        if (darkVision != null) {
            senses.add("Darkvision: " + darkVision);
        }
        if (tremorSense != null) {
            senses.add("Tremorsense: " + tremorSense);
        }
        if (trueSight != null) {
            senses.add("Truesight: " + trueSight);
        }

        return senses;
    }

    //setters
    public void setBlindSight(String blindSight) {this.blindSight = blindSight;}

    public void setDarkVision(String darkVision) {this.darkVision = darkVision;}

    public void setTremorSense(String tremorSense) {this.tremorSense = tremorSense;}

    public void setTrueSight(String trueSight) {this.trueSight = trueSight;}

    public void setPassivePerception(int passivePerception) {this.passivePerception = passivePerception;}
}
