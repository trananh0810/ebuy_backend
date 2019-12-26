package com.apt.ebuy.model;

import com.apt.ebuy.entity.OrdersEntity;

public class OrderModel {
    public int id;
    public int status;

    public OrderModel() {
        super();
    }

    public OrderModel(OrdersEntity db) {
        super();
        this.id = db.getId();
        this.status = db.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
