package DecoratorPattern.PizzaTypes;

import DecoratorPattern.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 299;
    }
}
