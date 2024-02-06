module com.example.test_type01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_type01 to javafx.fxml;
    exports com.example.test_type01;
}