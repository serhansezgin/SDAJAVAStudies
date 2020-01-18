package one;

import java.util.*;

public class Second {

    /**
     *
     * Why we need collections ?
     *
     *
     * Memoization ensures that a method doesn't run for the same inputs more than once
     * by keeping a record of the results for the given inputs (usually in a hash map).
     *
     */
    private static Map<Integer, Integer> fiboMap = new HashMap<>();

    public static int fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");

            // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (fiboMap.containsKey(n)) {
            System.out.printf("grabbing fiboMap[%d]\n", n);
            return fiboMap.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);

        // memoize
        fiboMap.put(n, result);

        return result;
    }

    public static OptionalDouble fibonacciAverage(int n) {
        fibonacci(n);
        List<Integer> values = new ArrayList<>(fiboMap.values());

        return values.stream().mapToInt(value -> value).average();
    }

}
