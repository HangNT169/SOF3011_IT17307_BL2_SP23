package com.poly.hangnt169.B8_CRUDHibernate.service.impl;

import com.poly.hangnt169.B8_CRUDHibernate.entity.Category;
import com.poly.hangnt169.B8_CRUDHibernate.repository.CategoryRepository;
import com.poly.hangnt169.B8_CRUDHibernate.service.CategoryService;

import java.util.List;

/**
 * @author hangnt169
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository = new CategoryRepository();

    // Fake data
    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
}
