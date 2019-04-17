import java.util.HashSet;
import java.util.Set;

public class SolarSystem {

    private final String name;
    private final double period;
    private final Set<SolarSystem> satellite;
    private final BodyType type;

    public SolarSystem(String name, double period, BodyType type) {
        this.name = name;
        this.period = period;
        this.satellite = new HashSet<>();
        this.type= type;
    }
    public String getName() {
        return name;
    }
    public double getPeriod() {
        return period;
    }
    public Set<SolarSystem> getSatellite() {
        return new HashSet<>(this.satellite);
    }
    public boolean addSat(SolarSystem moon) {
        return this.satellite.add(moon);
    }
    public BodyType getType() {
        return type;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return  true;
        }
        System.out.println("Obj.getClass() is + " + obj.getClass());
        System.out.println("this.getClass() is + " + this.getClass());
        if(obj instanceof SolarSystem){
            SolarSystem object = (SolarSystem) obj;
            if(this.name.equals(object.getName())){
                return this.type == object.getType();
            }
        }
        return  false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57 + this.type.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.type + " , " + this.period;
    }

    // Body Types
    public enum BodyType {
        PLANET,
        STAR,
        ASTEROID,
        METEOR,
        COMET,
        MOON
    }
}


