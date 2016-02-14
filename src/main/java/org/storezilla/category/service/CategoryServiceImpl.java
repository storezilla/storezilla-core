/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.storezilla.category.dao.CategoryDao;
import org.storezilla.category.model.Category;

/**
 *
 * @author LPT466
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryDao categoryDao;
    

    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    @Transactional
    public void removeCategory(int categoryId) {
        categoryDao.removeCategory(categoryId);
    }

    @Override
    @Transactional
    public List<Category> listCategories() {
        return categoryDao.listCategories();
    }

    @Override
    @Transactional
    public Category getCategoryById(int categoryId) {
        return categoryDao.getCategoryById(categoryId);
    }

    @Override
    @Transactional
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }
}
