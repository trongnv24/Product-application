package Trainingjavaspring.boot.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table( name = " product")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private double price;
    @PrePersist
    public void init() {
        this.id = Objects.isNull(this.id) ? UUID.randomUUID().toString() : this.id;
    }

    public ProductEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
