module com.example.midterm200474646 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.midterm200474646 to javafx.fxml;
    exports com.example.midterm200474646;
}