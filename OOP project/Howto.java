import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howto extends Actor
{
    /**
     * Act - do whatever the Howto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
             
         /*    
        Snake snake = new Snake();
        addObject(snake,67,264);
        snake.setLocation(60,268);
        snake.setLocation(149,275);
        
        //Bird bird = new Bird();
        //addObject(bird,754,48);
        snake.setLocation(92,266);
        //bird.setLocation(750,77);
        //Bullet bullet = new Bullet();
        //addObject(bullet,696,83);
        ////removeObject(bullet);
       // Mushroom mushroom = new Mushroom();
        //addObject(mushroom,541,159);
        Timer timer = new Timer();
        addObject(timer,143,67);
        timer.setLocation(112,40);
        ////removeObject(mushroom);
        //Snake2 snake2 = new Snake2();
        //addObject(snake2,399,257);
        ////removeObject(snake2);
        timer.setLocation(85,40);
        timer.setLocation(42,14);
        ////removeObject(bird);
        
        */
        getWorld().addObject(new Snake(),92,266);
        getWorld().addObject(new Timer(),42,14);
        getWorld().removeObject(this);
        
        }
    }    
}
