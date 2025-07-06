package AbstractFactoryPattern.vehicleFactory;

import AbstractFactoryPattern.vehicle.*;

public class OrdinaryVehicle implements vehicleFactory{
    @Override
    public Vehicle getVehicle(String s) {
        switch(s){
            case "SWIFT":
                return new Swift();
            case "ALTO":
                return new Alto();
            default:
                return null;
        }
    }
}
