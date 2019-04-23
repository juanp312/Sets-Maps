
public class Planet extends SolarSystem {
    public Planet(String name, double period) {
        super(name, period, BodyType.PLANET);
    }

    @Override
    public boolean addSat(SolarSystem moon) {
        if(moon.getType() == BodyType.MOON){
            return  super.addSat(moon);
        }else{
            return  false;
        }
    }
}
