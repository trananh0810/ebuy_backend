package com.apt.ebuy.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "ebuy")
public class CategoryEntity {
    private int id;
    private String name;
    private String thumnail;
    private List<ProductEntity> productList;

    public CategoryEntity() {
        super();
    }

    public CategoryEntity(String name, String thumnail) {
        super();
        this.name = name;
        this.thumnail = thumnail;
    }

    public CategoryEntity(int id, String name, String thumnail) {
        this.id = id;
        this.name = name;
        this.thumnail = thumnail;
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

    @OneToMany(mappedBy = "category")
    public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(thumnail, that.thumnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, thumnail);
    }
}
