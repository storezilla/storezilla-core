/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.product.dao;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.storezilla.category.dao.CategoryDao;
import org.storezilla.category.model.Category;
import org.storezilla.product.model.Product;
import org.storezilla.store.model.OpenStore;

/**
 *
 * @author LPT466
 */
@Repository("productDao")
public class ProductImpl implements ProductDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(product);
    }

    @Override
    public void removeProduct(int productId) {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product)session.load(Product.class,new Integer(productId));
        if(product!=null) {
            session.delete(product);
        }
        
    }

    @Override
    public List<Product> listProducts() {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Product.class).setProjection(Projections.projectionList()
        .add(Projections.property("productName"),"productName")
        .add(Projections.property("model"), "model")
        .add(Projections.property("price"),"price")
        .add(Projections.property("quantity"),"quantity")
        .add(Projections.property("status"),"status")
        ).setResultTransformer(Transformers.aliasToBean(Product.class));
        List<Product> listProducts = criteria.list();
        return listProducts;
    }

    @Override
    public Product getProductById(int productId) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = (Product)session.load(Product.class,new Integer(productId));
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(product);
    }
}
