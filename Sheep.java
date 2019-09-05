import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{

            
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score = 0;
    
    public void act() 
    { 
        turn(Greenfoot.getRandomNumber(20)-10);
        move(5);
        int x = getX();
        int y = getY();
        if(x > 600 || y < 0 || y > 400) {
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            setLocation(x, y);
           
        }
        //Check If We Hit A Flower    
        boolean contactCatus = isTouching(Catus.class);
        //System.out.println(contactFlower);
        if(contactCatus){
            Catus dude = (Catus) getOneIntersectingObject(Catus.class);
            int dudeScore = dude.getScore();
            score = dudeScore + score;
            removeTouching(Catus.class);
        }
        boolean contactFlower = isTouching(Flower.class);
        if(contactFlower){
            Flower plant = (Flower) getOneIntersectingObject(Flower.class);
            int plantScore = plant.getScore();
            score = score - plantScore;
            removeTouching (Flower.class);
   
        }    
        if(score >= 10)  {
             SheepWin winerScreen = new SheepWin();
             Greenfoot.setWorld(winerScreen);
        
    }
}
}
