package com.apt.ebuy.controller;

import com.apt.ebuy.model.ProvinceModel;
import com.apt.ebuy.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/list")
    public List<ProvinceModel> list() {
        List<ProvinceModel> modelList = provinceService.findAll();
        return modelList;
    }

    @GetMapping("/form")
    public ProvinceModel form(@ModelAttribute ProvinceModel search){
        ProvinceModel model = provinceService.findById(search.getProvinceId());
        return model;
    }

    @DeleteMapping("/delete")
    public boolean delete(@ModelAttribute ProvinceModel model) {
//        boolean serviceDelete = provinceService
        return true;
    }
}
