
/* global storezillaadminapp */

storezillaadminapp.controller('SZACategoryListController',function($scope,CategoryService){
    CategoryService.getAllCategories().success(function(response){
       CategoryService.listCategories = response;
       $scope.categories = response;
    });
});

storezillaadminapp.controller('SZACategoryAddController',function($scope,$location,CategoryService){
    $scope.SaveStore = function() {
        CategoryService.addCategory($scope.category).success(function(response) {
            $location.path('/listcategories');
        });
    };
});

storezillaadminapp.controller('SZACategoryEditController',function($scope,$routeParams,CategoryService,$location){
    $scope.category = CategoryService.listCategories[$routeParams.id];
    $scope.SaveCategory = function() {
        CategoryService.updateCategory($scope.category).success(function(response){
            $location.path('/listcategories');
        });
    };
});

storezillaadminapp.controller('SZACategoryDeleteController',function($scope,$routeParams,CategoryService,$location){
    $scope.category = CategoryService.listCategories[$routeParams.id];
    CategoryService.removeCategory($routeParams.id).success(function(response){
        $location.path('/listcategories');
    });
});
