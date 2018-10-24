import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    /**
     * Sets the food for random images when called into Beach
     */
    public Food()
    {
        int foodType = Greenfoot.getRandomNumber(5);
        if( foodType == 0 ) {
            setImage("apple1.png");
        } else if( foodType == 1 ) {
            setImage("bananas.png");
        } else if( foodType == 2 ) {
            setImage("cherries.png");
        } else if(foodType == 3) {
            setImage("strawberry.png");
        } else if(foodType == 4) {
            setImage("grapes.png");
        }
    }   
}
