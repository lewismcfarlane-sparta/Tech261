package com.sparta.lm;

public class Program {
    public static void main(String[] args) { // Entry point (methods)
        int timeOfDay = 21; // type, name, value.
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good afternoon!";
        } else if (timeOfDay >= 18 && timeOfDay < 22) {
            greeting = "Good evening!";
        } else if ((timeOfDay >= 22 && timeOfDay <= 24) || (timeOfDay >= 0 && timeOfDay < 5 )) {
            greeting = "Goodnight!";
        } else {
            greeting = "Invalid time of day!";
        }

        return greeting;
    }
}

