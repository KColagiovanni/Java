package com.example.brocodetutorialimageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    ImageView myImageView;
    Button myButton;

    Image myIMage = new Image(getClass().getResourceAsStream("test_scope_wbg.jpg"));

    public void displayMyImage() {
        myImageView.setImage(myIMage);
    }
}