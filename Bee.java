

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    private int score = 0;
    
    
    
    
   
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(Greenfoot.getRandomNumber(10) - 5);
        move(5);
        int x = getX();
        int y = getY();
        if(x > 600 || y < 0 || y > 400) {
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            setLocation(x, y);
           
        }
        //Check If We Hit A Flower    
        boolean contactFlower = isTouching(Flower.class);
        boolean contactCatus = isTouching(Catus.class);
        //System.out.println(contactFlower);
        if(contactFlower) {
            
            Flower plant = (Flower) getOneIntersectingObject(Flower.class);
            int plantScore = plant.getScore();
            score = plantScore + score;
            removeTouching(Flower.class);
            
        }
         if(contactCatus){
            Catus dude = (Catus) getOneIntersectingObject(Catus.class);
            int dudeScore = dude.getScore();
            score = score - dudeScore;
            removeTouching(Catus.class);
            
        }
        //Check if it wins
        if(score >= 10)  {
             BeeWin winScreen = new BeeWin();
             Greenfoot.setWorld(winScreen);
        }
       
    }
   
        }
 
    
