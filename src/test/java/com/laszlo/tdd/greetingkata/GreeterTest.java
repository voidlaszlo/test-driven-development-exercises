package com.laszlo.tdd.greetingkata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    Greeter greeter = new Greeter();


    @Test void
    givenName_whenGreet_thenReturnsCorrectGreeting() {
        // GIVEN
        final String name = "John";
        String expected = "Hello, " + name;

        // WHEN
        String actual = greeter.greet(name);

        // THEN
        assertEquals(expected, actual);
    }

}