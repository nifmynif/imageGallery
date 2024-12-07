package com.gametech.imagegallery;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainWindow {
    public TextField searchField;
    public Button searchButton;
    public ImageView prev;
    public ImageView cur;
    public ImageView next;

    @FXML
    public void initialize() {
        ImageController imageController = ImageController.getImageController();
        ImageHandler imageHandler = imageController.images;
        searchButton.setOnAction(event -> {
            imageController.getImage(searchField.getText());
            prev.setImage(imageHandler.getPrev());
            cur.setImage(imageHandler.getCur());
            next.setImage(imageHandler.getNext());
        });
    }
}