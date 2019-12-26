package com.apt.ebuy.service;

import com.apt.ebuy.entity.CategoryEntity;
import com.apt.ebuy.model.CategoryModel;
import com.apt.ebuy.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryModel> findAll() {
        List<CategoryModel> modelList = new ArrayList<>();
        List<CategoryEntity> entityList = categoryRepository.findAll();
        for (CategoryEntity item : entityList) {
            CategoryModel model = new CategoryModel(item);
            modelList.add(model);
        }
        return modelList;
    }

    public CategoryModel findById(Integer id) {
        Optional<CategoryEntity> optional = categoryRepository.findById(id);
        if (optional.isPresent()) {
            return new CategoryModel(optional.get());
        }
        return null;
    }

    public CategoryModel save(CategoryModel model) {
        if (model.id != null) {
            CategoryEntity entity = new CategoryEntity(model.name, model.thumnail);
            return new CategoryModel(categoryRepository.save(entity));
        }
        return null;
    }

    public CategoryModel update(CategoryModel model) {
        Optional<CategoryEntity> optional = categoryRepository.findById(model.id);
        if (optional.isPresent()) {
            CategoryEntity entity = new CategoryEntity(model.id, model.name, model.thumnail);
            categoryRepository.save(entity);
            return model;
        }
        return null;
    }

    public boolean delete(Integer id) {
        Optional<CategoryEntity> optional = categoryRepository.findById(id);
        if (optional.isPresent()) {
            categoryRepository.delete(optional.get());
            return true;
        }
        return false;
    }

}
