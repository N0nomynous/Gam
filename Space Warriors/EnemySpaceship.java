import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemySpaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpaceship extends Actor
{
    public EnemySpaceship(){
        getImage().scale(150, 100);
    }
    /**
     * Act - do whatever the EnemySpaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    public void act()
    {
        move(speed);
        if(isAtEdge())
        turn(20);
    }
}
