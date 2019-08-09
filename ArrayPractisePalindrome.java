package lesson5;

public class ArrayPractisePalindrome {


    public boolean isPalindrome (String word){
        char [] wordChar = word.toCharArray();
        String reversedWord = "";
        for (int i = wordChar.length - 1; i >= 0; i--){
            reversedWord += "" + wordChar [i];
            //reversedWord = reversedWord + wordChar[i]; same as above line
        }
        if (word.equalsIgnoreCase(reversedWord)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        ArrayPractisePalindrome palindrome = new ArrayPractisePalindrome();
        String word1 = "Radar";
        boolean result1 = palindrome.isPalindrome(word1);
        System.out.println(word1 + " is palindrome? : " + result1);
        String word2 = "Yellow";
        boolean result2 = palindrome.isPalindrome(word2);
        System.out.println(word2 + " is palindrome? : " + result2);
    }
}


