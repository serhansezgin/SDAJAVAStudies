package lesson8;

import java.util.Scanner;

public class Quiting {

    /*
    while a simple "echo" application, that will
    a. print back entered string.
    b. go to the beginning of a loop if user will enter "continue"
    c. break the loop with a "good bye" message. if user will enter "quit"

     */


    public static void main(String[] args) {


        do {
            System.out.println("Please enter string: ");

            Scanner scan = new Scanner(System.in);
            String s1 = scan.nextLine();

            if (s1.equals("continue")) {
                //String result = echo(s1);
                //System.out.println(echo(s1));
                //String s1 = scan.nextLine();
                continue;

            } else if (s1.equals("good bye")) {
                System.out.println("Good Bye");
                break;
            } else {
                String result = echo(s1);
                System.out.println(result);
                break;
            }


        } while (true);

    }
        public static String echo (String s1){
            return s1;
        }

    }
