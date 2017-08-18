import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   // private boolean stop =false;
    private int nowscore;
    private boolean firstTime = true;
    private int spd=-4;
    //public boolean stop(){
      //  return stop;
   // }
    public void act() 
    {
        // Add your action code here.
       // if(stop == false){
        init();
       // if(getWorld().getObjects(Timer.class).get(0).nowScore() >100)spd=-3;
       // if(getWorld().getObjects(Timer.class).get(0).nowScore() >200)spd=-4;
       
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >50)spd=-5;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >100)spd=-6;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >400)spd=-7;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >600)spd=-8;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >800)spd=-9;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >1000)spd=-10;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >1200)spd=-11;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >1400)spd=-12;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >1600)spd=-13;
        if(getWorld().getObjects(Timer.class).get(0).nowScore() >1800)spd=-14;
        nowscore = getWorld().getObjects(Timer.class).get(0).nowScore();
        move(spd);
        killSnake();
        
        
        
        delete();
    //}
    
    }  
    public int nowscore(){
        return nowscore;
    }
     public void killSnake(){
         Actor snake2 = getOneObjectAtOffset(0,0,Snake2.class);
        Actor snake = getOneObjectAtOffset(0,0,Snake.class);
         if(snake != null || snake2!= null ){
             if( getWorld().getObjects(Timer.class).get(0).nowScore() - getWorld().getObjects(Snake.class).get(0).whenAddSnake() < 10
             && getWorld().getObjects(Snake.class).get(0).whenAddSnake() != -1){}
            else{
                getWorld().addObject(new Lose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
                //image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
                //GreenfootImage textImage = new GreenfootImage(getWorld().getObjects(Timer.class).get(0).returnText(), 20, Color.BLACK, new Color(0, 0, 0, 0));
                //GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+10);
                //image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
                //image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
                // setImage(image);
                //getWorld().addObject(new Timer2(),42,14);
                //stop=true;
                Greenfoot.stop();
                
            }
        }
        
        }
    public void init()
    {
      int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        int left = getWorld().getWidth() - getImage().getWidth()/2;
        if(firstTime)
        {
            setLocation(left, groundLevel);
            firstTime = false;
        }  
    }
    public void delete()
    {
        if(getX() <5 ) getWorld().removeObject(this);
    }
}
