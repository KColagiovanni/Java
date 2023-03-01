module com.example.brocodetutorialimageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodetutorialimageview to javafx.fxml;
    exports com.example.brocodetutorialimageview;
}