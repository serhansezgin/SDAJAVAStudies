package lesson5;

public class WordReversed {
    public static void main(String[] args) {
        String word ="bottle and glass";
        String [] splittedWord = word.split (" ");
        for (String w : splittedWord){
            char [] arr = w.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i]);
            }
            System.out.print(" ");
        }
    }
}


//Task HOMEWORK
//FIND LONGEST WORD FROM A GIVEN SENTENCE
//INPUT: MY NAME IS GOHKAN
//RESULT: GOHKAN

