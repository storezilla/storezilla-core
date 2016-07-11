/* global _contextPath */

storezillaadminapp.service('StoreService',function($http){
    
   var listStores = [];

    this.getAllStores = function() { 
        return $http.get(_contextPath+'/stores');
    };
    
    this.addStore = function(store) {
      return $http.post(_contextPath+'/stores/add',store);  
    };
    
    this.updateStore = function(store) {
      return $http.put(_contextPath+'/stores/edit',store);  
    };

    this.removeStore = function(id) {
        return $http.delete(_contextPath+'/stores/remove/'+id);
    };
});