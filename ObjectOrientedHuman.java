package studies;

public class ObjectOrientedHuman {

    public static void main(String[] args) {

        System.out.println("merhaba bil kavramlari");

        Employee ali = new Employee ();
        ali.boy = 180;
        ali.kilo = 80;
        ali.yas = 22;
        System.out.println("alinin yasi " + ali.yas + " alinin kilosu " + ali.kilo + " alinin boyu " + ali.boy);

        Human veli = new Human ();
        veli.boy = 180;
        veli.kilo = 80;
        veli.yas = 22;
        System.out.println("velinin yasi " + veli.yas + " velinin kilosu " + veli.kilo + " velinin boyu " + veli.boy);

        ali.yemek();
        veli.yemek();

        System.out.println("velinin yasi " + veli.yas + " velinin kilosu " + veli.kilo + " velinin boyu " + veli.boy);

        ali.maas = 100;
        ali.zam(20);
        System.out.println("alinin zamli maasi " + ali.maas);


    }


    }

