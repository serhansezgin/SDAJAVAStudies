package three.two;

public class Student {

    /**
     * Let's build this class with builder pattern
     */
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String streetAddress;
    private final String city;
    private final String zipCode;
    private final String state;
    private final String major;
    private final Integer startYear;
    private final String gender;


    public static class StudentBuilder{

        private  Long id;
        private  String firstName;
        private  String lastName;
        private  String streetAddress;
        private  String city;
        private  String zipCode;
        private  String state;
        private  String major;
        private  Integer startYear;

        public StudentBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        private String gender;

        public StudentBuilder id(Long val){
            this.id = val;
            return this;
        }

        public StudentBuilder firstName(String val){
            this.firstName = val;
            return this;
        }

        public StudentBuilder lastName(String val){
            this.lastName = val;
            return this;
        }

        public StudentBuilder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public StudentBuilder city(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public StudentBuilder state(String state) {
            this.state = state;
            return this;
        }

        public StudentBuilder major(String major) {
            this.major = major;
            return this;
        }

        public StudentBuilder startYear(Integer startYear) {
            this.startYear = startYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.city = builder.city;
        this.major = builder.major;
        this.startYear = builder.startYear;
        this.streetAddress = builder.streetAddress;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.gender = builder.gender;
    }


}
