// The Factory Pattern in system design is a creational pattern that provides an interface
// to create objects,
// allowing the actual instantiation logic to be hidden from the client.
package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory obj=new ShapeFactory();
        Shape obj1= obj.getShape("CIRCLE");
        obj1.draw();
    }
}
