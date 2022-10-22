public class driver{
    public static void main(String[] args){
        SolarSystem solarSystem = new SolarSystem(1000,1000);
        SolarObject Sun = new SolarObject("Sun", 0, 0, 200, "YELLOW");
        SolarObject Mecury = new SolarObject("Mecury", 254, 47.87, 300/277, "ORANGE");
        while(true){
            Sun.drawSolarObject(solarSystem);
            Mecury.drawSolarObject(solarSystem);
            solarSystem.finishedDrawing();
        }
    }
}