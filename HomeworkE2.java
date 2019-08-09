/*


Get a number from the user.
Find if that number if it is fibonnaci or not.
 */
//https://www.youtube.com/watch?v=TLqpGfhMxMs&list=PLh9ECzBB8tJNWhY-uH1RrvAFI88vC-Snh&index=23
package lesson3;

import java.util.Scanner;

public class HomeworkE2 {

//function must be called from here
// ...   recursive functions are prohibited in military because
// of security vulnerabilities

    public static int f(int x){
        if (x == 10) return 10;
        System.out.println("x:"+x);
        return x+f(x+1);
    }


    public static void main(String[] args) {




        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Input a Number below and press enter");
        Integer number1 = input.nextInt();
//fibonacci
        //1 1 2 3 5 8 13 21
        //a b c
        //  a b c
        //    a b c
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);;
        for (int i = 0; i < number1; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
*/


        //fibonacci with arrays


/*
        int fib[] = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 0; i < 8; i++) {
            fib[i + 2] = fib[i + 1] + fib[i];

        }
       for(int i = 2;i<10;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        //for (int i = 0; i < 10; i++) {
         //   System.out.println(fib[i]);
        //}
*/


//fibonacci with recursive functions



//f(0): 0 + f(1)
//f(1): 1 + f(2)
//f(2): 2 = f(3)
//..
//f(8): 8 + f(9) -> 9+10
//f(9): 9 + f(10) -> 9+10
//f(10): 10

    /*int toplam =0;
        for (int i =0;i<10;i++){
            toplam += i+1;
            System.out.println("toplam:" + toplam + " i:" + i);

        }
        System.out.println("Toplam deger:" + toplam);

*/

        System.out.println("f(0):" + f(0));





























    }
}



