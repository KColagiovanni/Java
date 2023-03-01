package com.example.brocodetutoriallogout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("User Logout");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            try {
                logout(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void logout(Stage stage) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to be logged out");
        alert.setContentText("Do you want to save before exiting?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("User Logged Out");
            stage.close();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}