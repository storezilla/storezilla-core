/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.storezilla.manufacturer.model.Manufacturer;

/**
 *
 * @author Mitesh Manani
 */
@Repository("manufacturerDao")
public class ManufacturerImpl implements ManufacturerDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(manufacturer);
    }

    @Override
    public void removeManufacturer(int manufacturerId) {
        Session session = sessionFactory.getCurrentSession();
        Manufacturer manufacturer = (Manufacturer)session.load(Manufacturer.class,new Integer(manufacturerId));
        if(manufacturer!=null) {
            session.delete(manufacturer);
        }
    }

    @Override
    public List<Manufacturer> listManufacturers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Manufacturer> listManufacturers = session.createQuery("From Manufacturer").list();
        return listManufacturers;
    }

    @Override
    public Manufacturer getManufacturerById(int manufacturerId) {
        Session session = this.sessionFactory.getCurrentSession();
        Manufacturer manufacturer = (Manufacturer)session.load(Manufacturer.class,new Integer(manufacturerId));
        return manufacturer;
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(manufacturer);
    }
}
