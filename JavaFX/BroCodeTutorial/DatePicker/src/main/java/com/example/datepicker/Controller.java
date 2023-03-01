package com.example.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    private DatePicker date;

    @FXML
    private Label lblDate;

    @FXML
    private Button btnReset;

    @FXML
    protected void datePicker(ActionEvent event) {
        LocalDate dateSelected = date.getValue();
        String formattedDate = dateSelected.format(DateTimeFormatter.ofPattern("ddMMMyyyy"));
        lblDate.setText("Date Selected: " + formattedDate);
        System.out.println(formattedDate);
    }

    @FXML
    protected void reset(ActionEvent event) {
        System.out.println("Reset");
        lblDate.setText("Select a Date");
        date.getEditor().clear();
    }
}