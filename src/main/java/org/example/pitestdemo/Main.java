package org.example.pitestdemo;

import java.util.Objects;

public class Main {

    public static int sumOfEvenNumbers(int... numbers) {
        Objects.requireNonNull(numbers);

        int sum = 0;

        for (final int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
