package it.kluth.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    private FizzBuzz() {
        throw new IllegalStateException();
    }

    public static Map<Integer, String> generate(int min, int max) {
        var collector = new HashMap<Integer, String>();
        for (var index : IntStream.range(min, max + 1).toArray()) {
            var value = "";
            if (index % 3 == 0) {
                value += "Fizz";
            }
            if (index % 5 == 0) {
                value += "Buzz";
            }
            collector.put(index, value);
        }
        return collector;
    }

}
