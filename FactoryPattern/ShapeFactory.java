package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return  null;
        }
    }
}
