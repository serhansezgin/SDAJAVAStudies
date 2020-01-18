package one;

public class First {

    /**
     * Problem :
     *
     * Your task is to create a method fibonacciAverage(int COUNT)
     * that returns the average of COUNT first Fibonacci numbers.
     *
     * What is fibonacci ?
     *
     * In the Fibonacci sequence of numbers, each number is the sum of the previous after numbers,
     * starting with 1 and 1. This sequence begins: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
     * F(0) = 0
     * F(1) = 1
     * F(2) = 1
     * F(3) = 2
     */

    public static void main(String[] args) {
        int fib2 = fibonacci(2);
        System.out.println("fib(2) = " + fib2);
        System.out.println("Average of 2 fibonacci number is " + getAverageFibonacci(2));

        int fib5 = fibonacci(5);
        System.out.println("fib(5) = " + fib5);
        System.out.println("Average of 5 fibonacci number is " + getAverageFibonacci(5));

        int fib8 = fibonacci(8);
        System.out.println("fib(8) = " + fib8);
        System.out.println("Average of 8 fibonacci number is " + getAverageFibonacci(8));

        int fibMax = fibonacci(Integer.MAX_VALUE);
    }

    public static int getAverageFibonacci(int count){
        int[] arr = new int[count];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fibonacci(i+1);
            sum += arr[i];
        }
        return sum/count;
    }

    private static int fibonacci(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
