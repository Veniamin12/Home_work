package Home_13;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.UUID;


public class Product implements Comparator {
    private String type;
    private Integer price;
    private Boolean discount;
    private LocalDate localDate;
    private UUID id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public UUID getId() {
        return id;
    }

    public Product(String type, Integer price, Boolean discount, LocalDate localDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.localDate = localDate;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", localDate=" + localDate +
                ", id=" + id +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.getPrice().compareTo(getPrice());
    }
}
