package lesson8;

import java.util.Scanner;

public class DivisionTeacher {
    public static void main(String[] args) {

        double divident;
        double divider;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base value: ");
        divident = scanner.nextDouble();


        while(true){
            System.out.println("Please enter the divider value: ");
            divider = scanner.nextDouble();


            if (divider != 0){

                double result = divident / divider;
                divident = result;
                System.out.println("The result of division is: " + roundWithDecimalPlaces(result,4));
            } else {
                System.out.println("Bye");
                break;
            }
        }
    }
    public static double roundWithDecimalPlaces (Double value, long places){
        long factor =(long) Math.pow(10,places);
        return Math.round(value * factor) / (double)factor;
    }
}