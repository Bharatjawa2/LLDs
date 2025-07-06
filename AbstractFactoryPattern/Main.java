//The Abstract Factory Pattern is a creational design pattern that provides an interface
// for creating families of related or dependent objects without
// specifying their concrete classes.

// (Factory of Factories)

package AbstractFactoryPattern;

import AbstractFactoryPattern.vehicle.Vehicle;
import AbstractFactoryPattern.vehicleFactory.vehicleFactory;

public class Main {
    public static void main(String[] args) {
        vehicleFactory obj=vehicleFactoryProducer.getvehicleType("LUXURY");
        Vehicle obj1= obj.getVehicle("MERCEDES");
        obj1.start();

        vehicleFactory obj3=vehicleFactoryProducer.getvehicleType("ORDINARY");
        Vehicle obj4= obj3.getVehicle("ALTO");
        obj4.start();
    }
}
