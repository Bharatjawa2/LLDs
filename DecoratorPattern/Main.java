package DecoratorPattern;

import DecoratorPattern.PizzaTypes.Margherita;
import DecoratorPattern.Toppings.ExtraDeleight;
import DecoratorPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args){
        BasePizza obj=new Mushroom(new ExtraDeleight(new Margherita()));
        System.out.println(obj.cost());
    }
}
