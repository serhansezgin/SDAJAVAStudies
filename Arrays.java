package studiesyb;

import java.util.Scanner;

public class Arrays {



    public static void mean(int [] arr){
        int total =0;

        for (int i=0;i<arr.length;i++){
            total += arr[i];

        }
        System.out.println("Ortalama: " + total/arr.length);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



       //int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[5];

        System.out.println("Array2 nin degerlerini giriniz...");
        for (int i =0; i< arr2.length;i++) {
            arr2[i] = scanner.nextInt();
        }

        mean(arr2);


        /*
        System.out.println("Array2 nin degerleri yaziliyor...");
        for (int i = 0; i<arr2.length; i++) {
            System.out.println("Eleman : " + arr2[i]);
        }
*/


        /*
        int[] arr2 = new int[5];


        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;

        System.out.println("Array 2'nin Birinci Elemani : " + arr2[0]);
        System.out.println("Array 1 in ikinci elemani : " + arr1[1]);
*/

/*
        for (int i = 0; i<5; i++) {
            System.out.println("Eleman : " + arr1[i]);
        }
*/
/*
        for (int i = 0; i<arr1.length; i++) {
            System.out.println("Eleman : " + arr1[i]);
        }
*/

    }
}
