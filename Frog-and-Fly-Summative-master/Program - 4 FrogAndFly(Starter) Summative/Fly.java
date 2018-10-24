import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    
    /**
     * sets the rotation for the fly for it to face different directions
     */
    public Fly()
    {
        setRotation( Greenfoot.getRandomNumber(360) );
    }
    
    /**
     * Checks for movement, if it is eaten, and if it eats food
     */
    public void act()
    {
        
        //removes fly from world when fly is touched by frog (ate)
        checkIfAte();
        

        // this makes it so the scoreboard updates
        checkForFood();
        
        // this makes the fly move
        checkKeys();
    }    
    
    /**
     * Tells the fly what to do if the frog "Eats" it
     */
    private void checkIfAte()
    {
        if(isTouching(Frog.class) == true)
        {
            removeTouching(Fly.class);
            Greenfoot.stop();
        }
    }
    
    /**
     * Checks for food so the scoreboard can update
     */
    private void checkForFood()
    {
       if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            ((Beach)getWorld()).update();
        } 
    }
    
    /**
     * This bit of code makes the fly move
     */
       private void checkKeys()
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            move(+8);
        }
        if(Greenfoot.isKeyDown("right") == true)
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("left") == true)
        {
            turn(-5);
        }
    }
}
