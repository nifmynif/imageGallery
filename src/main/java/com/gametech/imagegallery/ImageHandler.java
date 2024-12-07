package com.gametech.imagegallery;

import javafx.scene.image.Image;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ImageHandler {

    private final HashMap<String, Image> images = new HashMap<>();

    private Image prev;
    private Image cur;
    private Image next;
    private int position;
}
