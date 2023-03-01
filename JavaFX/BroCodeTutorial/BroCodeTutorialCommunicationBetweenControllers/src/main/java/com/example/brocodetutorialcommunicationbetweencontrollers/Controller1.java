package com.example.brocodetutorialcommunicationbetweencontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void login(ActionEvent event) throws IOException {

        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main2.fxml"));

        root = loader.load();

        Controller2 controller2 = loader.getController();

        controller2.displayName(username);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}