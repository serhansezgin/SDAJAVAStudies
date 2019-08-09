package lesson5;

public class VarargsExample {

    //without Varargs
    public double sumWithoutVarargs (double x, double y, double z, double t){
        double result = x + y + z + t;
        return result;
    }
    //with Varargs
    public double sumWithVarargs (double ... nums){
        double result = 0;
        for (double num : nums){
            result = result + num;
        }
        return result;
    }
    //with Array
    public double   sumWithArray (double [] arr){
        double result = 0 ;
        for (double num : arr){
            result = result + num;
        }
        return result;
    }
    public static void main(String[] args) {
        VarargsExample varargsExample = new VarargsExample();
        double x = 5;
        double y = 6;
        double z = 4;
        double t = 1;
        //Without Varargs you can add the exactly number that were assigned on top.
        double result1 = varargsExample.sumWithoutVarargs(x,y,z,t);
        System.out.println("Result without varargs " + result1);
        //Varargs allow you set as many numbers as you want.
        double result2 = varargsExample.sumWithVarargs(x,y,z,t);
        System.out.println("Result with varargs " + result2);
        //With Array example
        double [] arr = {x,y,z,t,};
        double result3 = varargsExample.sumWithArray(arr);
        System.out.println("Result with Array " + result3);
    }
}



