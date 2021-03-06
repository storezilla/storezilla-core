/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.storezilla.category.controller;

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
import org.storezilla.category.model.Category;
import org.storezilla.category.service.CategoryService;

/**
 *
 * @author Mitesh Manani
 */
@Controller
@RequestMapping(value="/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON})
    public @ResponseBody List<Category> listCategories() {
        return categoryService.listCategories();
    }

    @RequestMapping(value="/edit/{categoryId}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)    
    public @ResponseBody Category getCategoryById(@PathVariable int categoryId) {
        return categoryService.getCategoryById(categoryId);
    }
    
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void addCategory(@RequestBody Category category) {
            this.categoryService.addCategory(category);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = {MediaType.APPLICATION_JSON},consumes = {MediaType.APPLICATION_JSON})
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void updateCategory(@RequestBody Category category)  {
        this.categoryService.updateCategory(category);
    }
   
    @RequestMapping(value = "/remove/{categoryId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void removeCategory(@PathVariable int categoryId) {
        this.categoryService.removeCategory(categoryId);
    }
    
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String getCategoryList() {
        return "category/listcategories";
    }

    @RequestMapping(value="/getallcategories")
    public String getListCategoriesPage() {
        return "category/listcategories";
    }
    
    @RequestMapping(value="/geteditcategory")
    public String getEditCategoryPage() {
        return "category/category";
    }
}
