module com.beginsecure.job02 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.beginsecure.job02 to javafx.fxml;
    exports com.beginsecure.job02;
}