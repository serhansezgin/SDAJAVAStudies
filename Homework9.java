/*
Create a class.
This class will have main method.
request sentence from the user

ask the char which you are looking for
print amount of that char inside the sentence


Example:
Murat asdasdas ds

enter the char which you are looking for
M
Result is 1


 */

package lesson2;

import java.util.Scanner;

public class Homework9 {


    public static void main(String[] args) {

        System.out.println("welcome stranger, please enter string"); //printing info to user
        Scanner scanner = new Scanner(System.in); //creating an object
        String input = scanner.nextLine(); //Nextline method: reads the user input input as sentence
        System.out.println(input);

        System.out.println("Which char are you looking for?");
        Scanner scanner2 = new Scanner(System.in); //creating an object
        String input2 = scanner2.nextLine(); //Nextline method: reads the user input input as sentence
        System.out.println(input2);
/*
        probability_ch=0
        for (i=0;i<=input.lenght;i++);
        if input2==i
        probability_ch++
*/










    }
}
