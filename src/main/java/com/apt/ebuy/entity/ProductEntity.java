package com.apt.ebuy.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "ebuy")
public class ProductEntity {
    private int id;
    private String name;
    private String thumnail;
    private String qrcode;
    private int price;
    private Timestamp createdDate;
    private CategoryEntity category;

    public ProductEntity() {
    }

    public ProductEntity(String name, String thumnail, String qrcode, int price, CategoryEntity category) {
        this.name = name;
        this.thumnail = thumnail;
        this.qrcode = qrcode;
        this.price = price;
        this.category = category;
    }

    public ProductEntity(int id, String name, String thumnail, String qrcode, int price, CategoryEntity category) {
        this.id = id;
        this.name = name;
        this.thumnail = thumnail;
        this.qrcode = qrcode;
        this.price = price;
        this.category = category;
    }

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "thumnail")
    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    @Basic
    @Column(name = "qrcode")
    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "createdDate")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @ManyToOne
    @Column(name = "categoryID")
    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id &&
                price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(thumnail, that.thumnail) &&
                Objects.equals(qrcode, that.qrcode) &&
                Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, thumnail, qrcode, price, createdDate);
    }
}
