module com.example.brocodetutorialcommunicationbetweencontrollers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodetutorialcommunicationbetweencontrollers to javafx.fxml;
    exports com.example.brocodetutorialcommunicationbetweencontrollers;
}