package it.kluth.fizzbuzz;

import java.util.Map.Entry;

public class Program {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Pass min and max as arguments.");
            System.exit(1);
        }

        var min = Integer.parseInt(args[0]);
        var max = Integer.parseInt(args[1]);

        for (Entry<Integer, String> entry : FizzBuzz.generate(min, max).entrySet()) {
            System.out.println(String.format("Index: %d Value: %s", entry.getKey(), entry.getValue()));
        }
    }
}
