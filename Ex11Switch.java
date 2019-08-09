package lesson8;

import java.util.Scanner;

public class Ex11Switch {

    //write an application that for any entered number between 0 and 9 will provide it's name
    //for example for "3" program should print "three"


    public static void main(String[] args) {

        System.out.println("Please enter a week day's number: ");
        Scanner input = new Scanner(System.in);
        int weekday = input.nextInt();

/*
        if (weekday == 1)
            System.out.println("Monday");
        else if (weekday == 2)
            System.out.println("Tuesday");
        else if (weekday == 3)
            System.out.println("Weekend");
        else if (weekday == 4)
            System.out.println("Thursday");
        else if (weekday == 5)
            System.out.println("Friday");
        else if (weekday == 6)
            System.out.println("Saturday");
        else if (weekday == 7)
            System.out.println("Sunday");
        else
            System.out.println("You are living in another galaxy");
*/



        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (weekday >0 && weekday < 8)
            System.out.println(weekdays[weekday-1]);
        else
            System.out.println("You are living in another galaxy");






    }



}
