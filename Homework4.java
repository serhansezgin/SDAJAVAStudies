/*
Create a class.
This class will have main method.
print user to get a password
If password is password then ask for second password

If second password is password2 then say welcome the user

Give detailed response of which password is wrong. Check screenshots.
 */

package lesson2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input Password 1 below and press enter");
        String password1 = input.nextLine();


        if (password1.equals("password")) {
            System.out.println("write a second password again");
                    System.out.println("Input Password 2 below and press enter too");
                    String password2 = input.nextLine();
                    if (password2.equals("password2")) {
                        System.out.println("welcome");
                    }
                    else {System.out.println("you write the 2. password wrong, you must write password2, but you wrote " + password2);}
        }


        else
            System.out.println("get out, you must wrote password, but you wrote " + password1);





    }
}
