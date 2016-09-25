/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.product.controller;

import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.storezilla.category.service.CategoryService;
import org.storezilla.manufacturer.service.ManufacturerService;
import org.storezilla.product.model.Product;
import org.storezilla.product.service.ProductService;
import org.storezilla.store.service.OpenStoreService;

/**
 *
 * @author LPT466
 */
@Controller
@RequestMapping(value="/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON})
    public @ResponseBody List<Product> listProducts() {
        return productService.listProducts();
    }
    
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void addProduct(@RequestBody Product product) {
            this.productService.addProduct(product);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.PUT,produces = {MediaType.APPLICATION_JSON},consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void editProduct(@RequestBody Product product)  {
        this.productService.updateProduct(product);
    }
   
    @RequestMapping(value = "/remove/{productId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void removeProduct(@PathVariable int productId) {
        this.productService.removeProduct(productId);
    }
    
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String getProductList() {
        return "product/listproducts";
    }

    @RequestMapping(value="/getallproducts")
    public String getListProductsPage() {
        return "product/listproducts";
    }
    
    @RequestMapping(value="/geteditproduct")
    public String getEditProductPage() {
        return "product/product";
    }
}
