package lesson1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.next();
        if (name.equals("Donald"))
            System.out.println("Welcome back Admin");
        else
            System.out.println("Go Away");
    }

}