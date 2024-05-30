module org.example.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.modul6 to javafx.fxml;
    exports org.example.modul6;
    exports com.example.Modul6;
    opens com.example.Modul6 to javafx.fxml;
}