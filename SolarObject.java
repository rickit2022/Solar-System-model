public class SolarObject{
    private String name;
    private double angle;
    private double distance;
    private double size;
    private String col;

    public SolarObject(String name,double distance, double angle,double size, String col){
        this.name = name;
        this.angle = angle;
        this.distance = distance;
        this.size = size;
        this.col = col;
    } 

    public void drawSolarObject(SolarSystem solarSystem){
        solarSystem.drawSolarObject(distance, angle, size, col);
        angle *= 2;
    }
}