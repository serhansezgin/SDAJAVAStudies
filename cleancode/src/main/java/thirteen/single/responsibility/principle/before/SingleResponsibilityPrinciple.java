package thirteen.single.responsibility.principle.before;

public class SingleResponsibilityPrinciple {

    /**
     * A class should have one and only one reason to change,
     * meaning that a class should have only one job.
     *
     * What is Single ?
     * What id Responsibility?
     */
}

class Customer {
    private String name;
    private String surname;
    private int age;
    private String email;

    // violates SRP
    public boolean checkAge(){return false;}
    public boolean validateEmail(){return false;}
}


class CustomerFieldValidation{
    public boolean checkAge(int age){return false;}
    public boolean validateEmail(String email){return false;}
}