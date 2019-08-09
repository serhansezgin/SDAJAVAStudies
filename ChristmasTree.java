package lesson8;

import java.util.Scanner;

public class ChristmasTree {


    public static void main(String[] args) {
        //int rows;
        //int columns;
        int height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the height: ");
        height = scanner.nextInt();


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}








