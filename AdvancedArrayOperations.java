package lesson3;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

import java.util.Scanner;

public class AdvancedArrayOperations {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] vegetable = {"Carrot", "Patato", "Onion", "Garlic", "Eggplant"};
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};


        //create a customerList with zize of 7 and the array is String array
        //print information to the user
        //please enter vegetable or fruit
        //print all vegetables and all fruits. print space
        //scan 7 times from the customer and save it to the customerlist array

        /*
Create a class.
This class will have main method.
print user to get a password
If password is password then ask for second password

If second password is password2 then say welcome the user

Give detailed response of which password is wrong. Check screenshots.
 */


        System.out.println(Arrays.toString(vegetable));
        System.out.println(Arrays.toString(fruits));

        System.out.println("please enter vegetable or fruit");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        String input4 = scanner.nextLine();
        String input5 = scanner.nextLine();
        String input6 = scanner.nextLine();
        String input7 = scanner.nextLine();


        String customerList[] = {input1, input2, input3, input4, input5, input6, input7};

/*
        List valid1 = Arrays.asList(vegetable);

                if (valid1.contains(input1.toUpperCase())){
                    System.out.println(input1 + "is in vegetable");
                } else {
                    System.out.println(input1 + "is in fruits");
                }
        if (valid1.contains(input2.toUpperCase())){
            System.out.println(input2 + " is in vegetable");
        } else {
            System.out.println(input2 + " is in fruits");
        }
        if (valid1.contains(input3.toUpperCase())){
            System.out.println(input3 + " is in vegetable");
        } else {
            System.out.println(input3 + " is in fruits");
        }
        if (valid1.contains(input4.toUpperCase())){
            System.out.println(input4 + " is in vegetable");
        } else {
            System.out.println(input4 + " is in fruits");
        }
        if (valid1.contains(input5.toUpperCase())){
            System.out.println(input5 + " is in vegetable");
        } else {
            System.out.println(input5 + " is in fruits");
        }
        if (valid1.contains(input6.toUpperCase())){
            System.out.println(input6 + " is in vegetable");
        } else {
            System.out.println(input6 + " is in fruits");
        }
        if (valid1.contains(input7.toUpperCase())){
            System.out.println(input7 + " is in vegetable");
        } else {
            System.out.println(input7 + " is in fruits");
        }



/*
        List valid2 = Arrays.asList(fruits);
        if (valid2.contains(input1.toUpperCase())){
            System.out.println(input1 + " is in fruits");
        } else {
            System.out.println(input1 + " is in vegetable");
        }
        if (valid2.contains(input2.toUpperCase())){
            System.out.println(input2 + " is in fruits");
        } else {
            System.out.println(input2 + " is in vegetable");
        }
        if (valid2.contains(input3.toUpperCase())){
            System.out.println(input3 + " is in fruits");
        } else {
            System.out.println(input3 + " is in vegetable");
        }
        if (valid2.contains(input4.toUpperCase())){
            System.out.println(input4 + " is in fruits");
        } else {
            System.out.println(input4 + " is in vegetable");
        }
        if (valid2.contains(input5.toUpperCase())){
            System.out.println(input5 + " is in fruits");
        } else {
            System.out.println(input5 + " is in vegetable");
        }
        if (valid2.contains(input6.toUpperCase())){
            System.out.println(input6 + " is in fruits");
        } else {
            System.out.println(input6 + " is in vegetable");
        }
        if (valid2.contains(input7.toUpperCase())){
            System.out.println(input7 + " is in fruits");
        } else {
            System.out.println(input7 + " is in vegetable");
        }
*/

        List valid1 = Arrays.asList(vegetable);
        if (valid1.contains(input1)){
            System.out.println(input1 + " is in vegetable");

        }
        if (valid1.contains(input2)){
            System.out.println(input2 + " is in vegetable");
        }

        if (valid1.contains(input3)){
            System.out.println(input3 + " is in vegetable");
        }

        if (valid1.contains(input4)){
            System.out.println(input4 + " is in vegetable");
        }

        if (valid1.contains(input5)){
            System.out.println(input5 + " is in vegetable");
        }

        if (valid1.contains(input6)){
            System.out.println(input6 + " is in vegetable");
        }

        if (valid1.contains(input7)){
            System.out.println(input7 + " is in vegetable");
        }




        List valid2 = Arrays.asList(fruits);
        if (valid2.contains(input1)){
            System.out.println(input1 + " is in fruits");

        }
        if (valid2.contains(input2)){
            System.out.println(input2 + " is in fruits");
        }

        if (valid2.contains(input3)){
            System.out.println(input3 + " is in fruits");
        }

        if (valid2.contains(input4)){
            System.out.println(input4 + " is in fruits");
        }

        if (valid2.contains(input5)){
            System.out.println(input5 + " is in fruits");
        }

        if (valid2.contains(input6)){
            System.out.println(input6 + " is in fruits");
        }

        if (valid2.contains(input7)){
            System.out.println(input7 + " is in fruits");
        }






            System.out.println(Arrays.toString(customerList));





        }
    }









