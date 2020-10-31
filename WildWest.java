import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WildWest extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public WildWest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("Typing in the Wild West Background.png"));
        setPaintOrder(HPbar.class, MPbar.class, Cowboy.class, Cactus.class);
        addObject(new Cowboy(), 300, 200); //change location later
        addObject(new Cactus(), 312, 207);
        addObject(new HPbar(), 300, 200); //change location later
        addObject(new MPbar(), 300, 200); //change location later
    }
}
