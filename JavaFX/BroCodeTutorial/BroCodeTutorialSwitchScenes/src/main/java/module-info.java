module com.example.brocodetutorialswitchscenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodetutorialswitchscenes to javafx.fxml;
    exports com.example.brocodetutorialswitchscenes;
}