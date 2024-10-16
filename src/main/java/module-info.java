module com.afgdb.afgdbzugriff {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.afgdb.afgdbzugriff to javafx.fxml;
    exports com.afgdb.afgdbzugriff;
}