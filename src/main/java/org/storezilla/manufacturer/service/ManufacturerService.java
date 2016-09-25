/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.service;

import java.util.List;
import org.storezilla.manufacturer.model.Manufacturer;

/**
 *
 * @author Mitesh Manani
 */
public interface ManufacturerService {
    public void addManufacturer(Manufacturer manufacturer);
    public void removeManufacturer(int manufacturerId);
    public List<Manufacturer> listManufacturers();
    public Manufacturer getManufacturerById(int manufacturerId);
    public void updateManufacturer(Manufacturer manufacturer);
}
