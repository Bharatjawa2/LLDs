package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class ExtraCheese extends BasePizza {
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+30;
    }
}
