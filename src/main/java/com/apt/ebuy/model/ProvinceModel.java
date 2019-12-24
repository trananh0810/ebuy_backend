package com.apt.ebuy.model;

import com.apt.ebuy.entity.ProductEntity;
import com.apt.ebuy.entity.ProvinceEntity;

public class ProvinceModel {
    public Integer provinceId;
    public String name;
    public String code;

    public ProvinceModel(){
        super();
    }

    public ProvinceModel(ProvinceEntity db){
        super();
        this.provinceId = db.getId();
        this.name = db.getName();
        this.code = db.getCode();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
