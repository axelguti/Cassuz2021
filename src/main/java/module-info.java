module com.example.ca {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires com.jfoenix;
    requires org.apache.poi.ooxml;


    opens com.example.ca.beans to javafx.fxml;
    opens com.example.ca to javafx.fxml;

    exports com.example.ca;
    exports com.example.ca.DTO;

}