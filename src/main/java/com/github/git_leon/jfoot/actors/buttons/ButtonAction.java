package com.github.git_leon.jfoot.actors.buttons;


import com.github.git_leon.jfoot.ResourceDirectory;

public enum ButtonAction {
    RESTART(ResourceDirectory.IMAGES + "restart.png");

    private final String image;

    ButtonAction(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}