package lesson5;

public class ArrayPractiseSorting {

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 8, 9, 1, 7, 0};
        //Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + ", ");
        }
    }
}



