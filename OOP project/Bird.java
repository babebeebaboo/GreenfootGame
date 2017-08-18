import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public
class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  private int spd = 0;
  private int turn = 0; //0down 1up
  public void act()
    {
        // setLocation(getX(), 0);
        // setLocation(getX(), 150);
        upANDdown();
        Tryshoot();
    }
    
    public void Tryshoot()
    {
        if(Greenfoot.getRandomNumber(1000)<10 && getWorld().getObjects(Snake.class).get(0).whenAddSnake() == -1){
            shoot();
        }
    }
    public void shoot()
    {
        getWorld().addObject(new Bullet(),getX(),getY());
    }
  public void upANDdown()
    {
        if (turn == 0)
        {
            setLocation(getX(), spd);
            spd+=2;
            if (spd == 150)
                turn = 1;
        }
        if (turn == 1)
        {
            setLocation(getX(), spd);
            spd-=2;
            if (spd == 0)
                turn = 0;
        }
    }
}
