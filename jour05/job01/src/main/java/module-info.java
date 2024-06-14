module com.beginsecure.job01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.beginsecure.job01 to javafx.fxml;
    exports com.beginsecure.job01;
}