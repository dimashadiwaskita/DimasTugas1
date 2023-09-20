import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    super(600, 400, 1); 

    // Loop untuk membuat dan menambahkan 5 mobil ke dunia
    for (int i = 0; i < 5; i++) {
        car carInstance = new car();
        int xPosition = Greenfoot.getRandomNumber(getWidth()); // Posisi x acak di dalam dunia
        int yPosition = Greenfoot.getRandomNumber(getHeight()); // Posisi y acak di dalam dunia
        addObject(carInstance, xPosition, yPosition);
    }
}
}
