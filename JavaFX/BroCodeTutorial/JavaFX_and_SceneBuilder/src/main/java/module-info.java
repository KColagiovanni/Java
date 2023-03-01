module com.example.javafx_and_scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_and_scenebuilder to javafx.fxml;
    exports com.example.javafx_and_scenebuilder;
}