package com.sparta.lm;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Terrier", 2);
        Cat cat = new Cat("Fred", "Tabby", 6);

        cat.play();
        dog.play();
        dog.play("Jim");
    }
}
