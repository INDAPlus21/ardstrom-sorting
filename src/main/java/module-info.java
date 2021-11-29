module com.example.ardstromsorting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ardstromsorting to javafx.fxml;
    exports com.example.ardstromsorting;
}