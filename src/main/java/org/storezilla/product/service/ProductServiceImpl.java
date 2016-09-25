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
import org.storezilla.category.dao.CategoryDao;
import org.storezilla.category.service.CategoryService;
import org.storezilla.manufacturer.dao.ManufacturerDao;
import org.storezilla.manufacturer.service.ManufacturerService;
import org.storezilla.product.dao.ProductDao;
import org.storezilla.product.model.Product;
import org.storezilla.store.dao.OpenStoreDao;
import org.storezilla.store.service.OpenStoreService;
/**
 *
 * @author LPT466
 */

@Service("productService")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;
    
    @Autowired
    private OpenStoreDao storeDao;
    
    @Autowired
    private ManufacturerDao manufacturerDao; 
    
    @Autowired
    private CategoryDao categoryDao;
    
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
