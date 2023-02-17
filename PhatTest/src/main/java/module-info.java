module com.mycompany.phattest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.phattest to javafx.fxml;
    exports com.mycompany.phattest;
}
