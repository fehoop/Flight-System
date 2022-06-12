package de.tum.nihaoshijie.flightsystem.client.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;

import de.tum.nihaoshijie.flightsystem.client.ClientApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class TripDashboardController {
    private String homeScenePath = "view/HomeScene.fxml";
    
    // the main Pane of this scene, control the change of scene
    @FXML
    private AnchorPane mainPane;
    
    @FXML
    private JFXButton backButton;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField departureCity;

    @FXML
    private TextField destination;

    @FXML
    private JFXButton flightList;


    @FXML
    private JFXTreeTableView<?> results;

    @FXML
    void getDate(ActionEvent event) {

    }

    @FXML
    void getDeparture(ActionEvent event) {

    }

    @FXML
    void getDestination(ActionEvent event) {

    }

    
    // handle the event when the client click back button, change the scene to HomeScene
    @FXML
    void goBack(ActionEvent event) {
        try {
            mainPane.getScene().setRoot(FXMLLoader.load(ClientApplication.class.getResource(homeScenePath)));
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }

    
    @FXML
    void showFlightList(ActionEvent event) {

    }

    @FXML
    void showFlights(ActionEvent event) {

    }

}
