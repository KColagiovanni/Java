package com.example.verifyuserinput;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label welcomeLabel;

    @FXML
    private TextField tfAge;

    @FXML
    private Button btnVerify;

    int age;

    public void verify(ActionEvent event) {
        try {
            age = Integer.parseInt(tfAge.getText());
            tfAge.clear();

            if(age >= 18) {
                welcomeLabel.setText("You are Verified");
            } else {
                welcomeLabel.setText("You must be 18+");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter numbers only");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}