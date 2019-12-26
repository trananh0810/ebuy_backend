package com.apt.ebuy.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "province", schema = "ebuy")
public class ProvinceEntity {
    private int id;
    private String name;
    private String code;

    public ProvinceEntity() {
    }

    public ProvinceEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public ProvinceEntity(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvinceEntity that = (ProvinceEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }
}
