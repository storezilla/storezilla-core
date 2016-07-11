/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.product.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import org.storezilla.category.model.Category;
import org.storezilla.product.model.Product;

/**
 *
 * @author LPT466
 */
@Component
public interface ProductDao {
    public void addProduct(Product product);
    public void removeProduct(int productId);
    public List<Product> listProducts();
    public Product getProductById(int productId);
    public void updateProduct(Product product);
}
