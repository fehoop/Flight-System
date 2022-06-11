package de.tum.nihaoshijie.flightsystem.client.controller;


import java.io.IOException;


import de.tum.nihaoshijie.flightsystem.client.ClientApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class HomeSceneController {
    private String tripDashBoardPath = "view/TripDashBoardScene.fxml";
    private String surveyPath = "view/Survey.fxml";
    private String inFlightPath = "view/InFlight.fxml";
    
    // the main pane of this scene, control the change of scene
    @FXML
    private BorderPane clientApplication;

    @FXML
    private Button dashBoard;

    @FXML
    private Button inFlightSystem;

    @FXML
    private Button survey;
    
    @FXML
    private VBox vBoxLeft;

    //event when the client click TripDashboard button, change the scene to TripDashBoard
    @FXML
    void startDashBoard(ActionEvent event) {
        try {
            clientApplication.getScene().setRoot(FXMLLoader.load(ClientApplication.class.getResource(tripDashBoardPath)));
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
    //event when the client click InFlightSystem button, change the scene to InFlightSystem
    @FXML
    void startInFlightSystem(ActionEvent event) {
        try {
            clientApplication.getScene().setRoot(FXMLLoader.load(ClientApplication.class.getResource(inFlightPath)));
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
    //event when the client click Survey button, change the scene to Survey
    @FXML
    void startSurvey(ActionEvent event) {
        try {
            clientApplication.getScene().setRoot(FXMLLoader.load(ClientApplication.class.getResource(surveyPath)));
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
    
    public void initialize() {
        
    }

    
}
