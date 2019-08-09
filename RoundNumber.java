package lesson7;

import java.util.Scanner;

public class RoundNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating an object

        System.out.println("Please enter first number");
        double value = scanner.nextDouble(); //Nextline method: reads the user input input as sentence

        double roundValue = roundWithDecimalPlaces(value,2);
        System.out.println("Your value rounded is: " + roundValue);
}


public static double roundWithDecimalPlaces(Double value, long places){
    long factor = (long) Math.pow(10,places);
            return Math.round(value*factor)/(double)factor;
    }
}