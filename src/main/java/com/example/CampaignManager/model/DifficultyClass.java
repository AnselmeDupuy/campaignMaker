package com.example.CampaignManager.model;

public class DifficultyClass {

    private String name;
    private int dcValue;
    private String successType;

    public DifficultyClass() {}

    //getters
    public String getName() {return name;}

    public int getDcValue() {return dcValue;}

    public String getSuccessType() {return successType;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setDcValue(int dcValue) {this.dcValue = dcValue;}

    public void setSuccessType(String successType) {this.successType = successType;}
}
