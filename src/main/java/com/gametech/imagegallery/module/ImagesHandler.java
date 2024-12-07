package com.gametech.imagegallery.module;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ImagesHandler {

    private final ArrayList<ImageDTO> images = new ArrayList<>();

    private ImageDTO prev;
    private ImageDTO cur;
    private ImageDTO next;
}
