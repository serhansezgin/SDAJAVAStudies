package studiesyb;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "Mustafa";
        String s2= new String("Mustafa");

        System.out.println(s2.length());

        System.out.println("0.indeks: " + s2.charAt(0));
        System.out.println("5.indeks: " + s2.charAt(5));
        System.out.println("5.indeks: " + s2.charAt(s2.length()-1));

        System.out.println(s2.startsWith("Mu"));
        System.out.println(s2.startsWith("An"));
        System.out.println(s2.endsWith("Mu"));



    }


}
