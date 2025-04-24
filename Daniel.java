import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Daniel extends Actor
{
    boolean atTop = true;
    public void act()
    {
        setImage("images/pig.png");
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        if(atTop)
        {
            setLocation(100,300);
        }
        else
        {
            setLocation(100,100);
        }
    }
}