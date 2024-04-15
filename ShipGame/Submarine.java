import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Submarine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submarine extends Actor
{
    public Submarine()
{
    GreenfootImage img = new GreenfootImage("Submarine2-removebg-preview (1).png");
    img.scale(img.getWidth()/3, img.getHeight()/3);
    setImage(img);
}
    public void act()
{
        move(5);
        if(Greenfoot.getRandomNumber(20)==1)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        Actor crate= getOneIntersectingObject(Crate.class);
        if(crate!=null)
        {
            World MyWorld= getWorld();
            int xCoord = Greenfoot.getRandomNumber(600); 
            int yCoord = Greenfoot.getRandomNumber(400);
            crate.setLocation(xCoord, yCoord);
            MyWorld myWorld = (MyWorld)MyWorld;
            Count count = myWorld.getCounter();
            count.removeScore();
        }
}
}
