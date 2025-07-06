package AbstractFactoryPattern.vehicleFactory;

import AbstractFactoryPattern.vehicle.BMW;
import AbstractFactoryPattern.vehicle.Mercedes;
import AbstractFactoryPattern.vehicle.Vehicle;

public class LuxuryVehicle implements vehicleFactory{
    @Override
    public Vehicle getVehicle(String s) {
        switch(s){
            case "BMW":
                return new BMW();
            case "MERCEDES":
                return new Mercedes();
            default:
                return null;
        }
    }
}
