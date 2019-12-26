package com.apt.ebuy.controller;

import com.apt.ebuy.model.CategoryModel;
import com.apt.ebuy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public List<CategoryModel> list() {
        return categoryService.findAll();
    }

    @PostMapping("/save")
    public CategoryModel save(@ModelAttribute CategoryModel model) {
        return categoryService.save(model);
    }

    @PutMapping("/update")
    public CategoryModel update(@ModelAttribute CategoryModel model) {
        return categoryService.update(model);
    }

    @DeleteMapping("/delete")
    public boolean delete (@RequestParam Integer id) {
        return categoryService.delete(id);
    }
}
