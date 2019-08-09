package lesson2;
import java.lang.String;
import java.lang.Character;
import java.util.Scanner;


public class Primitives {
    //Create a main method
    //Create a variable (boolean) variable name is isHungry and assign true
    //Create int chickenKg and assign 1 to it
    //Create double cost and assign 1.20

    public static void main(String[] args) {
        boolean isHungry = true;
        int chickenKg = 1;
        double cost = 1.2;
        float drinkCost = (float) 1.5;
        char secretCode = 'C';
        short littleNumber = 3;
        long bigNumber = 10000;

        float chickenPrice = (float) 1.3;
        float drinkPrice = (float) 1.4;

        //int a = 1/0
        System.out.println(isHungry);
        System.out.println(chickenKg);
        System.out.println(cost);
        System.out.println(drinkCost);
        System.out.println(secretCode);
        System.out.println(littleNumber);
        System.out.println(bigNumber);


        if (isHungry) {
            System.out.println("He is Hungry");
        }
        System.out.println("i ate "+chickenKg+" kg chicken");



        if (chickenPrice > drinkPrice)
    {
            System.out.println("chicken price is expensive than drink price, which is " + (chickenPrice) + " greater than " + (drinkPrice));

        }


        else System.out.println("drink is more expensive than chicken, which is " + drinkPrice + " bigger than " + chickenPrice);






        //if secret code is D print secret code is correct. Have Fun
        //Else print secret code is wrong. are you a cop

        if (secretCode == ('D')){
            System.out.println("Secret code is correct");
        }
            else System.out.println("Secret code is wrong");


            //char with only one quote
        //string with double qoute
        //equals is for string



        byte b = 10;
        byte c = 0x0A;
        System.out.println(b);
        System.out.println(c);





        //if little number is smaller than 7 print Password is not strong enough
        //else password is good enough


        if (littleNumber<7){
            System.out.println("Password is not strong enough");
        } else System.out.println("Password is good enough");


//autoboxing
        //unboxing



    }




}
