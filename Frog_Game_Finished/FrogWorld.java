import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrogWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrogWorld extends World
{
    private double score;
    private int time;
    private int score1; //number on screen
    /**
     * Constructor for objects of class FrogWorld.
     * 
     */
    public FrogWorld()
    {    
        super(600, 400, 1);
        addObject(new Frog(), (getWidth() / 2), (getHeight() / 2));
        time = 0;
        showTime();
    }
    public void act(){
        placeCar();
        placeBus();
        countTime();
    }
    private void placeCar(){
        if( (Greenfoot.getRandomNumber(101) < 1))
        {
            addObject(new Car(), 0, Greenfoot.getRandomNumber(401));
        }
    }
    private void placeBus(){
        if( (Greenfoot.getRandomNumber(101) < 0.5))
        {
            addObject(new Bus(), 550, Greenfoot.getRandomNumber(401));
        }
    }
    private void countTime(){
        time = time +1;
        score = score + 0.1;
        score1 = (int) score; // converting the double to an integer so the screen isn't flooded with decimals
        showTime();
        showText("Time: " + time, 550, 25);
        showText("Score: " + score1, 80, 25);
    }
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }
    public void showEndMessage()
    {
        showText("Your final score: " + score + " points", 300, 200);
    }

}
