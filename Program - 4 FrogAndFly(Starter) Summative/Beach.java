import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world
       addFood();
       // add a Fly object at a random position somewhere in the world
       addObject( new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
       // add a Frog object at the center of the world 
       addObject( new Frog(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
    }
    
    /**
     * Adds n Food objects to the world
     * @param
     * @return 
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    private void addFood()
    {
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        
    }
}
