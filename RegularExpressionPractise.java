package lesson5;

public class RegularExpressionPractise {

    public static void main(String[] args) {
        String word = "asER435AF23ERJ$6g";
        char [] arr = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = "" + arr[i];
            if (s.matches("[0-9]*")){
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}


