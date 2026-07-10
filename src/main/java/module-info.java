module com.example.CampaignManager {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;

    requires com.fasterxml.jackson.databind;

    opens com.example.CampaignManager.controller to javafx.fxml;

    exports com.example.CampaignManager;
    exports com.example.CampaignManager.model;
    exports com.example.CampaignManager.modelDTO.monster;
}