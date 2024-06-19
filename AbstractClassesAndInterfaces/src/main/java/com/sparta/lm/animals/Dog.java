package com.sparta.lm.animals;

public class Dog extends Animal implements Drinkable, Sleepable {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }


    // 3 ways to overload a method
    // name has to be the same
    // overload based on:
    // 1. Return type
    // 2. Type of parameters
    // 3. Order of parameters

    public void play(String name) {
        System.out.println(name + " wants to play with " + super.getName());
    }

    @Override
    public void drink() {

    }

    @Override
    public String goToSleep() {
        return  "";
    }
}
