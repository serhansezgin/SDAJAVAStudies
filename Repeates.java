package lesson7;

import java.util.Scanner;

public class Repeates {

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in); //creating an object
        double input = scanner.nextDouble(); //Nextline method: reads the user input input as sentence




        //System.out.println(new DecimalFormat("0.00").format(input));

        double R = input;
        //R=Math.round(R*100.0)/100.0;
        R=Math.floor(R*100.0)/100.0;

        System.out.println(R);





    }
}

