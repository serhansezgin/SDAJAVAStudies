package lesson5;

public class ArrayPractiseCommonElements {

    public static void main(String[] args) {
        int [] arr = {5,2,5,3,8,9,1,7,0};
        int [] arr1 = {4,6,1,5,9};


        System.out.print("Result: ");
        for (int num : arr){
            for (int num2 : arr1){
                if (num == num2){
                    System.out.print(num + ", ");
                }
            }
        }

    }

}



