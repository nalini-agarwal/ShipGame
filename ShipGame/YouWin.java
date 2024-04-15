import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{

    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg= new GreenfootImage(getWidth(),getHeight());
        bg.setColor(Color.BLUE);
        bg.fillRect(0,0,getWidth(),getHeight());
        setBackground(bg);
        Font f=new Font("SansSerif",60);
        bg.setFont(f);
        bg.setColor(Color.YELLOW);
        String message= "YOU WIN!!!";
        bg.drawString(message,getWidth()/2-message.length()*15, getHeight()/2);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Flower flower = new Flower();
        addObject(flower,534,331);
        Flower flower2 = new Flower();
        addObject(flower2,530,58);
        Flower flower3 = new Flower();
        addObject(flower3,51,333);
        Flower flower4 = new Flower();
        addObject(flower4,54,57);
        flower.setLocation(504,351);
        Grass grass = new Grass();
        addObject(grass,504,351);
        flower.setLocation(536,366);
        Grass grass2 = new Grass();
        addObject(grass2,536,366);
        Grass grass3 = new Grass();
        addObject(grass3,506,87);
        Grass grass4 = new Grass();
        addObject(grass4,537,101);
        flower4.setLocation(37,87);
        Grass grass5 = new Grass();
        addObject(grass5,37,87);
        Grass grass6 = new Grass();
        addObject(grass6,64,102);
        flower3.setLocation(32,350);
        Grass grass7 = new Grass();
        addObject(grass7,32,350);
        flower3.setLocation(53,308);
        flower3.setLocation(38,336);
        Grass grass8 = new Grass();
        addObject(grass8,62,359);
        flower.setLocation(550,311);
        flower4.setLocation(57,42);
        flower3.setLocation(39,299);
        flower3.setLocation(70,317);
        flower.setLocation(551,317);
    }
}
