import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(5); // Atur kecepatan berjalan sesuai kebutuhan
        if (isAtEdge()) {
            turnRandomly();
        }
        
        checkCollision(); // Panggil metode untuk memeriksa tabrakan
    }

    private void turnRandomly() {
        int randomAngle = Greenfoot.getRandomNumber(360); // Putar secara acak antara 0 dan 359 derajat
        turn(randomAngle);
    }
    
    private void checkCollision() {
        Actor collisionActor = getOneIntersectingObject(null); // Mengecek tabrakan dengan objek apa pun
        
        if (collisionActor != null) {
            getWorld().removeObject(this); // Hapus aktor jika terjadi tabrakan
        }
    }
}
