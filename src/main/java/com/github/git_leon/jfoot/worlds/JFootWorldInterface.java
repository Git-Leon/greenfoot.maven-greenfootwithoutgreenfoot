package com.github.git_leon.jfoot.worlds;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

import java.awt.*;
import java.util.Collection;
import java.util.List;

public interface JFootWorldInterface {
    void setBackground(GreenfootImage image);

    void setBackground(String filename) throws IllegalArgumentException;

    GreenfootImage getBackground();

    Color getColorAt(int x, int y);

    int getWidth();

    int getHeight();

    int getCellSize();

    void setPaintOrder(Class... classes);

    void setActOrder(Class... classes);

    void addObject(Actor object, int x, int y);

    void removeObject(Actor object);

    void removeObjects(Collection<Actor> objects);

    List getObjects(Class<Actor> cls);

    int numberOfObjects();

    void repaint();

    void act();

    void started();

    void stopped();

    List getObjectsAt(int x, int y, Class cls);
}
