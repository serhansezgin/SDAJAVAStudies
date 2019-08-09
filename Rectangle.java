package lesson8;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the row size: ");
        rows = scanner.nextInt();

        System.out.println(" Please enter the columns size: ");
        columns = scanner.nextInt();




            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    if(isTopBorder(i) || i+j==columns || i+j==rows || i==columns-1 || i==rows-1 || j == rows-1 || i == 0 || j == 0 || j == columns-1 || i==j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("\n");
            }
        }



        public static boolean isTopBorder(int index){
            return index == 0;

        }



    }




