package studiesyb;

public class Car {
    // Fields, Properties
    private String color;
    private String model;
    private double engine;
    private int doors;



    public Car (String color, String model){
        this(color,model,0,0);
    }




    public Car(){
       /* this.color = "Bilgi Yok";
        this.model = "Bilgi Yok";
        this.engine = 0;
        this.doors = 0;*/
        this("Bilgi Yok","Bilgi Yok",0,0);




    }


    public Car(String color,String model,double engine,int doors){
        this.color= color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;



    }



public void setColor(String color){
    this.color = color;

}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Kapi Sayisi 2 veya 4 olabilir");
        }
    }


    public String getColor() {
    return color;
}
    public void start(){
        System.out.println("Araba Calisti....");
    }
    public void stop(){
        System.out.println("Araba Durdu...");
}
    public void showInfos(){
        System.out.println("Arabanin Rengi: " + this.color);
        System.out.println("Arabanin Modeli: " + this.model);
        System.out.println("Arabanin Motoru: " + this.engine);
        System.out.println("Arabanin Kapilari: " + this.doors);

    }



}
