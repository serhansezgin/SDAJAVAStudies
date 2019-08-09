package lesson2;

public class StringTesting {

    public static void main(String[] args) {
        String exampleString = "My Name";
        String exampleString1 = new String ("My Name");
        String exampleString2 = "My Name";


        System.out.println(exampleString);

        if(exampleString==exampleString1){
            System.out.println("should not be come here");
        }

        if(exampleString==exampleString2){
            System.out.println("should come here. Literal");
        }
        if(exampleString1==exampleString2){
            System.out.println("should not come here." + " One is Literal other is Object");
        }

//what is original means
        //

        if(exampleString.equals(exampleString1)){
            System.out.println("the values are the same");
        }


        if(exampleString.equalsIgnoreCase(exampleString1)){
            System.out.println("the values are the same with ignore case");
        }


        //string
        //literal

        //what is the difference between stringbuilder and stringbuffer, which one is faster














    }

}
