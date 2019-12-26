package com.apt.ebuy.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orderdetail", schema = "ebuy")
public class OrderdetailEntity {
    private int id;
    private int quantity;
    private int price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailEntity that = (OrderdetailEntity) o;
        return id == that.id &&
                quantity == that.quantity &&
                price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, price);
    }
}
