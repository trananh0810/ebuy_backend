package com.apt.ebuy.model;

import com.apt.ebuy.entity.AddressEntity;

public class AddressModel {
    public int id;
    public String phone;
    public String street;

    public AddressModel() {
        super();
    }

    public AddressModel(AddressEntity db) {
        super();
        this.id = db.getId();
        this.phone = db.getPhone();
        this.street = db.getStreet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
