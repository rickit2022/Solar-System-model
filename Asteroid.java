/**
 * A class that stimulate any Asteroid object in the Solar System which extends the Planet class.
 */

public class Asteroid extends SolarObject
{
    /**
     * Constructor for the creation of a asteroid.
	 * @param distance the distance from the sun to the object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public Asteroid(String name,double distance, double angle, double diameter, String col){
        super(name,distance,angle,diameter,col);
    }
    
}