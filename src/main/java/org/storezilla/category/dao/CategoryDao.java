/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import org.storezilla.category.model.Category;

/**
 *
 * @author Mitesh Manani
 */
@Component
public interface CategoryDao {
    public void addCategory(Category store);
    public void removeCategory(int storeId);
    public List<Category> listCategories();
    public Category getCategoryById(int id);
    public void updateCategory(Category store);
}
