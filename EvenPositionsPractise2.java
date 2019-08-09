package lesson5;

public class EvenPositionsPractise2 {

    public static void main(String[] args) {

        String word = "bottle and glass";
        char [] arr = word.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            if (i % 1 == 0) { //check index
                System.out.println(arr[i]);
            }
        }
    }
}





