/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.storezilla.manufacturer.dao.ManufacturerDao;
import org.storezilla.manufacturer.model.Manufacturer;

/**
 *
 * @author LPT466
 */
@Service("manufacturerService")
public class ManufacturerServiceImpl implements ManufacturerService {
    
    @Autowired
    private ManufacturerDao manufacturerDao;
    

    @Override
    @Transactional
    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerDao.addManufacturer(manufacturer);
    }

    @Override
    @Transactional
    public void removeManufacturer(int manufacturerId) {
        manufacturerDao.removeManufacturer(manufacturerId);
    }

    @Override
    @Transactional
    public List<Manufacturer> listManufacturers() {
        return manufacturerDao.listManufacturers();
    }

    @Override
    @Transactional
    public Manufacturer getManufacturerById(int manufacturerId) {
        return manufacturerDao.getManufacturerById(manufacturerId);
    }

    @Override
    @Transactional
    public void updateManufacturer(Manufacturer manufacturer) {
        manufacturerDao.updateManufacturer(manufacturer);
    }
}
