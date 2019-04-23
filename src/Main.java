import com.sun.xml.internal.ws.policy.jaxws.SafePolicyReader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, SolarSystem> universe = new HashMap<>();
    private static Set<SolarSystem> planets = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("PLANETS");

        SolarSystem test1 = new Planet("MARS", 7820);
        universe.put(test1.getName(), test1);
        planets.add(test1);

        test1 = new Planet("Venus", 9505);
        universe.put(test1.getName(), test1);
        planets.add(test1);

        test1 = new Planet("Mercury", 6508);
        universe.put(test1.getName(), test1);
        planets.add(test1);

        test1 = new Planet("Saturn", 8850);
        universe.put(test1.getName(), test1);
        planets.add(test1);

        test1 = new Planet("Neptune", 5890);
        universe.put(test1.getName(), test1);
        planets.add(test1);

        for (SolarSystem planet : planets) {
            System.out.println("\t" + planet.getName() + " : " + planet.getPeriod());
        }
            System.out.println("MOONS");

            Set<SolarSystem> moons = new HashSet<>();
            for (SolarSystem planet : planets) {
            moons.addAll(planet.getSatellite());
        }
            SolarSystem test2 = new Moon("Wolf", 100);
            universe.put(test2.getName(), test2);
            test1.addSat(test2);

            test2 = new Moon("Snow", 98);
            universe.put(test2.getName(), test2);
            test1.addSat(test2);

            test2 = new Moon("Pink", 86);
            universe.put(test2.getName(), test2);
            test1.addSat(test2);

            test2 = new Moon("Worm", 76);
            universe.put(test2.getName(), test2);
            test1.addSat(test2);

            test2 = new Moon("Buck", 90);
            universe.put(test2.getName(), test2);
            test1.addSat(test2);

            for(SolarSystem moon : moons) {
                System.out.println("\t" + moon.getName());
            }

            SolarSystem type = universe.get("MARS");
            System.out.println("MOON OF  " + type.getName());
            for(SolarSystem marsMoon : type.getSatellite()){
                System.out.println("\t" + marsMoon.getName());
            }
        }
    }


