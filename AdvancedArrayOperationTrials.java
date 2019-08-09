
//https://www.youtube.com/watch?v=RTvTcpvhcl4
//https://stackoverflow.com/questions/22929819/scanning-multiple-lines-using-single-scanner-object
//https://stackoverflow.com/questions/15730134/java-opposite-of-contains-does-not-contain
//https://stackoverflow.com/questions/86780/how-to-check-if-a-string-contains-another-string-in-a-case-insensitive-manner-in/21640291


package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class AdvancedArrayOperationTrials {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] vegetable = {"Carrot", "Patato", "Onion", "Garlic", "Eggplant"};
        String[] fruits = {"Banana", "Orange", "Grape", "Apple", "Kiwi", "Pineapple"};

        System.out.println(Arrays.toString(vegetable));
        System.out.println(Arrays.toString(fruits));

        System.out.printf("Please specify how many lines you want to enter: ");
        String[] input = new String[in.nextInt()];
        in.nextLine(); //consuming the <enter> from input above

        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextLine();
        }


        List valid1 = Arrays.asList(vegetable);
        List valid2 = Arrays.asList(fruits);



            System.out.printf("\nYour grocery list:\n");
            int vegetableCount = 0;
            for (String s : input) {
                if (valid1.contains(s)) {
                    System.out.println("Deciding " + s + " is vegetables or fruits ");
                    System.out.println(s + " is in vegetable");
                    vegetableCount ++;

                }
            }
            int fruitsCount = 0;
            for (String s : input) {
                if (valid2.contains(s)) {
                    System.out.println("Deciding " + s + " is vegetables or fruits ");
                    System.out.println(s + " is in fruits");
                    fruitsCount ++;
                }
            }

            for (String s : input) {
                if (!valid1.contains(s) && !valid2.contains(s)) {
                    System.out.println(s + " is not on either the vegetable or fruits lists");

            }
        }



        System.out.println("The number of vegetables: " + vegetableCount);
        System.out.println("The number of fruits: " + fruitsCount);




            }
        }

