package com.github.git_leon.jfoot.actors.buttons;

import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 * @author Lukas Fülling (lukas@k40s.net)
 */
public class Button extends Actor {
    private final ButtonAction action;
    private final OnClickListener onClickListener;

    public Button(ButtonAction action, OnClickListener onClickListener) {
        this.action = action;
        this.onClickListener = onClickListener;

        setImage(action.getImage());
    }

    @Override
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            onClickListener.click(this);
        }
    }
}
