package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class ExtraDeleight extends BasePizza {
    BasePizza pizza;
    public ExtraDeleight(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+50;
    }
}
