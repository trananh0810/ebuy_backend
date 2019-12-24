package com.apt.ebuy.service;

import com.apt.ebuy.entity.ProvinceEntity;
import com.apt.ebuy.model.ProvinceModel;
import com.apt.ebuy.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        ProvinceEntity db = provinceRepository.getOne(id);
        return new ProvinceModel(db);
    }
}
