package studiesyb;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {


/*
    int i = 0;

    while (i < 10){
        if(i==4 || i == 7){
            i++; //i++ is important
            continue;


        }
        System.out.println("i : " + i);
        i++;
    }
*/


while (true){
    Scanner scan = new Scanner(System.in);
    String s;

    System.out.println("karakter giriniz:");
    s = scan.nextLine();

    if (s.equals("q")){
        System.out.println("Programdan cikiliyor....");
        break;
    }
    System.out.println("karakter = " + s);

}

    }
}
