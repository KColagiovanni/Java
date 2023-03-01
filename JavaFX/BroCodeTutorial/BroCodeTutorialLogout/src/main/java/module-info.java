module com.example.brocodetutoriallogout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodetutoriallogout to javafx.fxml;
    exports com.example.brocodetutoriallogout;
}