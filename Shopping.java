package lesson8;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        // write a single application that will simulate a shopping. Use only if-else flow control.

        //consider following cases

        //if you want to buy a bottle of milk - cashier will ask you for a specific amount of money.
        //you have to enter that value and verify if it is same as the cashier asked

        //if you want to buy a bottle of wine - cashier will ask you if you are an adult and for positive answer
        // ask for specific amount of money.
        //you have to enter that value and verify if it is same as the cashier asked

        System.out.println("Please enter what do you want to buy");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.equals("milk")) {
            System.out.println("5 euro please");
        }


        else if (word.equals("wine")){
            System.out.println("how old are you");
        }
        //else{
        //System.out.println("please enter milk or wine");}
        int word2 = input.nextInt();
        if (word2>=18)
        System.out.println("ok you are an adult, give 100 euro for wine please");
        else
        System.out.println("come " + (18-word2) + " years later you teenager ");







    }


}
