package lesson7;

import java.util.Scanner;

public class IfComparison
{
    public static void main(String[] args) {
        int border = 30;
        // write an application that will show if entered values are greater, equal or lower than 30.
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int output = input.nextInt();

        if (output>border)
            System.out.println("the number you entered is greater than " + border);
        else if (output<0)
            System.out.println("You must enter a positive number");
        else if (output<30)
            System.out.println("the number you entered is lower than " + border);
        else if (output == 30)
            System.out.println("the number is equal to " + border);

        else
            System.out.println("you are living in another galaxy");























    }

}
