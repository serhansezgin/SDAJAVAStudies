package lesson7;

import com.sun.xml.internal.ws.transport.http.DeploymentDescriptorParser;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoValues {

    public static void main(String[] args) {

        //enter two values of type int. Display their division casted to the double type and rounded
        //to the third decimal point.


        System.out.println("Please input first number: ");
        Scanner sc = new Scanner(System.in);


       int inputs[] = new int[2];


        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }



            double result = ((double)inputs[0] / (double)inputs[1]);
            System.out.println(result);


            System.out.println(new DecimalFormat("0.000").format(result));


        }
    }




