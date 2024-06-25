package com.sparta.lm.decorator.sides;

import com.sparta.lm.decorator.Pizza;

public class Chips extends Sides {
    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }
}
