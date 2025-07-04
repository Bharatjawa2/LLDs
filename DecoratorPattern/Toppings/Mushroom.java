package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class Mushroom extends BasePizza {
    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza=pizza;
    }
    public int cost() {
        return this.pizza.cost()+80;
    }
}
