package com.gametech.imagegallery.controller;

import com.gametech.imagegallery.module.ImagesHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainWindowController {
    public TextField searchField;
    public Button searchButton;
    public ImageView prev;
    public ImageView cur;
    public ImageView next;
    public Button add;

    @FXML
    public void initialize() {
        ImageController imageController = new ImageController();
        ImagesHandler imagesHandler = imageController.getImage();
        searchButton.setOnAction(event -> {
            imageController.getImage(searchField.getText());
            prev.setImage(imagesHandler.getPrev().getImage());
            cur.setImage(imagesHandler.getCur().getImage());
            next.setImage(imagesHandler.getNext().getImage());
        });
    }
}