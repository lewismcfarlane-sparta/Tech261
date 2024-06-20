package com.sparta.lm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//public class ProgramTest {
//
//    @Test // @ carries Meta data (data about other data),
//    @DisplayName("This is my first test")        // Passes this to the JVM
//                                                // annotations are used to passed data to the JVM
//    public void basicTest() {
//        Assertions.assertTrue(5 == 5);
//    }
//}


public class ProgramTest {
    @Test
    @DisplayName("Given a time of 9, then the greeting should be Good morning!")
    void checkThat9GivesGoodMorning() {
        int time = 9;
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 14, then the greeting should be Good afternoon!")
    void checkThat14GivesGoodAfternoon() {
        int time = 14;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good evening!")
    void checkThat21GivesGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 23, then the greeting should be Goodnight!")
    void checkThat21GivesGoodnight() {
        int time = 23;
        String expectedGreeting = "Goodnight!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }


    // Boundary tests

    @Test
    @DisplayName("Given a time of 0, then the greeting should be Goodnight! ")
    void checkThat0GivesGoodnight() {
        int time = 0;
        String expectedGreeting = "Goodnight!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 5, then the greeting should be Good afternoon!")
    void checkThat5GivesGoodMorning() {
        int time = 5;
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good afternoon!")
    void checkThat12GivesGoodAfternoon() {
        int time = 12;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 18, then the greeting should be Good evening!")
    void checkThat18GivesGoodEvening() {
        int time = 18;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    @DisplayName("Given a time of 22, then the greeting should be Goodnight!")
    void checkThat22GivesGoodnight() {
        int time = 22;
        String expectedGreeting = "Goodnight!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
}