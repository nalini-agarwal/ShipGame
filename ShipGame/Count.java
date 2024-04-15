import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Count extends Actor
{
    int score=0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 24, Color.YELLOW, Color.BLACK));
        if (score==10){
            Greenfoot.delay(10);
            Greenfoot.playSound("win.wav");
            Greenfoot.setWorld(new YouWin());
        }
        if(score==-5){
            Greenfoot.delay(20);
            Greenfoot.playSound("lose.wav");
            Greenfoot.setWorld(new endGameScreen());
        }
    }
    public void addScore()
    {
        score++;
    }
    public void removeScore()
    {
        score= score-1;
    }
}
