package lesson7;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        byte myByte = 'd';
        byte myByte1 = 127;
        char myChar = 'd';
        int myInt = 56544;


        System.out.println(myByte);
        System.out.println(myByte1);
        System.out.println(myChar);
        System.out.println(myInt);

        //create three variables, one for each type, float, byte, char. Enter values corresponding
        //to those types using scanner. what values are you able to enter for each type?

        float floatValue;
        byte byteValue;
        char charValue;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a float value:");
        floatValue = scanner.nextFloat();

        System.out.println("Enter a byte value: ");
        byteValue = scanner.nextByte();

        System.out.println("Enter a char value: ");
        charValue = scanner.next().charAt(0);


        System.out.println("Float " + floatValue);
        System.out.println("Byte " + byteValue);
        System.out.println("Char " + charValue);



    }
}
