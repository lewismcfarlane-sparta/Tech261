package com.sparta.lm.decorator;

public class Italian extends Pizza {
    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
