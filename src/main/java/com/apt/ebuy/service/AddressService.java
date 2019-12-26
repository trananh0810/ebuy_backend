package com.apt.ebuy.service;

import com.apt.ebuy.entity.AddressEntity;
import com.apt.ebuy.model.AddressModel;
import com.apt.ebuy.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<AddressModel> findAll() {
        List<AddressModel> modelList = new ArrayList<>();
        List<AddressEntity> entityList = addressRepository.findAll();
        for (AddressEntity item : entityList) {
            AddressModel model = new AddressModel(item);
            modelList.add(model);
        }
        return modelList;
    }

    public AddressModel findById(Integer id) {
        Optional<AddressEntity> optional = addressRepository.findById(id);
        if (optional.isPresent()) {
            return new AddressModel(optional.get());
        }
        return null;
    }

}
