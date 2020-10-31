import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Cowboy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cowboy extends Actor
{
    /**
     * Act - do whatever the Cowboy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean check = false;
    
    public Cowboy(){
        setImage(new GreenfootImage("cowboy.png"));
    }
    
    public void act() 
    {
        
        //check if correct letter was typed
        //add score
        //if score is 1000 points than reset method
    } 
    public boolean check()
    {
       return check; 
    }
    
    public void reset(){
        //game reset
    }
}
