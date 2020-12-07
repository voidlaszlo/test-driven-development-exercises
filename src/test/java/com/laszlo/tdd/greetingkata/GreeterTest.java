package com.laszlo.tdd.greetingkata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    Greeter greeter = new Greeter();


    @Test void
    givenName_whenGreet_thenReturnsCorrectGreeting() {
        // GIVEN
        final String name = "John";
        String expected = "Hello, " + name + ".";

        // WHEN
        String actual = greeter.greet(name);

        // THEN
        assertEquals(expected, actual);
    }

    @Test void
    givenNoName_whenGreet_thenReturnsStandInGreeting() {
        // GIVEN
        final String name = null;
        String expected = "Hello, my friend.";

        // WHEN
        String actual = greeter.greet();

        // THEN
        assertEquals(expected, actual);
    }

    @Test void
    givenAllUppercaseName_whenGreet_thenReturnsShoutedGreeting() {
        // GIVEN
        final String name = "JERRY";
        String expected = "HELLO " + name + "!";

        // WHEN
        String actual = greeter.greet(name);

        // THEN
        assertEquals(expected, actual);
    }

    @Test void
    givenTwoNames_whenGreet_thenReturnsCorrectGreeting() {
        // GIVEN
        final List<String> names = List.of("Jill", "Jane");
        String expected = "Hello, Jill and Jane.";

        // WHEN
        String actual = greeter.greet(names);

        // THEN
        assertEquals(expected, actual);
    }

    @Test void
    givenMoreThanTwoNames_whenGreet_thenReturnsCorrectGreeting() {
        // GIVEN
        final List<String> names = List.of("Amy", "Brian", "Charlotte");
        String expected = "Hello, Amy, Brian and Charlotte.";

        // WHEN
        String actual = greeter.greet(names);

        // THEN
        assertEquals(expected, actual);
    }


}