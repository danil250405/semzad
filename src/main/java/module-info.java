module com.example.semestralnezadanie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.semestralnezadanie to javafx.fxml;
    exports com.example.semestralnezadanie;
}