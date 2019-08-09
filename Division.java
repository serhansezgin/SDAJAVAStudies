package lesson8;

import java.util.Scanner;
import java.util.function.Function;

public class Division {


// write a divide by application. User should be able to enter initial value that will be divided in a loop
// by a new value entered by a user. Division should occur as long as entered value will be different than 0
// Result of division should be rounded to the fourth decimal point and printed to the consol


    public static void main(String[] args) {
        System.out.println("Please enter a huge number to start the divide: ");

        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();

        System.out.println("Please enter a number to divide your previous huge number: ");

        int s2 = scan.nextInt();
        while (s2!=0){
            double result =  division(s1,s2);
            System.out.println(result);

            //System.out.println("Please enter a number to divide your previous huge number: ");
            //s2 = scan.nextInt();
            break;
        }


        if (s2==0){
        System.out.println("Bye");}
/*
        float result = s/(float)s2;
        System.out.println(result);

        System.out.println("Please a number again to divide");
        int s3 = scan.nextInt();
        float result1 = result/(float)s3;
        System.out.println(result1);

        System.out.println(result/s);
*/

    }

    public static double division(double s1, double s2) {
        return s1/s2;
    }

}
