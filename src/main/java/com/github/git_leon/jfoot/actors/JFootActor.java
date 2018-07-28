package com.github.git_leon.jfoot.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.util.List;

public class JFootActor extends Actor implements JFootActorInterface {

    public void faceObject(JFootActorInterface obj) {
        if (obj != null) {
            int deltaX = obj.getX() - getX();
            int deltaY = obj.getY() - getY();
            setRotation((int) (180 * Math.atan2(deltaY, deltaX) / Math.PI));
        } else {
            return;
        }
    }

    public boolean atWorldEdge(int offset) {
        return atWorldEdge(offset, offset);
    }


    public boolean atWorldEdge(int x, int y) {
        if (getX() < x || getX() > getWorld().getWidth() - x)
            return true;
        return getY() < y || getY() > getWorld().getHeight() - y;
    }

    public void turnAtEdge(int edgeOffset, int degree) {
        if (atWorldEdge(edgeOffset)) {
            turn(degree);
        }
    }

    public JFootActorInterface faceNearest(Class cls, int radius) {
        JFootActorInterface actor = getNearest(cls, radius);
        faceObject(actor);


        return actor;
    }

    public Actor getNearest(Class<JFootActorInterface> cls, int radius) {
        List<JFootActorInterface> nearestActors = this.getJFootWorld().getObjects(cls);
        Actor nearestActor = null;
        Double nearestDistance = null;
        double distance;
        int size = nearestActors.size();
        for (int i = 0; i < size; i++) {
            distance = getDistance(nearestActors.get(i));
            if (i == 0) {
                nearestDistance = distance;
            }
            if (distance < nearestDistance) {
                nearestActor = nearestActors.get(i);
                nearestDistance = distance;
            }
        }
        return nearestActor;
    }

    public World getJFootWorld() {
        return getWorld();
    }

    public List<Object> getObjectsInRange(Class cls, int radius) {
        return getObjectsInRange(radius, cls);
    }

    public double getDistance(Actor actor) {
        return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
    }

    public Actor addObject(Actor actor, int x, int y) {
        getWorld().addObject(actor, x, y);
        return actor;
    }

    public void rescale(double xRatio, double yRatio, GreenfootImage... images) { //rescale image sizes
        for (GreenfootImage image : images) {
            double width = image.getWidth();
            double height = image.getHeight();

            double x = width * xRatio;
            double y = height * yRatio;

            int xInt = (int) Math.floor(x);
            int yInt = (int) Math.floor(y);
            image.scale(xInt, yInt);
        }
    }


    public Actor getOneObjectAtOffset(int x, int y, Class... classes) {
        for (Class cls : classes)
            return getOneObjectAtOffset(x, y, cls);
        return null;
    }

    public boolean noseContact(Class cls) {
        return touchingNose(cls) != null;
    }

    public boolean noseContact(Class cls, int xOffset, int yOffset) {
        return touchingNose(cls, xOffset, yOffset) != null;
    }

    public Actor touchingNose(Class cls) {
        int imageWidth = (this.getImage().getWidth());
        int imageHeight = (this.getImage().getHeight());
        int offset = imageWidth > imageHeight ? imageWidth : imageHeight;

        return touchingNose(cls, offset / 2);
    }

    public Actor touchingNose(Class cls, int offset) {
        return touchingNose(cls, offset, offset);
    }

    public Actor touchingNose(Class cls, int xOffset, int yOffset) {
        int deltaX = (int) Math.round((Math.cos(getRotation() * Math.PI / 180)));
        int deltaY = (int) Math.round((Math.sin(getRotation() * Math.PI / 180)));
        int x = xOffset * deltaX;
        int y = yOffset * deltaY;
        Actor actor = getOneObjectAtOffset(x, y, cls);

        return actor;
    }

    public Actor getObjectAtOffset(int x, int y, Class cls) {
        return getOneObjectAtOffset(x, y, cls);
    }

    private Actor getObjectAtOffset(int offset, int degrees) {
        turn(degrees);
        int x = offset * (int) Math.round((Math.cos(getRotation() * Math.PI / 180)));
        int y = offset * (int) Math.round((Math.sin(getRotation() * Math.PI / 180)));
        Actor actor = getOneObjectAtOffset(x, y, Actor.class);
        turn(360 - degrees);
        return actor;
    }
}
