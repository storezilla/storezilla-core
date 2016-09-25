/* global _contextPath */

storezillaadminapp.service('StoreService',function($http){
    
   var listStores = [];

    this.getAllStores = function() { 
        return $http.get(_contextPath+'/stores');
    };
    
    this.getStoreById = function(storeId) {
        return $http.get(_contextPath+'/stores/edit/'+storeId);
    };
    
    this.addStore = function(store) {
      return $http.post(_contextPath+'/stores/add',store);  
    };
    
    this.updateStore = function(store) {
      return $http.put(_contextPath+'/stores/update',store);  
    };

    this.removeStore = function(id) {
        return $http.delete(_contextPath+'/stores/remove/'+id);
    };
});