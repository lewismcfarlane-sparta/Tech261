package com.sparta.lm;

public class Program {
    public static void main(String[] args) { // Entry point (methods)
        int timeOfDay = 21; // type, name, value.
        getGreeting(timeOfDay);
    }

    private static void getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}

