package studies;

public class FibonacciRecursive {

    public static int fib(int n){
        if(n==1) return 1;
        if(n==0) return 1;
        return fib(n-1)+fib(n-2);
    }

//fib 10 : fib9 + fib8
    //fib 9 : fib8 + fib 7
    //fib 8 : fib 7 + fib 6
   //fib 7 : fib6 + fib 5

    public static void main(String[] args) {
        // 1 1 2 3 5 8
        for(int i=0;i<10;i++)
        System.out.println(fib(i));
    }
}
