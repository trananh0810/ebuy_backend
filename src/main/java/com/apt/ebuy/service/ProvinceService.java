package com.apt.ebuy.service;

import com.apt.ebuy.entity.ProductEntity;
import com.apt.ebuy.entity.ProvinceEntity;
import com.apt.ebuy.model.ProvinceModel;
import com.apt.ebuy.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    public List<ProvinceModel> findAll(){
        List<ProvinceEntity> entityList = provinceRepository.findAll();
        List<ProvinceModel> modelList = new ArrayList<>();
        for (ProvinceEntity item : entityList) {
            ProvinceModel model = new ProvinceModel(item);
            modelList.add(model);
        }
        return modelList;
    }

    public ProvinceModel findById(Integer id){
        Optional<ProvinceEntity> optional = provinceRepository.findById(id);
        if (optional.isPresent()) {
            return new ProvinceModel(optional.get());
        }
        return null;
    }

    public ProvinceModel update(ProvinceModel model) {
        ProvinceEntity entity = new ProvinceEntity();
        if (model.provinceId == null) {
            entity = new ProvinceEntity(model.name, model.code);
            provinceRepository.save(entity);
        } else {
            entity = new ProvinceEntity(model.provinceId, model.name, model.code);
        }
        return model;
    }

    public boolean delete(Integer id) {
        // dùng ofNullable vì đối person có thể null
        Optional<ProvinceEntity> optional = provinceRepository.findById(id);

        // ifPresent: kiểm tra đối tượng bên trong optional có khác null không
        if (optional.isPresent()) {
            provinceRepository.delete(optional.get());
            return true;
        }
        return false;
    }
}
