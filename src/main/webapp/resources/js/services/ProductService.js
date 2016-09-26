/* global _contextPath */

storezillaadminapp.service('ProductService',function($http){
    
   var listProducts = [];

    this.getAllProducts = function() { 
        return $http.get(_contextPath+'/products');
    };
    
    this.getProductById = function(productId) {
        return $http.get(_contextPath+'/products/edit/'+productId);
    };
    this.addProduct = function(product) {
      return $http.post(_contextPath+'/products/add',product);  
    };
    
    this.updateProduct = function(product) {
      return $http.put(_contextPath+'/products/update',product);  
    };

    this.removeProduct = function(id) {
        return $http.delete(_contextPath+'/products/remove/'+id);
    };
});