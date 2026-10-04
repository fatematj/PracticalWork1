package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTaskTest {

    @Test
    void baseCases() {
        assertEquals(0, SecondTask.fib(0));
        assertEquals(1, SecondTask.fib(1));
    }

    @Test
    void recursiveCases() {
        assertEquals(1, SecondTask.fib(2));
        assertEquals(2, SecondTask.fib(3));
        assertEquals(8, SecondTask.fib(6));
    }
}
