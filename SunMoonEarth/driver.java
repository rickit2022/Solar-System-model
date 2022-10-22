public class driver {
    public static void main(String[] args){
        int angle = 1;
        int moonAngle = 10;
        SolarSystem s1 = new SolarSystem(1000,1000);
        while(true){
            s1.drawSolarObject(0, 0, 200, "YELLOW");
            s1.drawSolarObject(300, angle, 100, "BLUE");
            s1.drawSolarObjectAbout(100, moonAngle , 50, "WHITE", 300, angle);
            s1.finishedDrawing();
            angle += 1;
            moonAngle += 10;
        }
    }
}