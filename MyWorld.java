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
        Rocky rocky5 = new Rocky();
        Rocky rocky6 = new Rocky();
        Rocky rocky7 = new Rocky();
        Rocky rocky8 = new Rocky();
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
        Tree tree6 = new Tree();
        Tree tree7 = new Tree();
        Tree tree8 = new Tree();
        
        addObject(rocky1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky7, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(rocky8, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
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
        addObject(tree6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree7, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(tree8, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        HappyDude happydude1 = new HappyDude();
        HappyDude happydude2 = new HappyDude();
        HappyDude happydude3 = new HappyDude();
        HappyDude happydude4 = new HappyDude();
        HappyDude happydude5 = new HappyDude();
        HappyDude happydude6 = new HappyDude();
        HappyDude happydude7 = new HappyDude();
        HappyDude happydude8 = new HappyDude();
        MrBear mrbear1 = new MrBear();
        MrBear mrbear2 = new MrBear();
        MrBear mrbear3 = new MrBear();
        MrBear mrbear4 = new MrBear();
        MrBear mrbear5 = new MrBear();
        MrBear mrbear6 = new MrBear();
        Wambulance wambulance1 = new Wambulance();
        Wambulance wambulance2 = new Wambulance();
        Wambulance wambulance3 = new Wambulance();
        Wambulance wambulance4 = new Wambulance();
        Wambulance wambulance5 = new Wambulance();
        Wambulance wambulance6 = new Wambulance();
        Wambulance wambulance7 = new Wambulance();
        Wambulance wambulance8 = new Wambulance();
        
        addObject(happydude1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude7, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(happydude8, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(mrbear6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance7, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(wambulance8, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        
        
}
public void act(){
      if( numberOfObjects() == 2){
            TieTie TieScreen = new TieTie();
            Greenfoot.setWorld(TieScreen);
            
            
    
}

}}



