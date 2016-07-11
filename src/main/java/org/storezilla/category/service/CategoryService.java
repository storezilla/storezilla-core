/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.service;

import java.util.List;
import org.storezilla.category.model.Category;

/**
 *
 * @author LPT466
 */
public interface CategoryService {
    public void addCategory(Category category);
    public void removeCategory(int categoryId);
    public List<Category> listCategories();
    public Category getCategoryById(int categoryId);
    public void updateCategory(Category category);
}
