package com.abhinav.pizzaoutlet;


import com.abhinav.pizzaoutlet.basepizza.BasePizza;
import com.abhinav.pizzaoutlet.basepizza.ChickenPizza;
import com.abhinav.pizzaoutlet.basepizza.VegPizza;
import com.abhinav.pizzaoutlet.toppings.ExtraCheese;
import com.abhinav.pizzaoutlet.toppings.Nachos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PizzaOutlet {
    public static void main(String[] args) throws Exception{
        List<String> pizzaOrder;
        Scanner scanner = new Scanner(System.in);
        String pizzaOrderInput = scanner.nextLine();
        pizzaOrder = Arrays.asList(pizzaOrderInput.trim().toUpperCase().split(","));
        BasePizza basePizza;
        switch (pizzaOrder.get(0)) {
            case "CHICKEN PIZZA":
                basePizza = new ChickenPizza();
                break;
            case "VEG PIZZA":
                basePizza = new VegPizza();
                break;
            default:
                throw new Exception("Invalid base option selected");
        }
        for(int i=1;i<pizzaOrder.size();i++) {
            switch (pizzaOrder.get(i).trim()) {
                case "EXTRA CHEESE":
                    basePizza = new ExtraCheese(basePizza);
                    break;
                case "NACHOS":
                    basePizza = new Nachos(basePizza);
                    break;
                default:
                    throw new Exception("Invalid toppings selected");
            }
        }
        System.out.println("Total amount to be paid is: "+basePizza.cost());
    }
}
