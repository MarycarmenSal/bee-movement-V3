import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Marycarmen S

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
        super(600, 400, 1, false);
        //The one bee who wins or not wins 
        Bee bee1 = new Bee(); 
        addObject(bee1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        //The one Sheep who wins or not wins
        Sheep sheep1 = new Sheep();
        addObject(sheep1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        //All that jazz to make the Bee win
        Rocky rocky1 = new Rocky();
        Rocky rocky2 = new Rocky();
        Rocky rocky3 = new Rocky();
        Rocky rocky4 = new Rocky();
        Shroom shroom1 = new Shroom();
        Shroom shroom2 = new Shroom();
        Shroom shroom3 = new Shroom();
        Shroom shroom4 = new Shroom();
        Shroom shroom5 = new Shroom();
        Shroom shroom6 = new Shroom();
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();
        Tree tree4 = new Tree();
        Tree tree5 = new Tree();
        
        addObject(rocky1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(shroom6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
       
        
     
    }
}
