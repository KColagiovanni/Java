module com.example.verifyuserinput {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.verifyuserinput to javafx.fxml;
    exports com.example.verifyuserinput;
}