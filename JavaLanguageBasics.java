package studies;

public class JavaLanguageBasics {


        static int y;
        int z;
        int f(int x){
            return x*2;
        }





        public static void main(String[] args) {
            int x=10;
            //Human.boy = 10;
            y=10;



            char c = 109;
            float f = 120;
            //int n = (int)3.14;
            float n = (float) 3.14;


            System.out.println(n++);  //3.14
            System.out.println(++n);  //5.14

            if (n==4 || ++n>2){

            }



            int bx = 13;    //1101b >> 1; 0110
            System.out.println(" shift "+( bx >> 2));
            System.out.println(" ikinci shift "+( bx << 1));


            System.out.println("xor deneme " + (bx^7)); //0111






            System.out.println("n: "+n);
            n = (n<4)?0:100;
            System.out.println("n: "+n);




            String s = ""+123;
            String sayi = "123";
            System.out.println(sayi + 5); //1235
            int say = Integer.parseInt(sayi);


            //int [] a;
            int a[]={1,2,377,44,3,4,4};
            //a = new int[10];


            //int k =n;
            float k = n;

/*
            int b[] = a;
            System.out.println("eski a " + a[2]);

            b[2]=15;
            System.out.println("yeni a "+ a[2]);
*/
            int aa[] = a; //shallow copy
            int b[] = new int [a.length];   // if you want a new independent array, whitout effecting each others

            System.arraycopy(a,0,b,0, a.length);  //deep copy
            for (int i = 0;i<a.length;i++){
                b[i] = a[i];
            }
            System.out.println("eski a " + a[2]);
            b[2]=15;
            System.out.println("yeni a "+ a[2]);


           // if ( a == b) // shallow comparison



            JavaLanguageBasics ja12 = new JavaLanguageBasics();
            ja12.z=20;

            System.out.println("merhaba bil kavramlari");

            Employee ali = new Employee ();
            ali.boy = 180;
            ali.kilo = 80;
            ali.yas = 22;
            System.out.println("alinin yasi " + ali.yas + " alinin kilosu " + ali.kilo + " alinin boyu " + ali.boy);

            Human veli = new Human ();
            veli.boy = 180;
            veli.kilo = 80;
            veli.yas = 22;
            System.out.println("velinin yasi " + veli.yas + " velinin kilosu " + veli.kilo + " velinin boyu " + veli.boy);

            ali.yemek();
            veli.yemek();

            System.out.println("velinin yasi " + veli.yas + " velinin kilosu " + veli.kilo + " velinin boyu " + veli.boy);

            ali.maas = 100;
            ali.zam(20);
            System.out.println("alinin zamli maasi " + ali.maas);


        }


    }





