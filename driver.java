import java.awt.Dimension;
import java.awt.Toolkit;

public class driver
{
    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        SolarSystem solarSystem = new SolarSystem((int) screenSize.getWidth(),(int) screenSize.getHeight());

        Planet Sun = new Planet("Sun", 0, 0, 100, "YELLOW");
        Planet Mecury = new Planet("Mecury", 85, 47.87, 30, "ORANGE");
        Planet Venus = new Planet("Venus", 130, 35.2, 50, "ORANGE");
        Planet Earth = new Planet("Earth", 200, 30, 10, "BLUE");
        Planet Mars = new Planet("Mars", 240, 24, 5, "RED");
        Planet Jupiter = new Planet("Jupiter", 340 , 13, 70, "BROWN");
        Planet Saturn = new Planet("Saturn", 420 , 9, 60, "YELLOW");
        Planet Uranus = new Planet("Uranus", 500, 6, 55, "GREEN"); 
        Planet Neptune = new Planet("Neptune", 600, 5, 60,"BLUE" );
        Planet[] planets = {Sun,Mecury,Venus, Earth,Mars,Jupiter,Saturn,Uranus,Neptune};

        Moon LoMoon = new Moon("lo",50,80,3, "YELLOW",Jupiter);
        Moon EuropaMoon = new Moon("Europa", 60, 90, 4, "WHITE",Jupiter);
        Moon Moon = new Moon("Moon", 30, 100, 3,"WHITE",Earth);
        Moon[] moons = {LoMoon,EuropaMoon,Moon};

        AsteroidBelt asteroidBelt = new AsteroidBelt(100,solarSystem);
        while(true){
            for(Planet planet: planets ){
                planet.draw(solarSystem);
            }
            for(Moon moon: moons){
                moon.draw(solarSystem);
            }
            asteroidBelt.draw();
            
            solarSystem.finishedDrawing();
        }
    }
}