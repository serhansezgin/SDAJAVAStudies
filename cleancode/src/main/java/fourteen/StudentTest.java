package fourteen;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().id(1L).firstName("Feride").lastName("Celik").city("Tallinn").build();

        Student another = new Student.StudentBuilder().id(1L).firstName("Evelin").lastName("Celik").city("Tallinn").startYear(1995).zipCode("IA").build();


        List<String> b = new ArrayList<>();
    }


}
