/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.store.controller;

import java.util.ArrayList;
import org.storezilla.store.model.OpenStore;
import org.storezilla.store.service.OpenStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mitesh Manani (miteshmanani@gmail.com)
 */
@Controller
public class OpenStoreController {
    
    private OpenStoreService storeService;
    
    @Autowired(required = true)
    @Qualifier(value = "storeService")
    public void setOpenStoreService(OpenStoreService storeService) {
        this.storeService = storeService;
    }

    @RequestMapping(value = "/store/add",method = RequestMethod.POST)
    public String addOpenStore(@ModelAttribute("store") OpenStore store,Model model) {
        if(store.getStoreId()==0) {
            this.storeService.addOpenStore(store);
        } else {
            this.storeService.updateOpenStore(store);
        }
        model.addAttribute("listOpenStores",this.storeService.listOpenStores());
        return "includes/listStores";
    }
    
    @RequestMapping(value = "/listStores",method = RequestMethod.GET)
    public ModelAndView listOpenStores(@ModelAttribute("store") OpenStore store) {
        ModelAndView model = new ModelAndView("includes/listStores");
        model.addObject("listOpenStores",this.storeService.listOpenStores());
        if(store==null) 
            model.addObject("store",new OpenStore());
        else 
            model.addObject("store",store);
        return model;
    }
    
    @RequestMapping(value = "/stores",method = RequestMethod.GET)
    public ModelAndView getHomePage(@ModelAttribute("store") OpenStore store) {
        ModelAndView model = new ModelAndView("index");
        if(store==null) 
            model.addObject("store",new OpenStore());
        else 
            model.addObject("store",store);
        model.addObject("listOpenStores",this.storeService.listOpenStores());
        return model;
    }
    
    @RequestMapping(value = "/remove/{storeId}",method = RequestMethod.POST)
    public ModelAndView removeOpenStore(@PathVariable("storeId") int storeId,@ModelAttribute("store") OpenStore store) {
        ModelAndView model = new ModelAndView("includes/listStores");
        this.storeService.removeOpenStore(storeId);
        model.addObject("listOpenStores",this.storeService.listOpenStores());
        return model;
    }
    
    @RequestMapping(value = "/edit/{storeId}",method = RequestMethod.POST)
    public String editOpenStore(@PathVariable("storeId") int storeId,Model model) {
        model.addAttribute("store",this.storeService.getStoreById(storeId));
        return "includes/store";
    }

    @RequestMapping(value = "/store/create",method=RequestMethod.POST)
    public ModelAndView createStore() {
        ModelAndView mav = new ModelAndView("includes/store","store",new OpenStore());
        return mav;
    }
    @RequestMapping(value = "/cancelsave",method = RequestMethod.POST)
    public String cancelSaveStore(Model model) {
        model.addAttribute("listOpenStores",this.storeService.listOpenStores());
        model.addAttribute("store",new OpenStore());
        return "includes/listStores";
    }
}