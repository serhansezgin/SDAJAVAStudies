package thirteen.open.closed.principle.before;

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

class SalaryService
{

    public double calculateTotalSalaries(List<Engineer> engineers)
    {
        double totalSalaries = 0D ;

        for(Engineer engineer : engineers)
        {
            totalSalaries += engineer.hourlyRate * engineer.workingHours;
        }
        return totalSalaries;
    }
}


/**
 * So far so good.
 * But what if we have new requirements that
 * senior engineers should have bonus of 30% on their salary.
 * To meet requirements, we need to modify our "calculateSalary" method
 *
 **/

class SalaryServiceWithNewRequirement
{

    public double calculateTotalSalaries(List<Engineer> engineers)
    {
        double totalSalaries = 0D ;

        for(Engineer engineer : engineers)
        {
            if(engineer.level.equals("Senior")){
                totalSalaries += engineer.hourlyRate * engineer.workingHours * 1.3;
            }
            else{
                totalSalaries += engineer.hourlyRate * engineer.workingHours;
            }

        }
        return totalSalaries;
    }
}

/**
 * Problem here is modification part can grow and we don't know how our code grows
 *
 * Solution ?
 **/

