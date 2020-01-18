package three.two;

public class StudentTest {


    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().id(1L)
        .firstName("Feride").lastName("Celik").city("Tallinn").build();

        Student another = new Student.StudentBuilder().id(1L)
        .firstName("Evelin").lastName("Surname")
                .city("Tallinn").startYear(1995).zipCode("19100")
                .state("Harjumaa").gender("").build();

    }
}
