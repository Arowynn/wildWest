import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int points;
    private int health;
    private String val;
    public Cactus(){
        newCactus();
    }
    public void act() 
    {
        String inputValue = JOptionPane.showInputDialog("Text letter on screen").toLowerCase();
        check(inputValue);
        newCactus();
    }
    public boolean check(String input){
        boolean check = false;
        if(input.equals(val)){
            check = true;
            points++; //edit to add however many points we want
        }
        else{
            check = false;
            health--; //edit to subtract as many points as we want
        }
        return check;
    }
    public void newCactus(){
        int num = Greenfoot.getRandomNumber(26); //make sure that is 26 numbers;
        if(num == 1){
           setImage(new GreenfootImage("Cactus A.png")); 
           val = "a";
        }
        if(num == 2){
           setImage(new GreenfootImage("Cactus B.png")); 
           val = "b";
        }
        if(num == 3){
           setImage(new GreenfootImage("Cactus C.png")); 
           val = "c";
        }
        if(num == 4){
           setImage(new GreenfootImage("Cactus D.png")); 
           val = "d";
        }
        if(num == 5){
           setImage(new GreenfootImage("Cactus E.png")); 
           val = "e";
        }
        if(num == 6){
           setImage(new GreenfootImage("Cactus F.png"));
           val = "f";
        }
        if(num == 7){
           setImage(new GreenfootImage("Cactus G.png"));
           val = "g";
        }
        if(num == 8){
           setImage(new GreenfootImage("Cactus H.png"));
           val = "h";
        }
        if(num == 9){
           setImage(new GreenfootImage("Cactus I.png")); 
           val = "i";
        }
        if(num == 10){
           setImage(new GreenfootImage("Cactus J.png")); 
           val = "j";
        }
        if(num == 11){
           setImage(new GreenfootImage("Cactus K.png")); 
           val = "k";
        }
        if(num == 12){
           setImage(new GreenfootImage("Cactus L.png")); 
           val = "l";
        }
        if(num == 13){
           setImage(new GreenfootImage("Cactus M.png")); 
           val = "m";
        }
        if(num == 14){
           setImage(new GreenfootImage("Cactus N.png")); 
           val = "n";
        }
        if(num == 15){
           setImage(new GreenfootImage("Cactus O.png")); 
           val = "o";
        }
        if(num == 16){
           setImage(new GreenfootImage("Cactus P.png")); 
           val = "p";
        }
        if(num == 17){
           setImage(new GreenfootImage("Cactus Q.png"));
           val = "q";
        }
        if(num == 18){
           setImage(new GreenfootImage("Cactus R.png")); 
           val = "r";
        }
        if(num == 19){
           setImage(new GreenfootImage("Cactus S.png")); 
           val = "s";
        }
        if(num == 20){
           setImage(new GreenfootImage("Cactus T.png")); 
           val = "t";
        }
        if(num == 21){
           setImage(new GreenfootImage("Cactus U.png")); 
           val = "u";
        }
        if(num == 22){
           setImage(new GreenfootImage("Cactus V.png")); 
           val = "v";
        }
        if(num == 23){
           setImage(new GreenfootImage("Cactus W.png")); 
           val = "w";
        }
        if(num == 24){
           setImage(new GreenfootImage("Cactus X.png")); 
           val = "x";
        }
        if(num == 25){
           setImage(new GreenfootImage("Cactus Y.png")); 
           val = "y";
        }
        if(num == 26){
           setImage(new GreenfootImage("Cactus Z.png")); 
           val = "z";
        }
    }
}
