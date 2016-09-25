
/* global storezillaadminapp */

storezillaadminapp.controller('SZACategoryListController',function($scope,$location,CategoryService){
    CategoryService.getAllCategories().success(function(response){
       CategoryService.listCategories = response;
       $scope.categories = response;
    });

    $scope.editCategory = function(categoryId) {
      $location.path("/editcategory/"+categoryId);
    };
});

storezillaadminapp.controller('SZACategoryAddController',function($scope,$location,CategoryService){
    $scope.SaveCategory = function() {
        CategoryService.addCategory($scope.category).success(function(response) {
            $location.path('/listcategories');
        });
    };
});

storezillaadminapp.controller('SZACategoryEditController',function($scope,$routeParams,CategoryService,$location){
    CategoryService.getCategoryById($routeParams.id).success(function(response) {
         $scope.category = response; 
      });  
      
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
