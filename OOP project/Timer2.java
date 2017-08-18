import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer2 extends Actor
{
    /**
     * Act - do whatever the Timer2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private int count=0; // the counter field
    //private int initialCount; // the initial time given before event occurs
    //private boolean running;
    //private int add=1;
    private String text2 ="";
    private String addZero2(String a){
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
    
    private void updateImage2()
    {
       String s = String.valueOf(getWorld().getObjects(Mushroom.class).get(0).nowscore() / 10);
         text2 = addZero2(s) ;
        GreenfootImage textImage = new GreenfootImage(text2, 20, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+10);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
         updateImage2();
    }    
}
