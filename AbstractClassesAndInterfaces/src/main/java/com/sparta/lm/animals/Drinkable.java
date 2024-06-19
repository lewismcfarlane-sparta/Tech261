package com.sparta.lm.animals;

public interface Drinkable extends Sleepable {

//    public static final int max = 10;
    int max = 10; // constant

//    public abstract void drink();
    void drink();

    default void print() {
        printFromInterface();
    }

    private static void printFromInterface() {
        System.out.println("I am printing from an Interface");
    }

    static void doSomething() {
        System.out.println("Static method");
    }

    //public, private, default, protected

}
