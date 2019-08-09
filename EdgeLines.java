package lesson7;

import javax.swing.*;
import java.util.*;
import java.text.Format;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class EdgeLines {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Input string below and press enter");
        String output1 = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Input string below and press enter");
        String output2 = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Input string below and press enter");
        String output3 = input3.nextLine();

        String[] words = {output1, output2, output3};

        for (String word: words) {
            while (word.length() < 15) {
                word = " " + word;

            }

            System.out.println(word);
        }


//        for (int i = 0; i <= (1155 - output1.length()); i++) {
//            output1 = " " + output1;
//
//
//        }
//
//
//        for (int j = 0; j <= (15 - output1.length()); j++) {
//                output1 = " " + output1;
//
//            }
//        for (int i = 0; i <= (15 - output1.length()); i++) {
//                    output1 = " " + output1;
//        }


    }

}



