package com.sparta.lm.animals;

public class Cat extends Animal implements Drinkable, Sleepable {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " does not want to play.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    public void climb() {
        System.out.println("Cat is climbing");
    }

    @Override
    public void drink() {
        Drinkable.doSomething();
    }


    @Override
    public String goToSleep() {
        return "";
    }
}
