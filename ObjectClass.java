package studies;


class Insan2{
    int boy;

}
class Ogrenci extends Insan2 implements Cloneable{
    Object Kopyala() throws CloneNotSupportedException{
        return this.clone();
    }
    Ogrenci Kopyala2() {
        Ogrenci temp = new Ogrenci();
        temp.boy = this.boy;
        return temp;
    }
    boolean equals(Ogrenci rhs){
        /*if(this.boy == rhs.boy){
            return true;
        }
        else{
            return false;
        }*/
        return this.boy == rhs.boy;
    }
    public String toString(){
        return "bu objenin boyu "+this.boy;
    }
}

public class ObjectClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        Insan2 ali = new Insan2();
        //Insan veli = new Insan;
        //Insan ahmet; //NULL empty
        Insan2 ahmet = ali; //shallow copy  (sig kopyalama)
        //ahmet.boy = 180;
        ali.boy = 180;
        System.out.println(ahmet.boy);  //2 object shows the same place
        if(ali==ahmet){
            System.out.println("esitler");
        }
        if(ali.equals(ahmet)){
            System.out.println("esitler2");
        }


        Ogrenci ayse = new Ogrenci();
        ayse.boy = 160;
        Ogrenci fatma = (Ogrenci)ayse.Kopyala2();//deep copy (derin kopyalama)
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy = 190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        ayse.boy = 190;
        if (ayse == fatma){    // == means the places in the memory are ok
            System.out.println("esitler3");
        }
        if (ayse.equals((fatma))){     //equals means values are equal
            System.out.println("esitler4");
        }
        System.out.println(ayse);
        System.out.println(ayse.hashCode());

    }
}
