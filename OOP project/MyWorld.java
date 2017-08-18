import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 300, 1); 
        prepare();
        Greenfoot.playSound("BG.mp3");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*
        Snake snake = new Snake();
        addObject(snake,67,264);
        snake.setLocation(60,268);
        snake.setLocation(149,275);

        Bird bird = new Bird();
        addObject(bird,754,48);
        snake.setLocation(92,266);
        bird.setLocation(750,77);
        Bullet bullet = new Bullet();
        addObject(bullet,696,83);
        removeObject(bullet);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,541,159);
        Timer timer = new Timer();
        addObject(timer,143,67);
        timer.setLocation(112,40);
        removeObject(mushroom);
        Snake2 snake2 = new Snake2();
        addObject(snake2,399,257);
        removeObject(snake2);
        timer.setLocation(85,40);
        timer.setLocation(42,14);
        removeObject(bird);
         */

        Howto howto = new Howto();
        addObject(howto,406,157);
        howto.setLocation(400,150);
       
    }
}
