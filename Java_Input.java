package lesson1;

import java.util.Scanner; // import the scanner class

public class Java_Input {

    //psvm
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Welcome, Enter Username Please: ");

        String userName = myObj.nextLine(); //Read User Input
        System.out.println("Your Username is: " + userName); //Output User Input
        if (userName.contains("James Bond")) {
            System.out.println("Welcome 007");
        } else  {
            System.out.println("You are not an agent, get out");
        }


    }

}


