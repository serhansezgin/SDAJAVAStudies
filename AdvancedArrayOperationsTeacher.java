package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedArrayOperationsTeacher {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] vegetable = {"Carrot", "Patato", "Onion", "Garlic", "Eggplant"};
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};

        System.out.println(Arrays.toString(vegetable));
        System.out.println(Arrays.toString(fruits));

        //create a customerlist
        String[] customerList = new String[7];


        System.out.println("please enter vegetable or fruit");
        System.out.println("vegetable->" + Arrays.toString(vegetable));
        System.out.println("fruits->" + Arrays.toString(fruits));
        System.out.println();

        for (int counter = 0; counter < customerList.length; counter++) {
            customerList[counter] = scanner.next();

        }

        int vegetableAmount = 0;
        int fruitAmount = 0;

        for (String customerItem : customerList) {


            //we have the customer item now lets check if it is a vegetable.
            for (int counter = 0; counter < vegetable.length; counter++) {
                //if the customer item is part of the array
                if (customerItem.equals(vegetable[counter])) {
                    vegetableAmount++;
                    System.out.println(customerItem + " is a vegetable");
                    break;
                }

            }


            for (int counter = 0; counter < fruits.length; counter++) {
                //if the customer item is part of the array
                if (customerItem.equals(fruits[counter])) {
                    fruitAmount++;
                    System.out.println(customerItem + " is a fruit");
                    break;
                }
            }
        }

/*
        if ((vegetableAmount+fruitAmount) !=7}) {
            System.out.println("in the array list there is unknown information");
            else {
                System.out.println(vegetableAmount+fruitAmount);
        }
*/











    }


}





