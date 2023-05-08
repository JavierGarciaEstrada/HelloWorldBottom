module com.example.helloworldbottom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldbottom to javafx.fxml;
    exports com.example.helloworldbottom;
}