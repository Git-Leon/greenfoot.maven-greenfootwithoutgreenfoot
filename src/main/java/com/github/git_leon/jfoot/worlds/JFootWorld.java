package com.github.git_leon.jfoot.worlds;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.awt.*;
import java.util.Collection;
import java.util.List;

public abstract class JFootWorld implements JFootWorldInterface {
    private final World world;

    public JFootWorld(int worldWidth, int worldHeight, int cellSize) {
        this.world = new World(worldWidth, worldHeight, cellSize) {};
    }

    @Override
    public final void setBackground(GreenfootImage image) {
        this.world.setBackground(image);
    }

    @Override
    public final void setBackground(String filename) throws IllegalArgumentException {
        this.world.setBackground(filename);
    }

    @Override
    public GreenfootImage getBackground() {
        return this.world.getBackground();
    }

    @Override
    public Color getColorAt(int x, int y) {
        return world.getColorAt(x, y);
    }

    @Override
    public int getWidth() {
        return world.getWidth();
    }

    @Override
    public int getHeight() {
        return world.getHeight();
    }

    @Override
    public int getCellSize() {
        return world.getCellSize();
    }

    @Override
    public void setPaintOrder(Class... classes) {
        world.setPaintOrder(classes);
    }

    @Override
    public void setActOrder(Class... classes) {
        world.setActOrder(classes);
    }

    @Override
    public void addObject(Actor object, int x, int y) {
        world.addObject(object, x, y);
    }


    @Override
    public void removeObject(Actor object) {
        world.removeObject(object);
    }

    @Override
    public void removeObjects(Collection<Actor> objects) {
        world.removeObjects(objects);
    }

    @Override
    public List getObjects(Class<Actor> cls) {
        return world.getObjects(cls);
    }

    @Override
    public int numberOfObjects() {
        return world.numberOfObjects();
    }

    @Override
    public void repaint() {
        world.repaint();
    }

    @Override
    public void act() {
        world.act();
    }

    @Override
    public void started() {
        world.started();
    }

    @Override
    public void stopped() {
        world.stopped();
    }

    @Override
    public List getObjectsAt(int x, int y, Class cls) {
        return world.getObjectsAt(x, y, cls);
    }
}