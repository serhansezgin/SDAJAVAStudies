/*
Create a class.
This class will have main method.
print user to get a number
return the factorial of that number.

if number is positive return the factorial number.

If number is 0 return 1
if number is negative return error message.
if it is -1 exit. -1 is a special command.

6!= 6*5*4*3*2*1
5! = 5*4*3*2*1 = 120
3! = 3*2*1 = 6
1! = 1
...
 */
package lesson2;
import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a Number below and press enter");
        Integer number1 = input.nextInt();

        if (number1 > 0) {
            int result = 1;
            for (int i = 1; i <= number1; i++) {
                result = result * i;
                /*
result = 1
i = 1 result = result * i = 1 * 1 = 1
i = 2 result = result * i = 1 * 2 = 2
i = 3 result = result * i = 2 * 3 = 6
                 */

            }
            System.out.println("The factorial of " + number1 + " is "  + result);

        }
        else if (number1 < 0 && number1 != -1) {
            System.out.println("Error Message, You must enter a positive integer.");
        }
        else if (number1 == -1){
            System.out.println("-1 is a special command");}

        else if (number1 == 0) {
            System.out.println("The result is 1");}













    }
}
