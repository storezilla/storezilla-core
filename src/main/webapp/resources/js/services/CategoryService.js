/* global _contextPath */

storezillaadminapp.service('CategoryService',function($http){
    
   var listCategories = [];

    this.getAllCategories = function() { 
        return $http.get(_contextPath+'/categories');
    };
    
    this.addCategory = function(category) {
      return $http.post(_contextPath+'/categories/add',category);  
    };
    
    this.updateCategory = function(category) {
      return $http.put(_contextPath+'/categories/edit',category);  
    };

    this.removeCategory = function(id) {
        return $http.delete(_contextPath+'/categories/remove/'+id);
    };
});