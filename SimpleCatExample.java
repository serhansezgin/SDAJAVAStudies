package lesson4;


import java.lang.Object;
import java.lang.String;

public class SimpleCatExample {




    public static void main(String[] args) {


   SimpleCat simpleCat = new SimpleCat("Doris The Cat",6,"Sfinks");
       /*
        SimpleCat simpleCat = new SimpleCat();
        simpleCat.setName("Sparkle");
        simpleCat.setAge(5);
        simpleCat.setBreed("Male");
*/

        SimpleCat simpleCat1 = new SimpleCat("Roof The Cat",12,"Burma");

       /*
        SimpleCat simpleCat1 = new SimpleCat();
        simpleCat1.setName("Luxury");
        simpleCat1.setAge(4);
        simpleCat1.setBreed("Female");
*/

        simpleCat.printInformation();
        simpleCat1.printInformation();

        simpleCat.meow();
        simpleCat.meow();
        simpleCat1.meow();

        simpleCat.say ( "i am hungry");


    }
}