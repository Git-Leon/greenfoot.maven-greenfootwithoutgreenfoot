package com.github.git_leon.jfoot.worlds;

import com.github.git_leon.jfoot.actors.*;
import com.github.git_leon.jfoot.actors.buttons.ButtonAction;
import com.github.git_leon.jfoot.actors.buttons.Button;
import greenfoot.Greenfoot;
import greenfoot.World;

/**
 *
 */
public class MyWorld extends World {

    private Text text;
    private Home home;
    private Thug thug;
    private Schnapp schnapp;

    /**
     * Constructor for objects of class io.lerk.demo.worlds.MyWorld.
     */
    public MyWorld() {
        super(850, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * Z-Index is based on order of addition (last to be added is on top)
     */
    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        home = new Home();
        schnapp = new Schnapp();
        thug = new Thug();
        text = new Text();

        addObject(home, 425, 30);
        addObject(schnapp, 700, 500);
        addObject(thug, 50, 80);
        addObject(text, 400, 359);
    }

    /**
     * Called when the game is finished. Removes all active actors and display restart button.
     */
    public void endGame(boolean success) {
        if(success) {
            text.setImage("text-success.png");
            Greenfoot.playSound("success.wav");
        } else {
            text.setImage("text-failure.png");
            text.setLocation(text.getX() + 100, text.getY());
            Greenfoot.playSound("fail.wav");
        }

        removeObject(home);
        removeObject(schnapp);
        removeObject(thug);

        addObject(new Button(ButtonAction.RESTART, b -> {
            removeObject(b);
            removeObject(text);
            addObjects();
        }), 425, 100);
    }
}
