package com.apt.ebuy.model;

import com.apt.ebuy.entity.CategoryEntity;

public class CategoryModel {
    public Integer id;
    public String name;
    public String thumnail;

    public CategoryModel() {
        super();
    }

    public CategoryModel(CategoryEntity db) {
        this.id = db.getId();
        this.name = db.getName();
        this.thumnail = db.getThumnail();
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
}
