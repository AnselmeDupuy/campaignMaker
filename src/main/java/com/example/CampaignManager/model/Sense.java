package com.example.CampaignManager.model;

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

    //setters
    public void setBlindSight(String blindSight) {this.blindSight = blindSight;}

    public void setDarkVision(String darkVision) {this.darkVision = darkVision;}

    public void setTremorSense(String tremorSense) {this.tremorSense = tremorSense;}

    public void setTrueSight(String trueSight) {this.trueSight = trueSight;}

    public void setPassivePerception(int passivePerception) {this.passivePerception = passivePerception;}
}
