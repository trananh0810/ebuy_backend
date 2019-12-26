package com.apt.ebuy.service;

import com.apt.ebuy.entity.AccountEntity;
import com.apt.ebuy.model.AccountModel;
import com.apt.ebuy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountModel> findAll() {
        List<AccountEntity> entityList = accountRepository.findAll();
        List<AccountModel> modelList = new ArrayList<>();

        for (AccountEntity item : entityList) {
            AccountModel model = new AccountModel(item);
            modelList.add(model);
        }

        return modelList;
    }

    public AccountModel findById(Integer id) {
        Optional<AccountEntity> optional = accountRepository.findById(id);
        if (optional.isPresent()) {
            return new AccountModel(optional.get());
        }
        return null;
    }

    public AccountModel update(AccountModel model) {
        if (model.id == null) {
            AccountEntity entity = new AccountEntity(model.fullName, model.email, model.password);
            accountRepository.save(entity);
        } else {
            Optional<AccountEntity> optional = accountRepository.findById(model.id);
            if (optional.isPresent()) {
                AccountEntity entity = new AccountEntity(model.id, model.fullName, model.email, model.password);
                accountRepository.save(entity);
            }
        }

        return null;
    }

    public boolean delete(Integer id) {
        Optional<AccountEntity> optional = accountRepository.findById(id);
        if (optional.isPresent()) {
            accountRepository.delete(optional.get());
            return true;
        }
        return false;
    }


}
