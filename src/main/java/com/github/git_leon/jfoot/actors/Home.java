package com.github.git_leon.jfoot.actors;

import com.github.git_leon.jfoot.ResourceDirectory;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Home extends Actor {
    public Home() {
        String currentDirectory = System.getProperty("user.dir");
        setImage(ResourceDirectory.IMAGES + "house.png");
    }
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act()
    {
    }
}

