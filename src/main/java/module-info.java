module com.ivytech.gominotes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ivytech.gominotes to javafx.fxml;
    exports com.ivytech.gominotes;
}