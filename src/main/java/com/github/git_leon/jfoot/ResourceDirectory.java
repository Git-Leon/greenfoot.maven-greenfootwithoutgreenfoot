package com.github.git_leon.jfoot;

import greenfoot.GreenfootImage;

import java.io.File;

public enum ResourceDirectory {
    IMAGES("images/");

    private final File directory;

    ResourceDirectory(String directoryPath) {
        String resourceDirectory = System.getProperty("user.dir") + "/src/main/resources/";
        this.directory = new File(resourceDirectory + directoryPath);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory.getAbsolutePath() + " is not a directory.");
        }
    }

    public GreenfootImage getImage(String imageName) {
        return new GreenfootImage(toString() + imageName);
    }

    public File getDirectory() {
        return directory;
    }

    @Override
    public String toString() {
        return directory.getAbsolutePath() + "/";
    }
}
