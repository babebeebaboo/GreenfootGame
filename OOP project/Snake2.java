import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake2 extends Actor
{
    /**
     * Act - do whatever the Snake2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int ySpeed2;
    private int apexTimer2;
    //public boolean notAdd ;
    private int jumpSpeed2 = 20;
    private int jumpTime2 = 10;
    private boolean onJump2 = false;
    private boolean strikeBullet2 = false;
    public void act() 
    {
        // Add your action code here.
        jump2();
       // getWorld().removeObject(getWorld().getObjects(Bird.class));
    }    
    public void jump2()
    {
       
        int groundLevel2 = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround2 = (getY() == groundLevel2);
        if (!onGround2) // in middle of jump
        {
            onJump2 = true;
            if (ySpeed2 == 0 && apexTimer2 > 0) apexTimer2--; // run apex timer
            if (ySpeed2 == 0 && apexTimer2 > 0) return; // apex timer still running
            ySpeed2++; // adds gravity effect
            if(Greenfoot.isKeyDown("k"))
            {
                setLocation(getX(), groundLevel2);
                return;
            }
            setLocation(getX(), getY()+ySpeed2); // fall (rising slower or falling faster)
            if (getY()>=groundLevel2) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel2); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            onJump2 = false;
            if (Greenfoot.isKeyDown("i")) // jump key detected
            {
                 Greenfoot.playSound("Jump.wav");
                ySpeed2 = (-1)*jumpSpeed2; // add jump speed
                setLocation(getX(), getY()+ySpeed2); // leave ground
                apexTimer2 = jumpTime2;  // set apex timer (adjust value to suit)
            }
            else
            {
                
            }
        }
        
    }
}
