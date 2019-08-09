package lesson7;

import java.util.Scanner;

public class TwoValuesAgain {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int value1 =  input.nextInt();
        System.out.println("Enter second number: ");
        int value2 =  input.nextInt();

        double result =  (double) value1 / value2;

        //System.out.println("First Number %d , Second Number %d" .format(value1,value2));
        System.out.println(result);

    }
}
