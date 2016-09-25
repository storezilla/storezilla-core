/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.manufacturer.controller;

import java.util.List;
import javax.ws.rs.core.MediaType;
import org.storezilla.manufacturer.model.Manufacturer;
import org.storezilla.manufacturer.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Mitesh Manani (miteshmanani@gmail.com)
 */
@Controller
@RequestMapping(value="/manufacturers")
public class ManufacturerController {
    
    @Autowired
    private ManufacturerService manufacturerService;
    
    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON})
    public @ResponseBody List<Manufacturer> listManufacturers() {
        return manufacturerService.listManufacturers();
    }
    
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void addManufacturer(@RequestBody Manufacturer manufacturer) {
            this.manufacturerService.addManufacturer(manufacturer);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.PUT,produces = {MediaType.APPLICATION_JSON},consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void editManufacturer(@RequestBody Manufacturer manufacturer)  {
        this.manufacturerService.updateManufacturer(manufacturer);
    }
   
    @RequestMapping(value = "/remove/{manufacturerId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void removeManufacturer(@PathVariable int manufacturerId) {
        this.manufacturerService.removeManufacturer(manufacturerId);
    }
}