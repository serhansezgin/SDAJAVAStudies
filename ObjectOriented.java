package studiesyb;

public class ObjectOriented {

    public static void main(String[] args) {

        // Fields
        // Methods

Car car1 = new Car("Gumus", "Renault Megane",1.6,4);
Car car2 = new Car();
Car car3 = new Car("Siyah","Mercedes");

car1.showInfos();
car2.showInfos();
car3.showInfos();


       // car1.model = "Renault megane";

      //  car1.doors=4;



/*
car1.setColor("Gumus");
car1.setModel("Renault Megane");
car1.setEngine(1.6);
car1.setDoors(3);
*/
/*car1.color = "Gumus";
car1.model = "Renault megane";
car1.engine=1.6;
car1.doors=4;*/

/*
        System.out.println("Arabanin Rengi: " + car1.getColor());
        System.out.println("Arabanin Modeli: " + car1.getModel());
        System.out.println("Arabanin Motoru: " + car1.getEngine());
        System.out.println("Arabanin Kapilari: " + car1.getDoors());
*/
        car1.start();
        car1.stop();

        //System.out.println("Arabanin Rengi: " + car1.color);
        /*System.out.println("Arabanin Modeli: " + car1.model);
        System.out.println("Arabanin Motoru: " + car1.engine);
        System.out.println("Arabanin Kapilari: " + car1.doors);*/


    }




}
