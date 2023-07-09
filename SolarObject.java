/**
 * A class that represent any Solar Objects in the solar system.
 * It contains the object's name, angle, distance, diameter and its colour.
 */


public class SolarObject
{
    private String name;
    private double angle;
    private double velocity;
    private double distance;
    private double diameter;
    private String col;
    /**
     * Constructor for the creation of the Solar Object,
	 * @param distance the distance from the sun to the object.
	 * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     */
    public SolarObject(String name,double distance, double angle,double diameter, String col){
        this.name = name;
        this.angle = angle;
        this.velocity = angle;
        this.distance = distance;
        this.diameter = diameter;
        this.col = col;
    } 
    /**
     * Getter for the object's name.
     * @return Return the object's name.
     */
    public String nameGet(){
        return name;
    }
    /**
     * Getter for the object's current angle.
     * @return Return the object's current angle.
     */
    public double angleGet(){
        return angle;
    }
    /**
     * Increment the object's angle(speed).
     * To keep the speed consistent, once 
     * the object has completed a full orbit,
     * it's initial 'spawn' will be reset.
     */
    public void angleInc(){
        if(this.angle <= this.angle + 360){
           this.angle += velocity/20;
        }
        else{
            this.angle = this.velocity;
        }
    }
    /**
     * Getter for the object's initial angle.
     * @return Return the object's initial angle.
     */
    public double velocityGet(){
        return velocity;
    }
    /**
     * Getter for the object's distance.
     * @return Return the object's distance.
     */
    public double distanceGet(){
        return distance;
    }
    /**
     * Getter for the object's diameter.
     * @return Return the object's diameter.
     */
    public double diameterGet(){
        return diameter;
    }
    /**
     * Getter for the object's colour.
     * @return Return the object's colour.
     */
    public String colGet(){
        return col;
    }
    /**
     * A method that draw the Solar Object onto the existing frame.
     * @param solarSystem the frame being drawn onto.
     */
    public void draw(SolarSystem solarSystem){
        solarSystem.drawSolarObject(this.distance,this.angle, this.diameter, this.col);
        this.angleInc();
    }
}
