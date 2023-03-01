module com.example.brocodetutorialcssstyling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodetutorialcssstyling to javafx.fxml;
    exports com.example.brocodetutorialcssstyling;
}