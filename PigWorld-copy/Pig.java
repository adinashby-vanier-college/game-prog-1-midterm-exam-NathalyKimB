// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* this is just to make the player be able to move the pig :*/
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        /* This is for the pig to be able to eat the burger (part1) :*/
        Actor Burger = getOneObjectAtOffset(0, 0, Burger.class);
        if (Burger != null) {
            getWorld().removeObject(Burger);
        }
        /* This is so the PigWorld changes to Winner world with the win.wav sound (par1) :*/
        if (isWinner()) {
            transitionToWinner();
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * 
     */
    public boolean foundBurger()
    {
        /* This is for the pig to be able to eat the burger (part2) :*/
        Actor Burger = getOneObjectAtOffset(0, 0, Burger.class);
        return Burger != null;
    }

    /**
     * 
     */
    public void eat()
    {
        /* This is for the pig to be able to eat the burger (part3) + the sound eating.wav :*/
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public boolean isWinner()
    {
        /* This is so the PigWorld changes to Winner world (par2) :*/
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToWinner()
    {
        /* This is so the PigWorld changes to Winner world (par3) :*/
        World Winner =  new  Winner();
        Greenfoot.setWorld(Winner);
    }
}
