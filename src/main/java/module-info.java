module org.svalero.imageeditor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.svalero.imageeditor to javafx.fxml;
    exports org.svalero.imageeditor;
}