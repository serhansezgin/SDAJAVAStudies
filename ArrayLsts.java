


package studiesyb;

import java.util.ArrayList;


public class ArrayLsts {

    public static void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();


        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Guns'n Roses");
        groups.add("Black Sabbath");


        //groups.remove(0);
        groups.remove("Iron Maiden");

        for (int i=0; i< groups.size();i++){
            System.out.println("Eleman: " + groups.get(i));
        }
        System.out.println(groups.indexOf("Metallica"));
        System.out.println(groups.indexOf("Black Sabbath"));

        /*
        System.out.println("0.indeks: " + groups.get(0));
        System.out.println("0.indeks: " + groups.get(2));
        System.out.println("0.indeks: " + groups.get(3));
*/



    }



}
