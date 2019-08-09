package studiesyb;

public class MethodsOverloading {

/*
    public static void toplama (int a, int b, int c){
        System.out.println("Toplamlari: " + (a+b+c));
    }

    public static void toplama (int a, int b){
        System.out.println("Toplamlari: " + (a+b));
    }
    public static void toplama (int a, int b, int c, int d){
        System.out.println("Toplamlari: " + (a+b+c+d));
    }

    public static void main(String[] args) {
        toplama(3,4,5);
        toplama(10,20);
        toplama(1,2,3,4);
    }
 */


public static void skorHesapla(String name, int score){
    System.out.println(name + " isimli oyuncunun puani: " + score);
}

    public static void skorHesapla(int score){
        System.out.println(" isimsiz oyuncunun puani: " + score);
    }
    public static void skorHesapla(String name){
        System.out.println(name + " isimli oyuncunun puani: 0");
    }

    public static void main(String[] args) {
        skorHesapla("Murat",3000);
        skorHesapla(1000);
        skorHesapla("ahmet");


    }


}
