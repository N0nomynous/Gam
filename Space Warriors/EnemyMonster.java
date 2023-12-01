import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
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
    Random random = new Random();
    int turn = random.nextInt(1, 100);
    /**
     * Act - do whatever the EnemyMonster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 15;
    public void act()
    {
        move(speed);
        if(isAtEdge())
        turn(turn);
        
    }
}
