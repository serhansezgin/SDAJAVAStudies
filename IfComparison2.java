package lesson7;

import java.util.Scanner;

public class IfComparison2 {



        public static void main(String[] args) {
            int border = 30;
            // write an application that will show if entered values are greater, equal or lower than 30.
            // 2 number at the same time

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter first number");
            int output = input.nextInt();
            System.out.println("Please enter second number");
            int output2 = input.nextInt();

            if ((output>border && output2>border))
                System.out.println("the two numbers you entered are greater than " + border + " , First one: " + output + " , Second one: " + output2);
            else if ((output<border && output2>border))
                System.out.println("First number is lower than " + border + " , Which is: " + output + " ,and the second one is greater than " + border +" , Which is " + output2);
            else if ((output>border && output2<border))
                System.out.println("First number is greater than " + border + " , Which is: " + output + " ,and the second one is lower than " + border +" , Which is " + output2);


            else if (output<0 && output2<0)
                System.out.println("You must enter positive numbers for two of them ");
            else if (output<border && output2<border)
                System.out.println("the two numbers you entered are lower than " + border);
            else if (output == border && output2 == border)
                System.out.println("the two number is equal to " + border);

            else
                System.out.println("you are living in another galaxy");

    }
}
