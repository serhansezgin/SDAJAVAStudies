package lesson4;

public class StaticExample {


    //static int count = 0;
    int count = 0;

    public static void main(String[] args) {
        StaticExample staticObject = new StaticExample();
        StaticExample staticObject1= new StaticExample();

        System.out.println("Static Object 0 = "+staticObject.count);
        staticObject.count++;
        System.out.println("Static Object 0 = "+staticObject.count);
        System.out.println("Static Object 1 = "+staticObject1.count);


//static what is the meaning?


    }


}
