package com.gametech.imagegallery;

import javafx.scene.image.Image;

import java.util.HashMap;


public class ImageHandler {
    private final HashMap<String, Image> images = new HashMap<>();

    private Image prev;
    private Image cur;
    private Image next;
    private int position;

    public HashMap<String, Image> getImages() {
        return images;
    }

    public Image getPrev() {
        return prev;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

    public Image getCur() {
        return cur;
    }

    public void setCur(Image cur) {
        this.cur = cur;
    }

    public Image getNext() {
        return next;
    }

    public void setNext(Image next) {
        this.next = next;
    }
}
