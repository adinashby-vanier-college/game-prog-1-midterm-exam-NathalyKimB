// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 63, 83);
        burger.setLocation(85, 77);
        Burger burger2 =  new Burger();
        addObject(burger2, 166, 100);
        Burger burger3 =  new Burger();
        addObject(burger3, 99, 142);
        burger2.setLocation(164, 73);
        burger3.setLocation(137, 142);
        Pig pig =  new Pig();
        addObject(pig, 178, 219);
        Burger burger4 =  new Burger();
        addObject(burger4, 63, 267);
        Burger burger5 =  new Burger();
        addObject(burger5, 159, 340);
        Burger burger6 =  new Burger();
        addObject(burger6, 510, 266);
        Burger burger7 =  new Burger();
        addObject(burger7, 414, 320);
        Snake snake =  new Snake();
        addObject(snake, 512, 340);
        Burger burger8 =  new Burger();
        addObject(burger8, 448, 63);
        Burger burger9 =  new Burger();
        addObject(burger9, 391, 135);
    }
}
