/* global _contextPath */

storezillaadminapp.service('ManufacturerService',function($http){
    
   var listManufacturers = [];

    this.getAllManufacturers = function() { 
        return $http.get(_contextPath+'/manufacturers');
    };
    
    this.addManufacturer = function(store) {
      return $http.post(_contextPath+'/manufacturers/add',store);  
    };
    
    this.updateManufacturer = function(store) {
      return $http.put(_contextPath+'/manufacturers/edit',store);  
    };

    this.removeManufacturer = function(id) {
        return $http.delete(_contextPath+'/manufacturers/remove/'+id);
    };
});