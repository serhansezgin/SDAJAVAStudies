package six;

import javax.persistence.*;

@Entity
@Table(name="Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name="code")
    private String code;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;


    public Item() {

    }

    public Item(String code, Double price, int quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", cart_id=" + cart.getId() +
                '}';
    }
}
