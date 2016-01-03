
/* global storezillaadminapp */

storezillaadminapp.controller('SZAStoreListController',function($scope,StoreService){
    StoreService.getAllStores().success(function(response){
       StoreService.listStores = response;
       $scope.listStores = response;
    });
});

storezillaadminapp.controller('SZAStoreAddController',function($scope,$location,StoreService){
    $scope.SaveStore = function() {
        StoreService.addStore($scope.store).success(function(response) {
            $location.path('/liststores');
        });
    };
});

storezillaadminapp.controller('SZAStoreEditController',function($scope,$routeParams,StoreService,$location){
    $scope.store = StoreService.listStores[$routeParams.id];
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
