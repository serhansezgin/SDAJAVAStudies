package thirteen.open.closed.principle.after;

import java.util.List;

public class OCPExample {
    /**
     * Problem :
     *
     * Calculate total cost of all engineer salaries in your organization.
     *
     */
}

class Engineer
{
    public int id;
    public String name;
    public String level;
    public int workingHours;
    public double hourlyRate;
}

/**
 * Problem here is modification part can grow and we don't know how our code grows
 *
 * Solution ?
 **/

abstract class BaseEngineer{

    Engineer engineer;

    public BaseEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    abstract double calculateSalary();
}

class SeniorEngineer extends BaseEngineer {

    public SeniorEngineer(Engineer engineer) {
        super(engineer);
    }
    @Override
    double calculateSalary() {
        return engineer.hourlyRate * engineer.workingHours * 1.3;
    }
}

class JuniourEngineer extends BaseEngineer {

    public JuniourEngineer(Engineer engineer) {
        super(engineer);
    }

    @Override
    double calculateSalary() {
        return engineer.hourlyRate * engineer.workingHours;
    }
}

class SalaryReport{

   public double calculateAllSalaries(List<BaseEngineer> engineers){
        double totalCost = 0;
        for(BaseEngineer engineer : engineers)
        {
            totalCost = totalCost + engineer.calculateSalary();
        }
        return totalCost;
    }

}