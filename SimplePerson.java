package lesson4;

public class SimplePerson {
    private String name;
    private int age;
    private String gender;

    public void printInformation(){
        System.out.println("Person name "+name);
        System.out.println("Person age "+age);
        System.out.println("Person gender "+gender);


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
