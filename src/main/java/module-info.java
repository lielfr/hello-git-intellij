module il.ac.haifa.sweng {
    requires javafx.controls;
    requires javafx.fxml;

    opens il.ac.haifa.sweng to javafx.fxml;
    exports il.ac.haifa.sweng;
}