package com.apt.ebuy.model;

import com.apt.ebuy.entity.ProductEntity;

public class ProductModel {
    public Integer id;
    public String name;
    public String thumnail;
    public String qrcode;
    public int price;
    public Integer categoryId;
    public CategoryModel category = new CategoryModel();

    public ProductModel() {
        super();
    }

    public ProductModel(ProductEntity db) {
        this.id = db.getId();
        this.name = db.getName();
        this.thumnail = db.getThumnail();
        this.qrcode = db.getQrcode();
        this.price = db.getPrice();
        this.categoryId = db.getCategory().getId();
        this.category = new CategoryModel(db.getCategory());
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

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }
}
