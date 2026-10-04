package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void factorialLongBaseCase() {
        assertEquals(1, Factorial.factorialLong(0));
    }

    @Test
    void factorialLongRecursiveCases() {
        assertEquals(1, Factorial.factorialLong(1));
        assertEquals(2, Factorial.factorialLong(2));
        assertEquals(6, Factorial.factorialLong(3));
        assertEquals(120, Factorial.factorialLong(5));
    }

    @Test
    void factorialBigIntegerBaseCase() {
        assertEquals(
                BigInteger.ONE,
                Factorial.factorialBigInteger(0)
        );
    }

    @Test
    void factorialBigIntegerRecursiveCases() {
        assertEquals(
                BigInteger.valueOf(120),
                Factorial.factorialBigInteger(5)
        );

        assertEquals(
                new BigInteger("3628800"),
                Factorial.factorialBigInteger(10)
        );
    }

    @Test
    void compareLongAndBigInteger() {
        BigInteger factorial20 =
                Factorial.factorialBigInteger(20);

        BigInteger factorial20Long =
                BigInteger.valueOf(Factorial.factorialLong(20));

        assertEquals(factorial20, factorial20Long);

        BigInteger factorial21 =
                Factorial.factorialBigInteger(21);

        BigInteger factorial21Long =
                BigInteger.valueOf(Factorial.factorialLong(21));

        assertNotEquals(factorial21, factorial21Long);
    }
}
