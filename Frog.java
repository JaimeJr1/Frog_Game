import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int frogLives = 5;
    public void act()
    {
        if(frogAtTop()){
            Greenfoot.stop();
        }
        else{
            frogMove();
        }
        lifeChecker();
        showLives();
        gameOver(frogLives);
    }
    private void frogMove(){
        String [] keys = {"w", "a", "s", "d"};
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-2, getY());
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+2);
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+2, getY());
        }
    }
    private boolean frogAtTop (){
        boolean atTop;
        if (getY() < 20){
            atTop = true;
        }
        else {
            atTop = false;
        }
        return atTop;
    }
    public int lifeChecker(){
        if (isTouching(Car.class)){
            frogLives = frogLives - 1;
            removeTouching(Car.class);
            Greenfoot.playSound("FrogDeath.wav");
        }
        else if (isTouching(Bus.class)){
            frogLives = frogLives - 2;
            removeTouching(Bus.class);
            Greenfoot.playSound("FrogDeath.wav");
        }
        return frogLives;
    }
    private void gameOver(int frogLives){
        if (frogLives <= 0){
            FrogWorld FrogWorld = (FrogWorld)getWorld();
            FrogWorld.showEndMessage();
            Greenfoot.stop();
            
        }
    }
    public void showLives(){
        FrogWorld FrogWorld = (FrogWorld)getWorld();
        FrogWorld.showText("Lives: " + frogLives, 300, 25);
    }
    }
