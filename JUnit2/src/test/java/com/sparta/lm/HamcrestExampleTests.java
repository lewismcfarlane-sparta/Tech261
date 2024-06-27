package com.sparta.lm;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTests {
    private Spartan lewis;
    private Spartan alex;

    @BeforeEach
    void setup() {
        lewis = new Spartan(1, "Lewis", "Java", LocalDate.of(2024, 6, 10));
        alex = new Spartan(2, "Alex", "C#", LocalDate.of(2021, 3, 3));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests {
        @Test
        @DisplayName("Check that spartan is called Lewis")
        void checkThatSpartanIsCalledLewis() {
            assertThat(lewis.getName(), equalTo("Lewis")); //Fluent API - methodology of writing code so its close as human english as possible
        }

        @Test
        @DisplayName("check that spartan has a field called name")
        void checkThatSpartanHasAFieldCalledName() {
            assertThat(lewis, hasProperty("name"));
        }

        @Test
        @DisplayName("check that spartan has a field called course set to Java")
        void checkThatSpartanHasAFieldCalledCourseSetToJava() {
            assertThat(lewis, hasProperty("course", equalTo("Java")));
        }
    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods {
        @Test
        @DisplayName("check that name is not empty or null")
        void checkThatNameIsNotEmptyOrNull() {
            assertThat(lewis.getName(), is(emptyOrNullString()));
        }

        @Test
        @DisplayName("check that name ends with is")
        void checkThatNameEndsWithIs() {
            assertThat(lewis.getName(), endsWith("is"));
        }


    }
}
