/** This class creates a countdown timer object.
 * It displays like a digital timer clock.
 * The value to set the timer is given in seconds; however, is converted to approximate act cycles within the class.
 * All timers created from this class will start automatically unless using the 'Timer(int, boolean)' constructor with boolean set to 'false'.
 */

// BACKUP Timer AT https://pastebin.com/3atB6SE9

import greenfoot.*;
//import java.awt.Color;
 
public class Timer extends Actor
{
    private int count=0; // the counter field
    private int initialCount; // the initial time given before event occurs
    private boolean running;
    private int add=1;
    private String text ="";
    
    private void updateImage()
    {

       String s = String.valueOf(count/10);
         text = addZero(s) ;
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+10);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
        setImage(image);
    }
    private String addZero(String a){
        if(a.length() == 6){
            return a;
        }
        if(a.length() == 5){
            return "0"+a;
        }
        if(a.length() == 4){
            return "00"+a;
        }
        if(a.length() == 3){
            return "000"+a;
        }
        if(a.length() == 2){
            return "0000"+a;
        }
        if(a.length() == 1){
            return "00000"+a;
        }
        return a;
    }
    public String returnText()
    {
        return text;
    }
    private int stringToInteger(String numStr)
{
    int val = 0;
    for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
    return val;
}
    public int nowScore(){
        return stringToInteger(text);
    }
    public void act()
    {
        //boolean newsnake = ((Snake) getWorld().getObjects(Snake.class).get(0)).newsnake();
        //boolean newsnake =Snake.newsnake() ; 
        
        
            count+=add;
            if( ((Snake) getWorld().getObjects(Snake.class).get(0)).newsnake()==true ){add = 2;}
             updateImage();
        
    }
 
    
}