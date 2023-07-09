import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
/**
 * A class that creates the asteroid belt between Mars and Jupiter.
 */
public class AsteroidBelt
{
    private Asteroid[] asteroids;
    private SolarSystem solarSystem;
    /**
     * Create a belt of asteroids of the specified size.
     * 
     * @param size the number of asteroids to be in the belt.
     * @param solarSystem the frame to draw the belt onto.
     */
    public AsteroidBelt(int size,SolarSystem solarSystem){
        asteroids = new Asteroid[size];
        this.solarSystem = solarSystem;
        construct();
    }
    /**
     * Populate the asteroid belt with regards to the specified size.
     * Each asteroid has a randomised distance between Mars and Jupiter, randomised speed and randomised size.
     * 
     */
    public void construct(){
        for(int i = 0; i< asteroids.length;i++){
            double randDistance = Math.round(ThreadLocalRandom.current().nextDouble(250, 278));
            double randAngle = Math.round(ThreadLocalRandom.current().nextDouble(10, 200));
            double randDiameter = Math.round(ThreadLocalRandom.current().nextDouble(0, 5));
            asteroids[i] = new Asteroid("",randDistance, randAngle, randDiameter,"WHITE");
        }
    }
    /**
     * A method the draws all the asteroids created onto the existing frame.
     */
    public void draw(){
        for(int i= 0; i< asteroids.length; i++){
            asteroids[i].draw(solarSystem);
        }
    }
}