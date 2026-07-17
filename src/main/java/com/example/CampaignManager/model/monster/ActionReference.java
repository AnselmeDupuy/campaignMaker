package com.example.CampaignManager.model.monster;

public class ActionReference {
    private String actionName;
    private String count;
    private String type;

    public ActionReference(){}

    //getters
    public String getActionName() {return actionName;}

    public String getCount() {return count;}

    public String getType() {return type;}

    //setters
    public void setActionName(String actionName) {this.actionName = actionName;}

    public void setCount(String count) {this.count = count;}

    public void setType(String type) {this.type = type;}
}
