/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.autumn.store.service;

import java.util.List;
import org.autumn.store.model.OpenStore;

/**
 *
 * @author Mitesh Manani
 */
public interface OpenStoreService {
    public void addOpenStore(OpenStore store);
    public void removeOpenStore(int storeId);
    public List<OpenStore> listOpenStores();
    public OpenStore getStoreById(int id);
    public void updateOpenStore(OpenStore store);
}
