package lesson4;

public class SimpleCat {


    private String name;
    private int age;
    private String breed;
    private String text;

    public static String owner;

    public SimpleCat() {
    }

    public SimpleCat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void printInformation() {
        System.out.println("Animal's name " + name);
        System.out.println("Animal's age " + age);
        System.out.println("Animal's gender " + breed);


    }

    public void meow() {


        System.out.println(name + " says meow");

        /*
        if (name.equalsIgnoreCase("Sparkle"))
            System.out.println("Sparkle says meow");
        else
            System.out.println("Wrong information");

        if (name.equalsIgnoreCase("Luxury"))
            System.out.println("Luxury says Fight");
        else
            System.out.println("Wrong information");
*/

    }

    public void say(String text) {
        System.out.println(name + " says " + text);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}