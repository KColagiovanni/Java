module com.example.scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenes to javafx.fxml;
    exports com.example.scenes;
}