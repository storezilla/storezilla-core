/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LPT466
 */
@Entity
public class Manufacturer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long manufacturerId;
    
    @Column(name="manufacturer_name")
    private String manufacturerName;

    /**
     * @return the manufacturerId
     */
    public Long getManufacturerId() {
        return manufacturerId;
    }

    /**
     * @param manufacturerId the manufacturerId to set
     */
    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    /**
     * @return the manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * @param manufacturerName the manufacturerName to set
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
