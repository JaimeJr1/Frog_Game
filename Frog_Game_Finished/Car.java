import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int carDistance = 2;
    public void act()
    {
        carMove();
        edgeOfScreen();
    }
    private void carMove(){
        setLocation(getX()+2, getY());
    }
    private void edgeOfScreen(){
        int width;
        World carWorld = getWorld();
        if(getX() > (carWorld.getWidth()-20)){
            carWorld.removeObject(this);
        }
    }
}
