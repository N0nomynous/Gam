import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyMonster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyMonster extends Actor
{
    public EnemyMonster(){
        getImage().scale(150, 100);
    }
    /**
     * Act - do whatever the EnemyMonster wants to do. This method is called whenever
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
