package studiesyb;

import java.util.Scanner;

public class DoWhileLoops {


    public static void main(String[] args) {
        System.out.println("bir sayi giirniz ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int modtoplam = 0;


                do {
                    modtoplam += sayi % 10;
                    sayi = sayi / 10;
                    System.out.println("mod toplam = " + modtoplam + " sayi = " + sayi);
                }
                while (sayi>0);
        System.out.println(" Mod Toplam = " + modtoplam);



    }
}
