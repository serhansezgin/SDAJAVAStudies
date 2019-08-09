/*
Create a class.
This class will have main method.
print user to get a number double
assign it to double variable

print user to get a second number double
assign it to double variable


multiply these 2 numbers

if it is bigger then 1000 below 2000 included
print you are it is between 1000-2000 included.
if below 1000
print it is below 1000
if above 2000
then print above 2000

 */

package lesson2;

import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in); //creating an object
        double input = scanner.nextInt(); //Nextline method: reads the user input input as sentence

        System.out.println("Please enter second number");
        Scanner scanner2 = new Scanner(System.in); //creating an object
        double input2 = scanner.nextInt(); //Nextline method: reads the user input input as sentence

        double result = input * input2;

        System.out.println(result);


        if (result>1000 && result<=2000)
            System.out.println("you are it is between 1000-2000 included.");
            if (result<1000)
            System.out.println("it is below zero");
        if (result>2000)
            System.out.println("it is above 2000");



    }

}
