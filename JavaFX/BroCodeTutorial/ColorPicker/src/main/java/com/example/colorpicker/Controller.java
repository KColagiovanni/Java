package com.example.colorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Pane myPane;
    @FXML
    private ColorPicker colorPicker;

    @FXML
    public void changeColor(ActionEvent event) {
        Color chosenColor = colorPicker.getValue();
        System.out.println(chosenColor);
        myPane.setBackground(new Background(new BackgroundFill(chosenColor, null, null)));
    }
}