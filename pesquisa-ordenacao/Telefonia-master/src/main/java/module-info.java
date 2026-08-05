module com.example.telefonia {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.telefonia to javafx.fxml;
    exports com.example.telefonia;
}