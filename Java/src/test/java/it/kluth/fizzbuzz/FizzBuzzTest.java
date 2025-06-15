package it.kluth.fizzbuzz;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void generateYieldsExpectedResults() {
        var result = FizzBuzz.generate(1, 16);

        var expected = Map.ofEntries(
                Map.entry(1, ""),
                Map.entry(2, ""),
                Map.entry(3, "Fizz"),
                Map.entry(4, ""),
                Map.entry(5, "Buzz"),
                Map.entry(6, "Fizz"),
                Map.entry(7, ""),
                Map.entry(8, ""),
                Map.entry(9, "Fizz"),
                Map.entry(10, "Buzz"),
                Map.entry(11, ""),
                Map.entry(12, "Fizz"),
                Map.entry(13, ""),
                Map.entry(14, ""),
                Map.entry(15, "FizzBuzz"),
                Map.entry(16, ""));

        Assertions.assertEquals(expected, result);
    }
}
