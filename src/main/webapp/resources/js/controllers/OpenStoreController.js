
/* global storezillaadminapp */

storezillaadminapp.controller('SZAStoreListController',function($scope,StoreService,$location){
    StoreService.getAllStores().success(function(response){
       StoreService.listStores = response;
       $scope.listStores = response;
    });

    $scope.editStore = function(storeId) {
      $location.path("/editstore/"+storeId);
    };
    $scope.removeStore = function(storeId) {
      $location.path("/removestore/"+storeId);  
    };
    $scope.addStore = function() {
       $location.path("/addstore");
    };
});

storezillaadminapp.controller('SZAStoreAddController',function($scope,$location,StoreService){
    $('.menu .item').tab();
    $scope.SaveStore = function() {
        StoreService.addStore($scope.store).success(function(response) {
            $location.path('/liststores');
        });
    };
});

storezillaadminapp.controller('SZAStoreEditController',function($scope,$routeParams,StoreService,$location){
    $('.menu .item').tab();
    StoreService.getStoreById($routeParams.id).success(function(response) {
         $scope.store = response; 
      });  

    $scope.SaveStore = function() {
        StoreService.updateStore($scope.store).success(function(response){
            $location.path('/liststores');
        });
    };
});

storezillaadminapp.controller('SZAStoreDeleteController',function($scope,$routeParams,StoreService,$location){
    $scope.store = StoreService.listStores[$routeParams.id];
    StoreService.removeStore($routeParams.id).success(function(response){
        $location.path('/liststores');
    });
});
