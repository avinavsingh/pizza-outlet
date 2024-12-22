package com.abhinav.pizzaoutlet.toppings;


import com.abhinav.pizzaoutlet.basepizza.BasePizza;

public class ExtraCheese extends Toppings implements ToppingsInterface{

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return this.basePizza.cost() + 35.0;
    }
}
