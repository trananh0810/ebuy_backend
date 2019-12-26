package com.apt.ebuy.model;

import com.apt.ebuy.entity.WardEntity;

public class WardModel {
    public int id;
    public String name;
    public String prefix;

    public WardModel() {
        super();
    }

    public WardModel(WardEntity db) {
        super();
        this.id = db.getId();
        this.name = db.getName();
        this.prefix = db.getPrefix();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
