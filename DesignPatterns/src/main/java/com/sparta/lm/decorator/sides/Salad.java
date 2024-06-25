package com.sparta.lm.decorator.sides;

import com.sparta.lm.decorator.Pizza;

public class Salad extends Sides {

    public Salad(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
