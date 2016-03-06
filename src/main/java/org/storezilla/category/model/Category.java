/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Proxy;
import org.storezilla.store.model.OpenStore;


/**
 *
 * @author miteshmanani
 */

@Entity(name = "category")
@Proxy(lazy = false)
public class Category {
    
    @Id
    @Column(name = "categoryid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    
    @Column(name = "sortorder")
    private int sortOrder;
    
    @Column(name = "category_name")
    private String categoryName;
    
    @Column(name="category_description")
    private String categoryDescription;
    
    @OneToMany
    @JoinTable(name = "category_store_mapping",joinColumns = @JoinColumn(name="categoryid"),
            inverseJoinColumns = @JoinColumn(name="storeid"))
    @JsonIgnore
    private Collection<OpenStore> storelist = new ArrayList<OpenStore>();
    
    @Column(name = "meta_title")
    private String metaTitle;
    
    @Column(name = "meta_description")
    private String metaDescription;
    
    @Column(name = "meta_keywords")
    private String metaKeywords;

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder the sortOrder to set
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * @return the categoryDescription
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * @param categoryDescription the categoryDescription to set
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    /**
     * @return the storelist
     */
    public Collection<OpenStore> getStorelist() {
        return storelist;
    }

    /**
     * @param storelist the storelist to set
     */
    public void setStorelist(Collection<OpenStore> storelist) {
        this.storelist = storelist;
    }

    /**
     * @return the metaTitle
     */
    public String getMetaTitle() {
        return metaTitle;
    }

    /**
     * @param metaTitle the metaTitle to set
     */
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    /**
     * @return the metaDescription
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * @param metaDescription the metaDescription to set
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * @return the metaKeywords
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * @param metaKeywords the metaKeywords to set
     */
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

}
