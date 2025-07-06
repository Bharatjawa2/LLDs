package AbstractFactoryPattern;

import AbstractFactoryPattern.vehicleFactory.LuxuryVehicle;
import AbstractFactoryPattern.vehicleFactory.OrdinaryVehicle;
import AbstractFactoryPattern.vehicleFactory.vehicleFactory;

public class vehicleFactoryProducer {
    public static vehicleFactory getvehicleType(String s){
        switch (s){
            case "LUXURY":
                return new LuxuryVehicle();
            case "ORDINARY":
                return new OrdinaryVehicle();
            default:
                return null;
        }
    }
}
