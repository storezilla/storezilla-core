package org.storezilla.store.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.storezilla.storedetails.model.StoreDetails;
import org.hibernate.annotations.Proxy;
import org.storezilla.category.model.Category;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mitesh Manani
 */
@Entity
@Table(name = "openstore")
@Proxy(lazy = false)
@XmlRootElement(name = "store")
public class OpenStore {

    @Id
    @Column(name = "storeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    private String storeName;
    private String storeURL;
    
    @Embedded
    private StoreDetails storeDetails;
    
    @OneToMany
    @JoinTable(name = "store_category_mapping",joinColumns = @JoinColumn(name = "storeid"),
                inverseJoinColumns = @JoinColumn(name = "categoryid"))
    private Collection<Category> category = new ArrayList<Category>();
    
    public StoreDetails getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(StoreDetails storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getStoreURL() {
        return storeURL;
    }

    public void setStoreURL(String storeURL) {
        this.storeURL = storeURL;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * @return the category
     */
    public Collection<Category> getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Collection<Category> category) {
        this.category = category;
    }
}
