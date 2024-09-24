// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * 
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(359));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        Actor pig = getOneObjectAtOffset(0, 0, Pig.class);
        if (pig != null) {
            getWorld().removeObject(pig);
        }
        /* This is so the PigWorld changes to Loser world with the lose.wav sound (par1) :*/
        if (isLoser()) {
            transitionToLoser();
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public boolean isLoser()
    {
        /* This is so the PigWorld changes to Loser world  (par2) :*/
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToLoser()
    {
        /* This is so the PigWorld changes to Loser world  (par3) :*/
        World Loser =  new  Loser();
        Greenfoot.setWorld(Loser);
    }

    /**
     * 
     */
    public boolean foundPig()
    {
        Actor pig = getOneObjectAtOffset(0, 0, Pig.class);
        return pig != null;
    }
}
