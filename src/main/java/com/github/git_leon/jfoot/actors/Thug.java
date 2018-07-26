package com.github.git_leon.jfoot.actors;

import com.github.git_leon.jfoot.worlds.MyWorld;
import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Thug extends Actor
{

  public Thug()
  {
    getImage().scale(87, 156);
  }

  @Override
  public void act()
  {
    if (Greenfoot.isKeyDown("w")) {
      setLocation(getX(), getY() - 2);
    } else if (Greenfoot.isKeyDown("s")) {
      setLocation(getX(), getY() + 2);
    }

    if (Greenfoot.isKeyDown("a")) {
      setLocation(getX() - 2, getY());
    } else if (Greenfoot.isKeyDown("d")) {
      setLocation(getX() + 2, getY());
    }

    if (getIntersectingObjects(Schnapp.class).size() > 0) {
      ((MyWorld) getWorld()).endGame(false);
    }
  }
}
