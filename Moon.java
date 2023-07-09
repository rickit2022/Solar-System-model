/**
 * A class that stimulate any Moon object in the Solar System which extends the SolarObject class.
 */

public class Moon extends Planet{
    private double rDistance;
    private double rAngle;   
    private Planet planet;
    
    /**
     * Constructor for the creation of the moon.
     * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
	 * @param rDistance the distance part of the polar co-ordinate about which this object orbits.
	 * @param rAngle the angular part of the polar co-ordinate about which this object orbits.
     */
    public Moon(String name,double distance, double angle, double diameter, String col, Planet planet){
        super(name, distance,angle,diameter,col);
        this.planet = planet;
        this.rDistance = planet.distanceGet();
        this.rAngle = planet.angleGet();
    } 
    /**
     * A method that draw the Moon onto the existing frame. 
     * @param solarSystem the frame being drawn onto.
     * @param planet the planet in which the moon orbits around.
     */
    public void draw(SolarSystem solarSystem){
        solarSystem.drawSolarObjectAbout(distanceGet(),angleGet(),diameterGet(),colGet(),rDistance,rAngle);
        rAngle = this.planet.angleGet();
        this.angleInc();
    }
}