import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endGameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endGameScreen extends World
{

    /**
     * Constructor for objects of class endGameScreen.
     * 
     */
    public endGameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg= new GreenfootImage(getWidth(),getHeight());
        bg.setColor(Color.BLUE);
        bg.fillRect(0,0,getWidth(),getHeight());
        setBackground(bg);
        Font f=new Font("SansSerif",60);
        bg.setFont(f);
        bg.setColor(Color.RED);
        String message= "GAME OVER";
        bg.drawString(message,getWidth()/2-message.length()*20, getHeight()/2);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Skull skull = new Skull();
        addObject(skull,532,320);
        Skull skull2 = new Skull();
        addObject(skull2,78,313);
    }
}
