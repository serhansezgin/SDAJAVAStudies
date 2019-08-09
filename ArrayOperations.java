package lesson3;

import java.util.Arrays;

public class ArrayOperations {


    public static void main(String[] args) {
        //create int array its values 1 2 3 4 5 6

        int[] arrayOfIntegers = {10, 15, 20, 25, 30, 35};
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (i == 4) {
                continue;
            }

            System.out.print(arrayOfIntegers[i] + " ");
        }



/*
        // 10 15 20 25 30
        for (int i = 0; i < arrayOfIntegers.length; i++) {
        //for (int i = 0; i < arrayOfIntegers[4]; i++) {
            if (arrayOfIntegers[i] == 10) {
                continue;
            }

            System.out.print(arrayOfIntegers[i] + " ");
        }
*/

        //System.out.println(); //go to the next line

/*
        //prints 10 15 20 25 30
        for (int i : arrayOfIntegers) {
            System.out.println(i + " ");
        }
*/

/*
        for (int item :arrayOfIntegers){
            if (item != 10) {
                System.out.println(item);
            }
        }
*/

        /*
        System.out.println(Arrays.toString(arrayOfIntegers));
*/

        for (int item :arrayOfIntegers){
            if (item == 30) {
                break;
            } else{
                System.out.println(item);
            }
        }



        //print all expect if the value is 10


    }
}

//print items until 4 shows up use break


