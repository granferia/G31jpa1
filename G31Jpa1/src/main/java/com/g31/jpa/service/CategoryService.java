/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.service;

import com.g31.jpa.entity.Category;
import com.g31.jpa.entity.Game;
import com.g31.jpa.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sistemas
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    public Category getCategory(Long id) {
        return categoryRepository.findById(id).get();
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);

    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<Game> getGamesByCategory(Long idCat) {
        Category category = categoryRepository.findById(idCat).get();
        return category.getGames();
    }
}
