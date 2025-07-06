package AbstractFactoryPattern.vehicleFactory;

import AbstractFactoryPattern.vehicle.Vehicle;

public interface vehicleFactory {
    Vehicle getVehicle(String s);
}
