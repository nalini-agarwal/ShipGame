import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Count count = new Count();
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount= new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(timeCount, 100,80);
        tim.mark();
    }
    public Count getCounter()
    {
        return count ;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(count, 100, 40);
        Ship ship = new Ship();
        addObject(ship,72,201);
        Crate crate = new Crate();
        addObject(crate,373,88);
        Crate crate2 = new Crate();
        addObject(crate2,538,193);
        Crate crate3 = new Crate();
        addObject(crate3,249,321);
        Crate crate4 = new Crate();
        addObject(crate4,449,316);
        crate4.setLocation(401,361);
        Submarine submarine = new Submarine();
        addObject(submarine,303,186);
        Submarine submarine2 = new Submarine();
        addObject(submarine2,377,271);
        submarine.setLocation(204,108);

        Crate crate5 = new Crate();
        addObject(crate5,537,70);
        Crate crate6 = new Crate();
        addObject(crate6,541,342);
        crate6.setLocation(50,352);
    }

    public void act()
    {
        timeCount.setValue(tim.millisElapsed()/1000);
    }
}
