/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.store.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.storezilla.store.model.OpenStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mitesh Manani
 */
@Repository("storeDao")
public class OpenStoreImpl implements OpenStoreDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addOpenStore(OpenStore store) {
        Session session =  this.sessionFactory.getCurrentSession();
        session.persist(store);
    }

    @Override
    public void removeOpenStore(int storeId) {
        Session session = this.sessionFactory.getCurrentSession();
        OpenStore store = (OpenStore) session.load(OpenStore.class,new Integer(storeId));
        if(store!=null) {
            session.delete(store);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OpenStore> listOpenStores() {
        Session session = this.sessionFactory.getCurrentSession();
        List<OpenStore> listOpenStores = session.createQuery("From OpenStore").list();
        for(OpenStore stores : listOpenStores) {
            System.out.println("Store List : "+listOpenStores);
        }
        return listOpenStores;
    }

    @Override
    public OpenStore getStoreById(int storeId) {
        Session session = this.sessionFactory.getCurrentSession();
        OpenStore store = (OpenStore)session.load(OpenStore.class,new Integer(storeId));
        return store;
    }

    @Override
    public void updateOpenStore(OpenStore store) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(store);
    }
}
