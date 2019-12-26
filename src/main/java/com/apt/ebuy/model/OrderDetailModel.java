package com.apt.ebuy.model;

import com.apt.ebuy.entity.OrderdetailEntity;

public class OrderDetailModel {
    public int id;
    public int quantity;
    public int price;

    public OrderDetailModel() {
        super();
    }

    public OrderDetailModel(OrderdetailEntity db) {
        super();
        this.id = db.getId();
        this.quantity = db.getQuantity();
        this.price = db.getPrice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
