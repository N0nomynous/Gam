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
    int randomX = Greenfoot.getRandomNumber(getWidth());
    int randomY = Greenfoot.getRandomNumber(getHeight());
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 1080, 1);
        Hero mainHero = new Hero();
        addObject(mainHero, getWidth()/2, getHeight()/2);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {  
            int randomX = Greenfoot.getRandomNumber(getWidth());
            int randomY = Greenfoot.getRandomNumber(getHeight());
            EnemyMonster clickedEnemyMonster = new EnemyMonster();
            addObject(new EnemyMonster(), randomX , randomY);
            clickedEnemyMonster.setRotation(randomX);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j< 10; j++)
            {
                addObject(new EnemyMonster(), i * 75, j * 75);
            }
        }
    }
}
