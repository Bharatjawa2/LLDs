package DecoratorPattern.PizzaTypes;

import DecoratorPattern.BasePizza;

public class Margherita extends BasePizza {

    @Override
    public int cost() {
        return 199;
    }
}
