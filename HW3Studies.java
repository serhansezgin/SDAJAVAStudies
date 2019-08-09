package lesson2;

import java.util.Scanner;

public class HW3Studies {

    public static void main(String[] args) {

/*
        String a = "ABC DEF";
        System.out.println(a.replace("", " ").trim());
*/

/*
        String str = "Hello";
        System.out.println(str.replaceAll(".(?=.)", "$0 "));
*/


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = input1.nextLine();



        //String input = "ABCDE";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i > 0) {
                result.append(" ");
            }

            result.append(input.charAt(i));
        }

        System.out.println(result.toString());










/*
        String str = "302340372048725280";

        String temp = "";
        int i=0;
        int len = str.length();
        while(len>0){
            temp+=str.charAt(i);
            i++;
            len--;
            temp+=" ";
        }

        System.out.println(temp);
*/





    }



}
