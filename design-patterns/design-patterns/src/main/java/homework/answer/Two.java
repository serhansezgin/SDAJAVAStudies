package homework.answer;

public class Two {

    /**
     * Answer : extracting common variables to super class
     */

}
class Party {
    //...
    private Double annualCost;
    private String name;
}


class Department extends Party{

    private int headCount;
}

class Employee extends Party{

    private int id;
}