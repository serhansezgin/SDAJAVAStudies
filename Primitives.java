import java.lang.Integer;
import java.util.Scanner;


public class Primitives {
    public static void main(String[] args) { //create a main method
        //create a variable (boolean) variable name is isHungry and assign true
        //create int chickenKg and assign 1 to it
        //create double cost and assign 1.20


        //Scanner input = new Scanner(System.in);
        //System.out.println("Are you hungry?");
        //String hungryornot = input.next();
        //if (hungryornot.equals("yes"))
        boolean isHungry = true;


        int chickenKg = 1;
        double cost =  1.20;
        float cost2 = 2.5f;

        if (isHungry == true) {
            System.out.println(isHungry + " " + chickenKg + " " + cost + " " + cost2);
        }
        else {    System.out.println( "He is not Hungry");

        }
    }
}
