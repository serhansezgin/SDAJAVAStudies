package studiesyb;

import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        //int a = scan.nextInt();
        //double a = scan.nextDouble();
        String a = scan.nextLine();
        System.out.println("a degiskenin degeri: " + a);

    }


}
