package com.github.git_leon.jfoot.actors.buttons;


import com.github.git_leon.jfoot.ResourceDirectory;
import greenfoot.GreenfootImage;

public enum ButtonAction {
    RESTART(ResourceDirectory.IMAGES + "restart.png");

    private final String image;

    ButtonAction(String image) {
        this.image = image;
    }

    public GreenfootImage getImage() {
        return new GreenfootImage(image);
    }
}