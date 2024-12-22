package com.abhinav.pizzaoutlet.toppings;

import com.abhinav.pizzaoutlet.basepizza.BasePizza;

public class Nachos extends Toppings implements ToppingsInterface{

    private BasePizza basePizza;

    public Nachos(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public double cost() {
        return this.basePizza.cost() + 80.0;
    }
}
