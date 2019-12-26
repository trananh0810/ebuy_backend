package com.apt.ebuy.model;

import com.apt.ebuy.entity.DistrictEntity;

public class DistrictModel {

    public int id;
    public String name;
    public String prefix;

    public DistrictModel() {
        super();
    }

    public DistrictModel(DistrictEntity db) {
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
