package com.sparta.lm;

class Pig extends Animal implements AnimalInterface {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {

    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    @Override
    void sound() {

    }
}