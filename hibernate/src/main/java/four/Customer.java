package four;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @PreUpdate
    @PrePersist
    public void setLastUpdate() {
        System.out.println("last update column updated");
        setLastUpdate(new Timestamp(System.currentTimeMillis()));
    }

    public Customer() {
    }

    public Customer(String name, Timestamp lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}
