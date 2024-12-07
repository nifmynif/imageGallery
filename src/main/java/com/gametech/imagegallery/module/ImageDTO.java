package com.gametech.imagegallery.module;

import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ImageDTO {
    private String name;
    private Image image;
}
