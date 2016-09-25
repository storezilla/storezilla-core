/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.dao;

import java.util.ArrayList;
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
import org.storezilla.category.model.Category;
import org.storezilla.store.model.OpenStore;

/**
 *
 * @author Mitesh Manani
 */
@Repository("categoryDao")
public class CategoryImpl implements CategoryDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCategory(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(category);
    }

    @Override
    public void removeCategory(int categoryId) {
        Session session = sessionFactory.getCurrentSession();
        Category category = (Category)session.load(Category.class,new Integer(categoryId));
        if(category!=null) {
            session.delete(category);
        }
        
    }

    @Override
    public List<Category> listCategories() {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Category.class).setProjection(Projections.projectionList()
        .add(Projections.property("categoryId"),"categoryId")
        .add(Projections.property("categoryName"),"categoryName")
        .add(Projections.property("sortOrder"), "sortOrder")
        ).setResultTransformer(Transformers.aliasToBean(Category.class));
        List<Category> listCategories = criteria.list();
        return listCategories;
    }

    @Override
    public Category getCategoryById(int categoryId) {
        Session session = this.sessionFactory.getCurrentSession();
        Category category = (Category)session.load(Category.class,new Integer(categoryId));
        return category;
    }

    @Override
    public void updateCategory(Category category) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(category);
    }
}
