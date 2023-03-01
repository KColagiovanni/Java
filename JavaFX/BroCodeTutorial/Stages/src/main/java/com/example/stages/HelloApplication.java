package com.example.stages;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;

import java.io.IOException;

// Main(child) class inherits from Application(parent) class
public class HelloApplication extends Application {

    // main class to launch the app
    public static void main(String[] args) {

        // Calls the start method and passes in arguments that get passed to the main class
        launch(args);
    }

    // Start method to launch
    @Override
    public void start(Stage stage) throws Exception {

        // Create a new stage
        //Stage stage = new Stage()

        // Create a root group
        Group root = new Group();

        // Create a new scene, add the root node and color as parameters
        Scene scene = new Scene(root, Color.BLACK);

        // Define a window icon from an image that is in the src folder of the project
        Image icon = new Image("C:\\Users\\kcolagio\\OneDrive - JNJ\\Documents\\Java\\JavaFX\\BroCodeTutorial\\Stages\\src\\colors.png");
//        Image icon = new Image("colors.png");// Not working

        // Apply the icon
        stage.getIcons().add(icon);

        // Set the window title
        stage.setTitle("Stage Demo Program");

        // Set window width
        stage.setWidth(400);

        // Set window height
        stage.setHeight(400);

        // Define whether the window can be resized or not
        stage.setResizable(false);

        // Set the x location of where the window is displayed. Default is center of screen.
//        stage.setX(50);

        // Set the y location of where the window is displayed. Default is center of screen.
//        stage.setY(50);

        // Set the window to be displayed in full screen.
        stage.setFullScreen(true);

        // Define the full screen hint to override the default message.
        stage.setFullScreenExitHint("Press q to close the full screen");

        // Define the key that needs to be pressed to exit fullscreen. Default is Esc.
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        
        // Set the scene
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }
}