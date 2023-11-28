package com.zood.category.zoodcategoryproject.controller;


import com.zood.category.zoodcategoryproject.model.ItemCategory;
import com.zood.category.zoodcategoryproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class Controller {

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("/get-categories")
    public List<ItemCategory> getItemCategories() {
        return categoryRepository.findAll();
    }




}
