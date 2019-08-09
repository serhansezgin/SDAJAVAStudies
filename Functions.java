package studiesyb;

import java.util.Scanner;

public class Functions {


/*
    public static void selamlama(){

        System.out.println("Herkese Selam");
        System.out.println("iyisinizdir umuyorum...");
    }


    public static void main(String[] args) {
        selamlama(); //Function Call

*/
/*
        public static void faktorial(){
            Scanner scan = new Scanner(System.in);

            System.out.println("Sayi:");

            int sayi = scan.nextInt();
            int faktorial = 1;

            while (sayi>0){

                faktorial *= sayi;
                sayi--;

            }
            System.out.println("Faktorial: " + faktorial);
        }


        public static void main(String[] args) {
            faktorial(); //Function Call

*/



//functions with parameters

/*
public static void selamlama() {
    System.out.println("Naber");

}

    public static void main(String[] args) {
        selamlama();
    }
*/
/*
    public static void selamlama(String isim) {
        System.out.println("Naber " + isim);

    }

    public static void main(String[] args) {
        selamlama("Murat");
        selamlama("Abuziddin");
    }
*/

/*
    public static int toplama(int a, int b, int c) {

        return (a+b+c);
        //System.out.println("Toplamlari " + (a+b+c));

    }

    public static void main(String[] args) {
        System.out.println("Toplamlari: " + toplama(3,4,5));
        toplama(3,4,5);
        toplama(29,3,40);
    }
*/
//return
public static int ucilecarp(int a){
    return a*3;
}

public static int ikitopla(int a){
    return a+2;

}
public static int dortcikart(int a){
    return a-4;
    }

    public static void main(String[] args) {

        System.out.println("Sonuc:" + dortcikart(ikitopla(ucilecarp(4))));

    }




    }

