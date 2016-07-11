/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.storezilla.product.dao.ProductDao;
import org.storezilla.product.model.Product;
/**
 *
 * @author LPT466
 */

@Service("productService")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    @Transactional
    public void removeProduct(int productId) {
        productDao.removeProduct(productId);
    }

    @Override
    @Transactional
    public List<Product> listProducts() {
        return productDao.listProducts();
    }

    @Override
    @Transactional
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }
}
