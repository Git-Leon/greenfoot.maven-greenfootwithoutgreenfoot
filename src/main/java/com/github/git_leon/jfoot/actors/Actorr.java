package com.github.git_leon.jfoot.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

public abstract class Actorr implements JFootActorInterface {

    private final Actor actor;

    public Actorr() {
        this.actor = new Actor(){};
    }

    @Override
    public void act() {
        actor.act();
    }

    @Override
    public int getX() throws IllegalStateException {
        return actor.getX();
    }

    @Override
    public int getY() {
        return actor.getY();
    }

    @Override
    public int getRotation() {
        return actor.getRotation();
    }

    @Override
    public void setRotation(int rotation) {
        actor.setRotation(rotation);
    }

    @Override
    public void setLocation(int x, int y) {
        actor.setLocation(x,y);
    }


    @Override
    public World getWorld() {
        return actor.getWorld();
    }

    @Override
    public GreenfootImage getImage() {
        return this.actor.getImage();
    }

    @Override
    public void setImage(String filename) throws IllegalArgumentException {
        actor.setImage(filename);
    }

    @Override
    public void setImage(GreenfootImage image) {
        actor.setImage(image);
    }
}
