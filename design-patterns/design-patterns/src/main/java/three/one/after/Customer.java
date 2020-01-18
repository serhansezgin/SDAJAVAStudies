package three.one.after;

import java.util.Date;

// - by Joshua Bloch - Effective Java Book
public class Customer {

    private final Long id;         // required, the rest of it optional
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final Date birthDate;
    private final String email;
    private final String address;
    private final String gender;

    public static class CustomerBuilder {
        private  final Long id;
        private  String firstName;
        private  String middleName;
        private  String lastName;
        private  Date birthDate;
        private  String email;
        private  String address;
        private String gender;

        public CustomerBuilder(Long id) {
            this.id = id;
        }

        public CustomerBuilder firstName(String val) {
            this.firstName = val;
            return this;
        }

        public CustomerBuilder middleName(String val) {
            this.middleName = val;
            return this;
        }

        public CustomerBuilder lastName(String val) {
            this.lastName = val;
            return this;
        }

        public CustomerBuilder birthDate(Date val) {
            this.birthDate = val;
            return this;
        }

        public CustomerBuilder email(String val) {
            this.email = val;
            return this;
        }

        public CustomerBuilder address(String val) {
            this.address = val;
            return this;
        }
        public CustomerBuilder gender(String value){
            this.gender = value;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

    private Customer(CustomerBuilder customerBuilder){
        id = customerBuilder.id;
        firstName = customerBuilder.firstName;
        middleName = customerBuilder.middleName;
        lastName = customerBuilder.lastName;
        birthDate = customerBuilder.birthDate;
        email = customerBuilder.email;
        address = customerBuilder.address;
        gender = customerBuilder.gender;
    }


}
