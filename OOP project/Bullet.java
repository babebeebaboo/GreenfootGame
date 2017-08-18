import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
  
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean strike=false;
    public void act() 
    {
        // Add your action code here.
        move(-5);
        
        //strikeSnake();
        //addSnake();
        
        // delete on lastest
        delete();
    } 
    public void addSnake(){
        if(strike){
            strike = false;
        }
    }
    public void delete()
    {
        if(getX() <5 ) getWorld().removeObject(this);
    }
    
    public void strikeSnake(){
        Actor snake = getOneObjectAtOffset(0,0,Snake.class);
        if(snake != null)
        {
            getWorld().addObject(new Snake(),getX()+40,getY());
            strike = true;
            //getWorld().removeObject(snake);
            //Greenfoot.playSound("eating.wav");
        }
    }
}
