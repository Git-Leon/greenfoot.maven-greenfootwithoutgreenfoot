package com.github.git_leon.jfoot.actors;

import greenfoot.GreenfootImage;
import greenfoot.World;

public interface JFootActorInterface {
    void act();

    int getX() throws IllegalStateException;

    int getY();

    int getRotation();

    void setRotation(int rotation);

    void setLocation(int x, int y);

    World getWorld();

    GreenfootImage getImage();

    void setImage(String filename) throws IllegalArgumentException;

    void setImage(GreenfootImage image);
}
