package com.apt.ebuy.model;

import com.apt.ebuy.entity.AccountEntity;

public class AccountModel {

    public Integer id;
    public String fullName;
    public String email;
    public String password;

    public AccountModel() {
        super();
    }

    public AccountModel(AccountEntity db) {
        super();
        this.id = db.getId();
        this.fullName = db.getFullName();
        this.email = db.getEmail();
        this.password = db.getPassword();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
