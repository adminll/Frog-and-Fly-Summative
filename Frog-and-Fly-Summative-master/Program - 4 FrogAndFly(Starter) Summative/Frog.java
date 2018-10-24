import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    
    /**
     * draws a random number, dpending on the number, the speed will be between 4 and 8
     */
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
       speed = Greenfoot.getRandomNumber(6);
    }
    
    /**
     * This is for movement and turning if at edge of world
     */
    public void act() 
    {
        
        move(speed);
        if(speed == 1)
        {
            speed = speed+3;
        }
        if(speed == 2)
        {
            speed = speed+3;
        }
        if(speed == 3)
        {
            speed = speed+3;
        }
        if(speed == 4)
        {
            speed = speed+3;
        }
        if(speed == 5)
        {
            speed = speed+3;
        }
        if(speed == 0)
        {
            speed = speed+4;
        }
        
        

        
        if(atEdgeOfWorld() == true)
        {
            turn(70);
        }
        
        
        
        movement();
    }    
    
    /**
     * turns the frog different directions (35%)
     */
    private void movement()
    {
       if(Greenfoot.getRandomNumber(35) <=17)
       {
          turn(15);
       }
       else
       {
          turn(-15); 
       }
    }
}
