package com.github.git_leon.jfoot;

import greenfoot.GreenfootImage;

public class ResourceImage extends GreenfootImage {
    public ResourceImage(String filename) throws IllegalArgumentException {
        super(filename);
    }

    public ResourceImage(int width, int height) {
        super(width, height);
    }

    public ResourceImage(GreenfootImage image) throws IllegalArgumentException {
        super(image);
    }
}
