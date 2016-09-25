/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.product.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Proxy;
import org.storezilla.category.model.Category;
import org.storezilla.manufacturer.model.Manufacturer;
import org.storezilla.stockstatus.model.StockStatus;
import org.storezilla.store.model.OpenStore;
import org.storezilla.taxclass.model.TaxClass;
/**
 *
 * @author miteshmanani
 */

@Entity(name = "product")
@Proxy(lazy = false)
public class Product {
    
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
    
    @Column(name = "product_name")
    private String productName;
    
    @Column(name="product_description")
    private String productDescription;

    @Column(name="meta_title") 
    private String metaTagTitle; 
    
    @Column(name="meta_keyword") 
    private String metaTagKeyWords; 
    
    @Column(name="product_tags") 
    private String productTags; 
    
    @Column(name="image_path") 
    private String imagePath;
    
    @Column(name="model") 
    private String model; 
    
    @Column(name="SKU")
    private String sku; 
    
    @Column(name="location")
    private String location;
    
    @Column(name="price")
    private float price; 
    
    @OneToOne
    private TaxClass taxClass; 
    
    @Column(name="quantity")
    private int quantity; 
    
    @Column(name="minquantity")
    private int minimumQuantity; 
    
    @Column(name="substract")
    private boolean subatractStock; 
    
    @OneToOne
    private StockStatus stockStatus; 
    
    @Column(name="requiredshipping")
    private boolean requiredShipping;
    
    @Column(name="date_available")
    private Date dateAvailable; 
   
    @Column(name="length")
    private float length;
    
    @Column(name="width")
    private float width; 
    
    @Column(name="height")
    private float height; 
    
    @Column(name="status")
    private boolean status;
    
    @Column(name="sortorder")
    private int sortOrder; 
    
    @OneToOne
    private Manufacturer manufacturer; 
    
    @OneToMany
    private Collection<Category> categories = new ArrayList<Category>();
    
    @OneToMany
    private Collection<OpenStore> stores = new ArrayList<OpenStore>();

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription the productDescription to set
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * @return the metaTagTitle
     */
    public String getMetaTagTitle() {
        return metaTagTitle;
    }

    /**
     * @param metaTagTitle the metaTagTitle to set
     */
    public void setMetaTagTitle(String metaTagTitle) {
        this.metaTagTitle = metaTagTitle;
    }

    /**
     * @return the metaTagKeyWords
     */
    public String getMetaTagKeyWords() {
        return metaTagKeyWords;
    }

    /**
     * @param metaTagKeyWords the metaTagKeyWords to set
     */
    public void setMetaTagKeyWords(String metaTagKeyWords) {
        this.metaTagKeyWords = metaTagKeyWords;
    }

    /**
     * @return the productTags
     */
    public String getProductTags() {
        return productTags;
    }

    /**
     * @param productTags the productTags to set
     */
    public void setProductTags(String productTags) {
        this.productTags = productTags;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the taxClass
     */
    public TaxClass getTaxClass() {
        return taxClass;
    }

    /**
     * @param taxClass the taxClass to set
     */
    public void setTaxClass(TaxClass taxClass) {
        this.taxClass = taxClass;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the minimumQuantity
     */
    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * @param minimumQuantity the minimumQuantity to set
     */
    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    /**
     * @return the subatractStock
     */
    public boolean isSubatractStock() {
        return subatractStock;
    }

    /**
     * @param subatractStock the subatractStock to set
     */
    public void setSubatractStock(boolean subatractStock) {
        this.subatractStock = subatractStock;
    }

    /**
     * @return the stockStatus
     */
    public StockStatus getStockStatus() {
        return stockStatus;
    }

    /**
     * @param stockStatus the stockStatus to set
     */
    public void setStockStatus(StockStatus stockStatus) {
        this.stockStatus = stockStatus;
    }

    /**
     * @return the requiredShipping
     */
    public boolean isRequiredShipping() {
        return requiredShipping;
    }

    /**
     * @param requiredShipping the requiredShipping to set
     */
    public void setRequiredShipping(boolean requiredShipping) {
        this.requiredShipping = requiredShipping;
    }

    /**
     * @return the dateAvailable
     */
    public Date getDateAvailable() {
        return dateAvailable;
    }

    /**
     * @param dateAvailable the dateAvailable to set
     */
    public void setDateAvailable(Date dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
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
     * @return the manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the categories
     */
    public Collection<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Collection<Category> categories) {
        this.categories = categories;
    }

    /**
     * @return the stores
     */
    public Collection<OpenStore> getStores() {
        return stores;
    }

    /**
     * @param stores the stores to set
     */
    public void setStores(Collection<OpenStore> stores) {
        this.stores = stores;
    }
}
