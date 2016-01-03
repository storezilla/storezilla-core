/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.store.controller;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.storezilla.store.model.OpenStore;
import org.storezilla.store.service.OpenStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mitesh Manani (miteshmanani@gmail.com)
 */
@Controller
@RequestMapping(value="/stores")
public class OpenStoreController {
    
    @Autowired
    private OpenStoreService storeService;
    
    @Autowired(required = true)
    @Qualifier(value = "storeService")
    public void setOpenStoreService(OpenStoreService storeService) {
        this.storeService = storeService;
    }
    
    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON})
    public @ResponseBody List<OpenStore> listOpenStores() {
        return storeService.listOpenStores();
    }
    
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void addOpenStore(@RequestBody OpenStore store) {
            this.storeService.addOpenStore(store);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.PUT,produces = {MediaType.APPLICATION_JSON},consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void editOpenStore(@RequestBody OpenStore store)  {
        this.storeService.updateOpenStore(store);
    }
   
    @RequestMapping(value = "/remove/{storeId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void removeOpenStore(@PathVariable int storeId) {
        this.storeService.removeOpenStore(storeId);
    }
    
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String getStoreList() {
        System.out.println("Now serving the request");
        return "/store/listStores";
    }

    @RequestMapping(value="/getallstores")
    public String getListStoresPage() {
        return "store/listStores";
    }
    
    @RequestMapping(value="/geteditstore")
    public String getEditStorePage() {
        return "store/store";
    }
    
}