module com.gametech.imagegallery {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires static lombok;

    opens com.gametech.imagegallery to javafx.fxml;
    exports com.gametech.imagegallery;
}