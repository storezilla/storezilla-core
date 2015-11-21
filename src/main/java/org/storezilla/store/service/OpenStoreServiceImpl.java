/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.store.service;

import java.util.List;
import org.storezilla.store.dao.OpenStoreDao;
import org.storezilla.store.model.OpenStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mitesh Manani
 */
@Service
public class OpenStoreServiceImpl implements OpenStoreService {
    
    private OpenStoreDao storeDao;

    public void setStoreDao(OpenStoreDao storeDao) {
        this.storeDao = storeDao;
    }    

    @Override
    @Transactional
    public void addOpenStore(OpenStore store) {
        this.storeDao.addOpenStore(store);
    }

    @Override
    @Transactional
    public void removeOpenStore(int storeId) {
        this.storeDao.removeOpenStore(storeId);
    }

    @Override
    @Transactional
    public List<OpenStore> listOpenStores() {
       return this.storeDao.listOpenStores();
    }

    @Override
    @Transactional
    public OpenStore getStoreById(int storeId) {
        return this.storeDao.getStoreById(storeId);
    }

    @Override
    @Transactional  
    public void updateOpenStore(OpenStore store) {
        this.storeDao.updateOpenStore(store);
    }
}
