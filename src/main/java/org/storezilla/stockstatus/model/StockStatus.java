/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.stockstatus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Proxy;

/**
 *
 * @author Mitesh Manani 
 */
@Entity
@Proxy(lazy = false)
public class StockStatus {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="statusid")
    private int stockStatusId; 
    
    @Column(name="stock_status")
    private String stockStatus; 

    /**
     * @return the stockStatusId
     */
    public int getStockStatusId() {
        return stockStatusId;
    }

    /**
     * @param stockStatusId the stockStatusId to set
     */
    public void setStockStatusId(int stockStatusId) {
        this.stockStatusId = stockStatusId;
    }

    /**
     * @return the stockStatus
     */
    public String getStockStatus() {
        return stockStatus;
    }

    /**
     * @param stockStatus the stockStatus to set
     */
    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }
}
