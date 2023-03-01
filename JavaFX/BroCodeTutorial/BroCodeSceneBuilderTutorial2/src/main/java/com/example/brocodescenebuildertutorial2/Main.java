package com.example.brocodescenebuildertutorial2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    private double r;

    public void up(ActionEvent actionEvent) {
        myCircle.setCenterY(y -= 5);
        System.out.println("Moving Up(X: " + x + ", Y: " + y + ")");
    }

    public void down(ActionEvent actionEvent) {
        myCircle.setCenterY(y += 5);
        System.out.println("Moving Down(X: " + x + ", Y: " + y + ")");
    }
    public void left(ActionEvent actionEvent) {
        myCircle.setCenterX(x -= 5);
        System.out.println("Moving Left(X: " + x + ", Y: " + y + ")");
    }

    public void right(ActionEvent actionEvent) {
        myCircle.setCenterX(x += 5);
        System.out.println("Moving Right(X: " + x + ", Y: " + y + ")");
    }

    public void reset(ActionEvent actionEvent) {
        x = 0;
        y = 0;
        r = 100;
        myCircle.setCenterX(x);
        myCircle.setCenterY(y);
        myCircle.setRadius(r);
        System.out.println("Reset(X: " + x + ", Y: " + y + ", Radius: " + r + ")");
    }
    public void smaller(ActionEvent actionEvent) {
        r = myCircle.getRadius();
        myCircle.setRadius(r -= 1);
        System.out.println("Smaller(Radius: " + r + ")");
    }
    public void bigger(ActionEvent actionEvent) {
        r = myCircle.getRadius();
        myCircle.setRadius(r += 1);
        System.out.println("Bigger(Radius: " + r + ")");
    }

    public void upLeft(ActionEvent actionEvent) {
        myCircle.setCenterX(x -= 5);
        myCircle.setCenterY(y -= 5);
        System.out.println("Moving Up and Left(X: " + x + ", Y: " + y + ")");
    }
    public void upRight(ActionEvent actionEvent) {
        myCircle.setCenterX(x += 5);
        myCircle.setCenterY(y -= 5);
        System.out.println("Moving Up and Right(X: " + x + ", Y: " + y + ")");
    }
    public void downLeft(ActionEvent actionEvent) {
        myCircle.setCenterX(x -= 5);
        myCircle.setCenterY(y += 5);
        System.out.println("Moving Down and Left(X: " + x + ", Y: " + y + ")");
    }
    public void downRight(ActionEvent actionEvent) {
        myCircle.setCenterX(x += 5);
        myCircle.setCenterY(y += 5);
        System.out.println("Moving Down and Right(X: " + x + ", Y: " + y + ")");
    }

    public void quitProgram(ActionEvent actionEvent) {
        System.out.println("Bye!!");
        Platform.exit();
    }
}