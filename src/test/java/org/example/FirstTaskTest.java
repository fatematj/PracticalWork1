package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTaskTest {

    @Test
    void baseCaseEmptyString() {
        assertEquals(0, FirstTask.countDigits(""));
    }

    @Test
    void stringWithoutDigits() {
        assertEquals(0, FirstTask.countDigits("abc"));
    }

    @Test
    void stringWithSeveralDigits() {
        assertEquals(3, FirstTask.countDigits("a1b23"));
    }

    @Test
    void stringContainingOnlyDigits() {
        assertEquals(4, FirstTask.countDigits("2024"));
    }
}
