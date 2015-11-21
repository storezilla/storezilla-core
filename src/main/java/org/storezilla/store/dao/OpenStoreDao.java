/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.store.dao;

import java.util.List;
import org.storezilla.store.model.OpenStore;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mitesh Manani
 */
@Component
public interface OpenStoreDao {
    public void addOpenStore(OpenStore store);
    public void removeOpenStore(int storeId);
    public List<OpenStore> listOpenStores();
    public OpenStore getStoreById(int id);
    public void updateOpenStore(OpenStore store);
}
