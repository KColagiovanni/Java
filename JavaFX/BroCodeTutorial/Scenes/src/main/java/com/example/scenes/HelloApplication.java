package com.example.scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        Scene scene = new Scene(root, 600, 600, Color.DEEPSKYBLUE);

        //~~~~~~~~~~~~~~~~~~~~ Text ~~~~~~~~~~~~~~~~~~~~//

        // Add text to the scene
        Text text = new Text();

        // Set the text
        text.setText("This is some text!!!");

        // Define the location of the text in the scene
        text.setY(50);
        text.setX(50);

        // Set font size
        text.setFont(Font.font("Verdana", 50));

        // Set the text color
        text.setFill(Color.DARKRED);

        // Add the text to the root node
        root.getChildren().add(text);

        //~~~~~~~~~~~~~~~~~~~~ Line ~~~~~~~~~~~~~~~~~~~~//

        // Add a line to the scene
        Line line = new Line();

        // Set the start and end x/y values of the line
        line.setStartX(100);
        line.setEndX(500);
        line.setStartY(200);
        line.setEndY(200);

        // Set the line thickness
        line.setStrokeWidth(5);

        // Set line color
        line.setStroke(Color.DARKGREEN);

        // Set the line opacity
        line.setOpacity(0.5);

        // Rotate the line, in degrees
//        line.setRotate(45);

        // Add the line to the root node
        root.getChildren().add(line);

        //~~~~~~~~~~~~~~~~~~~~ Rectangle ~~~~~~~~~~~~~~~~~~~~//

        // Add a rectangle to the scene
        Rectangle rectangle = new Rectangle();

        // Set the location of the rectangle
        rectangle.setX(100);
        rectangle.setY(80);

        // Set the size of the rectangle
        rectangle.setWidth(100);
        rectangle.setHeight(100);

        // Set the color of the rectangle
        rectangle.setFill(Color.HOTPINK);

        // Set the stroke/border width
        rectangle.setStrokeWidth(5);

        // Set the stroke/border color
        rectangle.setStroke(Color.YELLOWGREEN);

        // Add the rectangle to the root node
        root.getChildren().add(rectangle);

        //~~~~~~~~~~~~~~~~~~~~ Triangle ~~~~~~~~~~~~~~~~~~~~//

        // Add a triangle to the scene
        Polygon triangle = new Polygon();

        // Set the polygon/triangle location points
        triangle.getPoints().setAll(
                200.0, 220.0,
                300.0, 320.0,
                200.0, 320.0
        );

        // Set the color of the triangle
        triangle.setFill(Color.PEACHPUFF);

        // Set the stroke/border width
        triangle.setStrokeWidth(5);

        // Set the stroke/border color
        triangle.setStroke(Color.MEDIUMAQUAMARINE);

        // Add the triangle to the root node
        root.getChildren().add(triangle);

        //~~~~~~~~~~~~~~~~~~~~ Circle ~~~~~~~~~~~~~~~~~~~~//

        // Add a circle to the scene
        Circle circle = new Circle();

        // Set the circle center x and y location points
        circle.setCenterX(360);
        circle.setCenterY(360);

        // Set the circle radius
        circle.setRadius(50);

        // Set the color of the circle
        circle.setFill(Color.ORANGERED);

        // Set the stroke/border width
        circle.setStrokeWidth(5);

        // Set the stroke/border color
        circle.setStroke(Color.BLACK);

        // Add the circle to the root node
        root.getChildren().add(circle);

        //~~~~~~~~~~~~~~~~~~~~ Image ~~~~~~~~~~~~~~~~~~~~//

        // Add a rectangle to the scene
        Image image = new Image("C:\\Users\\kcolagio\\OneDrive - JNJ\\Documents\\Java\\JavaFX\\BroCodeTutorial\\Scenes\\src\\RainbowOfColors.jpg");

        // Create an image view object
        ImageView imageView = new ImageView(image);

        // Set the x and y location
        imageView.setX(100);
        imageView.setY(450);

        // Set the width and height of the image
        imageView.setFitWidth(400);
        imageView.setFitHeight(100);

        // Add the imageView to the root node
        root.getChildren().add(imageView);

        // Define a window icon from an image that is in the src folder of the project
        Image icon = new Image("C:\\Users\\kcolagio\\OneDrive - JNJ\\Documents\\Java\\JavaFX\\BroCodeTutorial\\Stages\\src\\colors.png");

        // Apply the icon
        stage.getIcons().add(icon);

        // Set the window title
        stage.setTitle("Scene Demo Program");

        // Set the scene
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }
}