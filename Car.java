import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{


    
    public void act()
    {
        // Add your action code here.
        setImage("images/bus-4.png");
        move(-15);
        if (getX()<=0)
        {
            resetBus();
        }
        if (isTouching(Daniel.class))
        {
            Skeleton S1=new Skeleton();
            getWorld().addObject(S1, 300,200);
            getWorld().removeObject(this);
        }
    }
    public void resetBus()
    {
        if (Greenfoot.getRandomNumber(2)==0)
        {
            setLocation(500,100);
        }
        else
        {
            setLocation(500,300);
        }
        
    }


}
