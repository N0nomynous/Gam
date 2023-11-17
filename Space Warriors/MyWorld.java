import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 1080, 1);
        addObject(new Hero(), 300, 200);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        EnemyMonster enemyMonster = new EnemyMonster();
        addObject(enemyMonster,1687,141);
        EnemySpaceship enemySpaceship = new EnemySpaceship();
        addObject(enemySpaceship,1706,560);
        EnemySpaceship enemySpaceship2 = new EnemySpaceship();
        addObject(enemySpaceship2,1713,666);
        EnemyMonster enemyMonster2 = new EnemyMonster();
        addObject(enemyMonster2,1702,280);
        enemyMonster.setRotation(79);
        enemyMonster.speed = 5;
        enemySpaceship.setRotation(180);
        enemySpaceship.speed = 2;
    }
}
