package studiesyb;
/*
public class FunctionsReturn {
    public static int toplama(int a,int b,int c){

        //System.out.println("Toplamlari: " + (a+b+c));
        return(a+b+c);

    }


    public static void main(String[] args) {


        System.out.println("Fonksiyondan donen deger: " + toplama (3,4,5));


    }
}
*/



public class FunctionsReturn {
    public static int ucilecarp(int a){
        return a*3;
            }
    public static int ikitopla(int a){
        return a+2;
    }
    public static int dortcikart(int a){
        return a-4;
    }

    public static void main(String[] args) {



        System.out.println("Sonuc:" + dortcikart(ikitopla(ucilecarp(4))));


    }
}
