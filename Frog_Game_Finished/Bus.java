import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bus extends Actor
{
    /**
     * Act - do whatever the Bus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        busMove();
        edgeOfScreen();
    }
    private void busMove(){
     setLocation(getX()-1, getY());
    }
    private void edgeOfScreen(){
        int width;
        World busWorld = getWorld();
        if(getX() == 0){
            busWorld.removeObject(this);
        }
    }
}
