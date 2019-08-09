package lesson2;

import java.util.Scanner;

import java.lang.Integer;

public class BiggerNumberFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Number 1 below and press enter");
        Integer number1 = input.nextInt();
        System.out.println("Input Number 2 below and press enter too");
        Integer number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("Number1 bigger than Number2, Which are Number1 is " + number1 + " and Number2 is " + number2 + " and the biggest one is " + number1);
        }
        else if (number1 == number2) {
            System.out.println("Number1 equals to Number2, Which are Number1 is " + number1 + " and Number2 is " + number2 + " They are the same. ");
        }
        else
            System.out.println("Number1 little than Number2, Which are Number1 is " + number1 + " and Number2 is " + number2 + " and the biggest one is " + number2);
    }

}



