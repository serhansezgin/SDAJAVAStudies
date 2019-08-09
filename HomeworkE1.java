/*

Reverse the word of the sentence. Please look at the screenshot.


 */

package lesson3;

import java.util.Scanner;
import java.lang.String;
public class HomeworkE1 {


    public static void main(String[] args) {


        Scanner str1 = new Scanner(System.in);

        System.out.println("Enter string to reverse:");
        String str = str1.nextLine();
        String[] words = str.split(" ");
        String revString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
            System.out.println(revString);
    }
}



/*

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}

*/




