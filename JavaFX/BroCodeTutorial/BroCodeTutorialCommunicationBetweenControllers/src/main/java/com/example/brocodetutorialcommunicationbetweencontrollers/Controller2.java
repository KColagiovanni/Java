package com.example.brocodetutorialcommunicationbetweencontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller2 {
    @FXML
    Label nameLabel;

    public void displayName(String username) {
        nameLabel.setText("Welcome " + username);
    }
}
