import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score;
    
    
    
    /**
     * Adds the scoreboard and items into the world
     */
    public Beach()
    {    
       super(800, 600, 1);
       
       //adds food into the world
       addFood(10);
       
       //adds the fly into the world
       addObject(new Fly(), Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));;
       
       //adds the frog into the world
       addObject(new Frog(),getWidth()/2,getHeight()/2);
       
       //for the score board
       score = new Scoreboard();

       //adds the scoreboard
       prepare();
    }
    
    /**
     * Respawns the food
     */
    public void act()
    {
        if(getObjects(Food.class).size()==0)
        {
           addFood(10); 
        }
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    
    /**
     * Adds the fly, frog, scoreboard, and the food into the world
     */
    private void prepare()
    {
        addObject(score,90,40);
    }
    
    /**
     * Updates the world
     */
    public void update()
    {
        score.addToScore();
    }
}
