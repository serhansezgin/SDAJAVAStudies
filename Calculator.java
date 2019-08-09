package lesson5;

public class Calculator {

    //public void cannot work with return
    //void can be used only in the same class
    public double sum(double x, double y){
        return x + y;
    }
    public double subtrack(double x, double y){
        return x - y;
    }
    public double multiply(double x, double y){
        return x * y;
    }
    public double divide(double x, double y){
        return x / y;
    }
    public double mod (double x, double y){
        return x % y;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double x =5;
        double y =4;
        double sumResult = calculator.sum(x,y);
        double subtrackResult = calculator.subtrack(x,y);
        double multiplyResult = calculator.multiply(x,y);
        double divideResupt = calculator.divide(x,y);
        double modResult = calculator.mod(x,y);
        System.out.println("Sum result is " + sumResult);
        System.out.println("Subtrack result is " + subtrackResult);
        System.out.println("Multiply result is " + multiplyResult);
        System.out.println("Divide result is " + divideResupt);
        System.out.println("Mod result is " + modResult);
    }
}




