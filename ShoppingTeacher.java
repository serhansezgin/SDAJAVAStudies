package lesson8;

import java.util.Scanner;

public class ShoppingTeacher {
    public static void main(String[] args) {
        //Write a simple application that will simulate a shopping. Use only if-else flow control.
        //Consider following cases:
        //if you would like to buy a bottle of milk - cashier will ask you for a specific amount of money.
        //You have to enter that value and verify if it is same as the cashier asked.
        //If you would like to buy abottle of wine - cashier will ask you, if you are an adult and for
        //positive answer ask for a specific amount of money.
        System.out.println("Please choose what you want to buy MILK or WINE:");
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        if (product.equalsIgnoreCase("MILK")) {
            System.out.println("You have to pay 2 EUR");
            float money = scanner.nextFloat();
            if (money == 2) {
                System.out.println("Thank you for buy. Have a nice day.");
            } else {
                System.out.println("Sorry, but we cannot process your request. You have to pay 2 EUR");
            }
        } else if (product.equalsIgnoreCase("WINE")) {
            System.out.println("Are you an adult [Y or N]: ");
            char adult = scanner.next().charAt(0);
            if (adult == 'Y' ) {
                System.out.println("You have to pay 10 EUR.");
                float money = scanner.nextFloat();
            } else {
                System.out.println("Sorry but only an adult can buy alcohol.");
            }
        } else {
            System.out.println("Sorry, we dont have the requested product. Please select one from the top list.");
        }
    }

    public static void buyProduct(float money, int i) {
        if (money == i) {
            System.out.println("Thank for buy. Have a nice day.");
        } else {
            System.out.println("Sorry but we cannot process your request. You must pay the correct amount.");
        }
    }
}



