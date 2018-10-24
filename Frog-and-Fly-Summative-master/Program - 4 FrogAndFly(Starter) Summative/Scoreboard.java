import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    // the amount of points you get
    private int points;
    //the font that the score is printed in
    private Font myFont = new Font("IBM Plex Mono", true, false, 24);

    /**
     * Updates scoreboard
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * This bit tells you if you win the game
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 100) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("Congrats, you wasted your time winning this game", 5,25);
            Greenfoot.stop();
        }        
    }    
}
