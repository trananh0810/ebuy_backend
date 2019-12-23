package com.apt.ebuy.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ward", schema = "ebuy", catalog = "")
public class WardEntity {
    private int id;
    private String name;
    private String prefix;

    @Id
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
    @Column(name = "prefix")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WardEntity that = (WardEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(prefix, that.prefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, prefix);
    }
}
