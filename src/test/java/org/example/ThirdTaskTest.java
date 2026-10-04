package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTaskTest {

    @Test
    void generatesEightSubsetsForThreeElements() {
        int[] values = {1, 2, 3};
        int[] current = new int[values.length];

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        ThirdTask.generateSubsets(values, 0, current, 0);

        System.setOut(originalOut);

        String result = output.toString().trim();

        long numberOfLines = result.lines().count();

        assertEquals(8, numberOfLines);
    }
}
