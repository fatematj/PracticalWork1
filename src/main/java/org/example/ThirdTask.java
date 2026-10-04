package org.example;

public class ThirdTask {

    public static void generateSubsets(
            int[] values,
            int index,
            int[] current,
            int currentSize
    ) {
        if (index == values.length) {
            System.out.print("{ ");

            for (int i = 0; i < currentSize; i++) {
                System.out.print(current[i] + " ");
            }

            System.out.println("}");
            return;
        }

        // Do not include the current element
        generateSubsets(values, index + 1, current, currentSize);

        // Include the current element
        current[currentSize] = values[index];
        generateSubsets(values, index + 1, current, currentSize + 1);
    }
}