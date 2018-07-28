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


    private Home home;

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


        addObject(home, 425, 30);

    }

    /**
     * Called when the game is finished. Removes all active actors and display restart button.
     */
    public void endGame(boolean success) {
        if (success) {

            Greenfoot.playSound("success.wav");
        } else {

            Greenfoot.playSound("fail.wav");
        }

        removeObject(home);

        addObject(new Button(ButtonAction.RESTART, b -> {
            removeObject(b);
            addObjects();
        }), 425, 100);
    }
}
