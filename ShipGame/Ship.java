import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        Actor crate = getOneIntersectingObject (Crate.class);
        if (crate!= null)
        {
            World MyWorld= getWorld();
            int xCoord = Greenfoot.getRandomNumber(600); 
            int yCoord = Greenfoot.getRandomNumber(400);
            crate.setLocation(xCoord, yCoord);
            MyWorld myWorld = (MyWorld)MyWorld;
            Count count = myWorld.getCounter();
            count.addScore();
            Greenfoot.playSound("treasure.wav");
        }
        
    }
}
