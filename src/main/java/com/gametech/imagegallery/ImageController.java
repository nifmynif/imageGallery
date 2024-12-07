package com.gametech.imagegallery;

import javafx.scene.image.Image;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class ImageController {
    private static ImageController imageController;
    public ImageHandler images;

    private ImageController() {
        this.images = new ImageHandler();
        initialize();
    }

    public static ImageController getImageController() {
        if (imageController == null)
            imageController = new ImageController();
        return imageController;
    }

    public void initialize() {
        File folder = new File("assets");
        Arrays.stream(Objects.requireNonNull(folder.listFiles()))
                .forEach(file -> {
                    try {
                        checkImage(file);
                        images.getImages().put(file.getName(), new Image(file.toURI().toURL().toExternalForm()));
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public void getImage(String fileName) {
        images.setCur(images.getImages().get(fileName));
    }

    private void checkImage(File file) throws IllegalArgumentException {
        String fileName = file.getName();
        if (!file.isFile() ||
                !file.exists())
            throw new IllegalArgumentException("Файл не существует или это не файл: " + fileName);

        if (!fileName.endsWith(".jpg") &&
                !fileName.endsWith(".jpeg") &&
                !fileName.endsWith(".png"))
            throw new IllegalArgumentException("Это не картинка: " + fileName);
    }
}
