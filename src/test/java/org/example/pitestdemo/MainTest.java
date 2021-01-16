package org.example.pitestdemo;

import org.example.pitestdemo.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void test_shouldThrowException() {
        assertThrows(NullPointerException.class, () -> Main.sumOfEvenNumbers(null));
    }

    @Test
    public void test_sumShouldBeZeroIfNoEvenNumberFound() {
        final int result = Main.sumOfEvenNumbers(1, 3, 5, 7);
        assertEquals(0, result);
    }

    @Test
    public void test_shouldReturnSumOfEvenNumbers() {
        final int result = Main.sumOfEvenNumbers(1, 2, 3, 4, 5, 6);
        assertEquals(12, result);
    }
}
