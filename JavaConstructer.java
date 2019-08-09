package studies;


class Insan {
    int boy;
    int kilo;
    int yas;

    public Insan() { // class ile ayni isme sahip ve return type yoktur
        System.out.println("bir insan objesi olusturuldu");
        yas = 1;
    }

    public Insan (int yas, int kilo, int boy) { //polymorphism, cok sekilcilik, hic parametre vermeden de cagirabilirsin, 3 parametre vereerete ccagirabilirsin
        this();
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;

    }

}

public class JavaConstructer {

    public static void main(String[] args) {
        // TODO code application logic here
        Insan veli = new Insan(20,80,170);
        Insan ali = new Insan(); //default constructer
        new Insan(); //garbage collector
        System.gc();  // garbage collector, kimsenin erisemeyecegi objeleri cagirir.
        ali.boy = 180;
        ali.kilo = 80;
        System.out.println("alinin ozellikleri " + ali.boy + "," + ali.kilo);
        System.out.println("velinin ozellikleri " + veli.boy + "," + veli.kilo);

    }



        }




