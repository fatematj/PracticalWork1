package org.example;

public class FirstTask {

    public static int countDigits(String text) {
        return countDigits(text, 0);
    }

    private static int countDigits(String text, int index) {
        if (index == text.length()) {
            return 0;
        }

        char current = text.charAt(index);

        int currentResult;

        if (current >= '0' && current <= '9') {
            currentResult = 1;
        } else {
            currentResult = 0;
        }

        return currentResult + countDigits(text, index + 1);
    }
}
