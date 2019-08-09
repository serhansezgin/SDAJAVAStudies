/*
create class Dog
Dog will have name,species, age fields

Dog will have a method which will print his age decision

for Beagle
if age is below 3 it is young
if between 3 to 6 it is adult
older than 6 then it is old

for Husky
if age is below 4 it is young
if between 4 to 7 it is adult
older than 7 then it is old

for Chihuahua
if age is below 3 it is young
if between 3 to 7 it is adult
older than 7 then it is old

create another method which will print all its information.

create another class it will have main.
Get name age and species. You cannot accept any species beside beagle husky and Chihuahua
age cannot be negative.
 */

package lesson3;

public class Homework12 {


    public static void main(String[] args) {
        Hw12ClassDog dog1 = new Hw12ClassDog();
        Hw12ClassDog dog2 = new Hw12ClassDog();
        Hw12ClassDog dog3 = new Hw12ClassDog();


        dog1.age = 3;
        dog1.name = "Exclibur";
        dog1.species = "Beagle";


        dog2.age = 5;
        dog2.name = "Admiral";
        dog2.species = "Husky";

        dog3.age = 1;
        dog3.name = "Exctacy";
        dog3.species = "Chihuahua";



        if (dog1.age<3)
        System.out.println(dog1.species + " Dog's Age young which is " + dog1.age);
        else if(dog1.age >3 || dog1.age <6)
        System.out.println(dog1.species + " Dog's Age adult which is " + dog1.age);
        else if (dog1.age>6)
        System.out.println(dog1.species + " Dog's Age old which is " + dog1.age);
        else if (dog1.age<0)
            System.out.println(dog1.species + " Dog's age can't be negative");
        else
        System.out.println("immortal dog");



        if (dog2.age<4)
            System.out.println(dog2.species + " Dogs Age young which is " + dog2.age);
        else if(dog2.age >4 || dog2.age <7)
            System.out.println(dog2.species + " Dogs Age adult which is " + dog2.age);
        else if (dog2.age>7)
            System.out.println(dog2.species + " Dogs Age old which is " + dog2.age);
        else if (dog2.age<0)
            System.out.println(dog2.species + " Dog's age can't be negative");
        else
            System.out.println("immortal dog");





        if (dog3.age<3)
            System.out.println(dog3.species + " Dogs Age young which is " + dog3.age);
        else if(dog3.age >3 || dog3.age <7)
            System.out.println(dog3.species + " Dogs Age adult which is " + dog3.age);
        else if (dog3.age>7)
            System.out.println(dog3.species + " Dogs Age old which is " + dog3.age);
        else if (dog3.age<0)
            System.out.println(dog3.species + " Dog's age can't be negative");
        else
            System.out.println("immortal dog");

        System.out.println("\n");
        System.out.println("Dog's species " + dog1.species + " , Dog's age " + dog1.age + " , Dog's name " + dog1.name);
        System.out.println("Dog's species " + dog2.species + " , Dog's age " + dog2.age + " , Dog's name " + dog2.name);
        System.out.println("Dog's species " + dog3.species + " , Dog's age " + dog3.age + " , Dog's name " + dog3.name);







    }
}
