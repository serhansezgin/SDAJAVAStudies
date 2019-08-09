package lesson3;

import java.util.Scanner;

public class LoopOperations {


    public static void main(String[] args) {





        /*
        int counter = 3;

        while (counter> 0){
            System.out.println(counter);
            counter--; //counter = counter - 1;
        }
*/

/*
        Scanner scanner = new Scanner (System.in);
        while (true){
            System.out.println("Tell my NAME!");
            String incomingString = scanner.nextLine();
            if(incomingString.equalsIgnoreCase ("Murat")){
                //break;
                System.out.println("you wrote my name correct");
                //continue;
                break;
            }



        }
*/

/*
     for (int x = 0; x < 10; x++) {
            System.out.println("x is " + x);
        }
*/








/*
     String helloWorld = "Hello World";
     for (int characterCount = 0 ; characterCount < helloWorld.length() ;characterCount++){
         System.out.println(helloWorld.charAt(characterCount));
     }
*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("write a number");
        int incomingInt = scanner.nextInt();


        if (incomingInt == 0) {
            System.out.println("we don't have anything to print");
        } else if (incomingInt < 0) {
            System.out.println("you must enter a value above 0");
        } else if (incomingInt > 5) {
            System.out.println("you must enter a value below 5");
        } else {
            for (int x = 1; x <= incomingInt-1; x++) {
                System.out.print(incomingInt);
                //System.out.println(incomingInt);
            }


               /*
                for (int x = 1; x <= incomingInt+1; x++) {
                    System.out.println(incomingInt);
                }
                */

                }
            }


        }












            /*
            int Count = 0;
            int i=0;
            if (incomingInt < 0 && incomingInt > 5) {
                System.out.println("you must give a number between 0 and 5, error information");
                //else if (incomingInt > 5 ) {
                //  System.out.println("you must give a number less then 5, error information");
            } else {
                while (incomingInt > 0) {
                    incomingInt = incomingInt / 10;
                    Count = Count + 1;
                }
                //System.out.format("\n Number of Digits in a Given Number = %d", Count);
                for (i=1; i<=Count; i++){
                    System.out.println(Count);
                }

            }


        }

*/






























