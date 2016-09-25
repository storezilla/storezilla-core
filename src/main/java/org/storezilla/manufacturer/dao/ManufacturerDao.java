/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import org.storezilla.manufacturer.model.Manufacturer;

/**
 *
 * @author Mitesh Manani
 */
@Component
public interface ManufacturerDao {
    public void addManufacturer(Manufacturer manufacturer);
    public void removeManufacturer(int manufacturerId);
    public List<Manufacturer> listManufacturers();
    public Manufacturer getManufacturerById(int id);
    public void updateManufacturer(Manufacturer manufacturer);
}
