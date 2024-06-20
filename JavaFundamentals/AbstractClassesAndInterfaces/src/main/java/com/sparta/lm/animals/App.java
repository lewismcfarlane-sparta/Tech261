package com.sparta.lm.animals;

import diamondproblem.trainee.DevOpsTrainee;
import diamondproblem.trainee.JavaTrainee;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("Max", "Terrier", 2);
        Animal cat = new Cat("Fred", "Tabby", 6);

        Dog[] dogs = {};
        Animal[] animals = {dog, cat};

        cat.play();
        ((Cat) cat).climb();
        dog.play();

        JavaTrainee Alex = new JavaTrainee();
        Alex.test();

        DevOpsTrainee Jim = new DevOpsTrainee();
        Jim.test();





    }
}
