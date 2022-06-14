package de.tum.nihaoshijie.flightsystem.client;


import java.util.Optional;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ClientApplication extends Application{
    //all ViewController in the whole flight system
    private Stage stage;
    private String homeScenePath = "/clientview/fxmls/HomeScene.fxml";
    @Override
    public void start(Stage primaryStage) throws Exception {
        //load homescene fxml file 
        Parent homesceneroot = FXMLLoader.load(getClass().getResource(homeScenePath));
        
        // set this stage as primarystage
        this.stage = primaryStage;
        
        //set stage unresizeable
        primaryStage.setResizable(false);
        //settitle
        System.out.println("Flight System start!");
        primaryStage.setTitle("Flight System - NHSJ");
        
        //set Icon with file path
        Image image = new Image(getClass().getResourceAsStream("/clientview/resource/Icon.png"));
        primaryStage.getIcons().add(image);
        
        //set homeScene with fxml file
        primaryStage.setScene(new Scene(homesceneroot));
        primaryStage.show();


        //replace the default Exit event
        Platform.setImplicitExit(false);
        
        //set the new event, when the user click quit button
        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Exit");
            alert.setHeaderText(null);
            alert.setContentText("Do you really want to exit NHSJ flight system? ");
            
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                //programm exit
                Platform.exit();
                //only the stage close, programm still work
                //primaryStage.close();
            }
        });
        
    }

}
