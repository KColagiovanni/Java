module com.example.brocodescenebuildertutorial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodescenebuildertutorial2 to javafx.fxml;
    exports com.example.brocodescenebuildertutorial2;
}