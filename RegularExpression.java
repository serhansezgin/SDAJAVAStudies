package lesson5;

import java.util.Scanner;

public class RegularExpression {

    public static void main(String[] args) {
        //String word = "qwer";
        System.out.println("Please anter a string or number, we will differentiate it");
        Scanner scan = new Scanner(System.in);
        //int number = scan.nextInt();
        String word = scan.nextLine();


        //HELP TO CHECK THE EVERY LETTER IS ITS TRUE OR FALSE AND PROVIDE A MESSAGE FOR THAT
        //Example below
       /*boolean result = false;
       if (word.equals("0"){
           result = true;
       }
       if (word.equals("1"){
           result = true;
       }
       if (word.equals("2"){
           result = true;
       }*/
        //Shorter Version Below
        //a star "*" helps to check only separate 1 number
        if (word.matches("[0-9]*")) {
            System.out.println("number");
        } else if (word.matches("[A-Za-z]*")) {
            System.out.println("word");
        } else {
            System.out.println(false);
        }
    }

}


