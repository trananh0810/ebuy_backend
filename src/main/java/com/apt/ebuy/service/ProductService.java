package com.apt.ebuy.service;

import com.apt.ebuy.entity.CategoryEntity;
import com.apt.ebuy.entity.ProductEntity;
import com.apt.ebuy.model.ProductModel;
import com.apt.ebuy.repository.CategoryRepository;
import com.apt.ebuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<ProductModel> findAll() {
        List<ProductModel> modelList = new ArrayList<>();
        List<ProductEntity> entityList = productRepository.findAll();

        for (ProductEntity item : entityList) {
            ProductModel model = new ProductModel(item);
            modelList.add(model);
        }
        return modelList;
    }

    public Map<String, Object> findByCategory(Integer categoryId, Integer pageActive, Integer quantityItem) {
        if (pageActive != null || quantityItem != null) {
            Map<String, Object> mapResult = new HashMap<>();
            Page<ProductEntity> page = productRepository.findAll(PageRequest.of(pageActive, quantityItem));
            mapResult.put("totalPage", page.getTotalPages());

            List<ProductModel> modelList = new ArrayList<>();
            page.forEach(item -> {
                ProductModel model = new ProductModel(item);
                modelList.add(model);
            });
            mapResult.put("modelList", modelList);
            return mapResult;
        }
        return null;
    }

    public ProductModel findById(Integer id) {
        Optional<ProductEntity> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            return new ProductModel(optional.get());
        }
        return null;
    }

    public ProductModel save(ProductModel model) {
        if (model.id != null) {
            Optional<CategoryEntity> optional = categoryRepository.findById(model.categoryId);
            if (optional.isPresent()) {
                ProductEntity entity = new ProductEntity(model.name, model.thumnail, model.qrcode, model.price, optional.get());
                productRepository.save(entity);
                return new ProductModel(entity);
            } else {
                return null;
            }
        }
        return null;
    }

    public ProductModel update(ProductModel model) {
        Optional<ProductEntity> productOptional = productRepository.findById(model.id);
        if (productOptional.isPresent()) {
            Optional<CategoryEntity> categoryOptional = categoryRepository.findById(model.categoryId);
            if (categoryOptional.isPresent()) {
                ProductEntity entity = new ProductEntity(model.id, model.name, model.thumnail, model.qrcode, model.price, categoryOptional.get());
                productRepository.save(entity);
                return new ProductModel(entity);
            } else {
                return null;
            }
        }
        return null;
    }

}
