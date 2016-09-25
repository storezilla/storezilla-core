/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.taxclass.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
 *
 * @author LPT466
 */
@Entity
public class TaxClass {
    
    @Id
    @Column(name = "taxclassid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taxClassId; 
    
    @Column(name = "taxclass")
    private String taxClass;

    /**
     * @return the taxClassId
     */
    public int getTaxClassId() {
        return taxClassId;
    }

    /**
     * @param taxClassId the taxClassId to set
     */
    public void setTaxClassId(int taxClassId) {
        this.taxClassId = taxClassId;
    }
}
