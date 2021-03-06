package three;

import javax.persistence.*;
@Entity
@Table(name = "ADDRESS")
public class Address {

    //schema = "" is also definable
    /**
     * @GeneratedValue generates an automatic value during
        commit for every new entity object.

        Auto strategy - the persistence provider will determine values
    based on the type of the primary key attribute.
    For numeric values, the generation is based on a sequence

        Identity - relies on the IdentityGenerator which expects
    values generated by an identity column in the database,
    meaning they are auto-incremented.

     **/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private int houseNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "pc")
    private String pc;

    // we need no-arg constructor
    public Address() {

    }

    public Address(String street, int houseNumber, String city, String pc) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.pc = pc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", pc='" + pc + '\'' +
                '}';
    }
}
