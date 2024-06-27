package com.sparta.lm;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTests {

    @Disabled
    @RepeatedTest(value = 10, name = "{currentRepetition}")
    @DisplayName("Repeated Test")
    void repeatedTest() {
        Assertions.assertEquals(1, 1);

    }

    @Test
    @Disabled("Waiting for method to be completed")
    @DisplayName("Check name of Spartan")
    void checkNameOfSpartan() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("Assumptions")
    void anotherTest() {
        Assumptions.assumeTrue(false);
        Assertions.assertEquals(1, 1);
    }

    //4 different Hooks, beforeAll - once before all tests,
    // beforeEach - before each test,
    // afterAll - once after all tests,
    // afterEach - after each test

    // beforeAll and afterAll are static methods.
    //use case is connection to a database before tests, then disconnect at the end

    private static Spartan manish;

    @BeforeAll // often for instantiating variables
    static void setupAll(TestInfo testInfo) {
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
        System.out.println(testInfo.getDisplayName());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {

    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {

    }

    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("getListOfNames")
    void checkLengthOfString(String name) {
        Assertions.assertEquals(5, name.length());
    }
    public static Stream<Arguments> getListOfNames() {
        return Stream.of(
                Arguments.of("Manish"),
                Arguments.of("Alex"),
                Arguments.of("Lewis")
        );
    }






}
