package com.example.radiobuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML
    private Label tfLabel;

    @FXML
    private RadioButton rbPizza;

    @FXML
    private RadioButton rbSoup;

    @FXML
    private RadioButton rbSalad;

    @FXML
    protected void mealSelection() {
        if(rbPizza.isSelected()){
            tfLabel.setText("You Chose Pizza!!");
        } else if(rbSoup.isSelected()) {
            tfLabel.setText("You Chose Soup!!");
        } else if(rbSalad.isSelected()){
            tfLabel.setText("You Chose Salad!!");
        } else {
            tfLabel.setText("Something went wrong!!");
        }
    }
}