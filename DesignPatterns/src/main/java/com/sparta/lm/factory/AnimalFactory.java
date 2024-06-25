package com.sparta.lm.factory;

public class AnimalFactory {
    //Gives access to objects but hides how they are created
    //Good example of LSP (SOLID)
    public static Speakable getAnimal(String animal) {
        return switch (animal) {
            case "Dog" -> new Dog();
//            case "Hound Dog" -> new Dog("specificParameters");
            case "Cat" -> new Cat();
            case "Goldfish" -> new Goldfish();
            default -> null;
        };
    }
}
