import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int whenAddNewSnake=-1;
    private boolean addedBird=false;
    private int timerMushroom = 0;
    private int timeMushroom = 50+Greenfoot.getRandomNumber(200);
    private boolean newSnake = false;
    private int ySpeed;
    private int apexTimer;
    public boolean notAdd ;
    private int jumpSpeed = 20;
    private int jumpTime = 10;
    private boolean onJump = false;
    private boolean strikeBullet = false;
    
    public boolean newsnake(){
        return newSnake;
    }
    public void act()
    {
        //getWorld().setBackground(new GreenfootImage("BG.jpg"));
        //if(getWorld().getObjects(Mushroom.class).get(0).stop()){
           // Greenfoot.playSound("BG.mp3");
        jump();
        strikeBullet();
        addMushroom();
        add();
        addBird();
       // delBird();
    }
    
    public void addBird(){
        if(addedBird==false && getWorld().getObjects(Timer.class).get(0).nowScore() > 40){
            addedBird=true;
            //750,77
            getWorld().addObject(new Bird(),750,77);
        }
    }
    public void addMushroom()
    {
        if(timerMushroom == timeMushroom){
            timerMushroom=0;
            timeMushroom = 50+Greenfoot.getRandomNumber(200);
            getWorld().addObject(new Mushroom(),getWorld().getWidth(),getWorld().getHeight());
        }
         timerMushroom++;
    }
    public int whenAddSnake(){
        return whenAddNewSnake;
    }
    public void add()
    {
        if(strikeBullet==true && onJump==false && notAdd==false && newSnake == false){
            whenAddNewSnake = getWorld().getObjects(Timer.class).get(0).nowScore();
            newSnake = true;
            getWorld().addObject(new Snake2(),getX()+100+Greenfoot.getRandomNumber(200),getY());
            strikeBullet=false;
            notAdd = true;
        }
    }
    
    public void strikeBullet()
    {
        Actor bullet = getOneObjectAtOffset(0,0,Bullet.class);
        if(bullet != null)
        {
            strikeBullet=true;
        }
    }
    public void jump()
    {
       
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
            onJump = true;
            if (ySpeed == 0 && apexTimer > 0) apexTimer--; // run apex timer
            if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
            ySpeed++; // adds gravity effect
            if("s".equals(Greenfoot.getKey()))
            {
                setLocation(getX(), groundLevel);
                return;
            }
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            onJump = false;
            if ("w".equals(Greenfoot.getKey())) // jump key detected
            {
                 Greenfoot.playSound("Jump.wav");
                ySpeed = (-1)*jumpSpeed; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = jumpTime;  // set apex timer (adjust value to suit)
            }
            else
            {
                
            }
        }
        
    }
}
