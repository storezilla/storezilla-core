
/* global storezillaadminapp */

storezillaadminapp.controller('SZAProductListController',function($scope,ProductService){
    ProductService.getAllProducts().success(function(response){
       ProductService.listProducts = response;
       $scope.products = response;
    });
});

storezillaadminapp.controller('SZAProductAddController',function($scope,$location,ProductService){
    $scope.SaveProduct = function() {
        ProductService.addProduct($scope.product).success(function(response) {
            $location.path('/listproducts');
        });
    };
});

storezillaadminapp.controller('SZAProductEditController',function($scope,$routeParams,ProductService,$location){
    $scope.product = ProductService.listProducts[$routeParams.id];
    $scope.SaveProduct = function() {
        ProductService.updateProduct($scope.product).success(function(response){
            $location.path('/listproducts');
        });
    };
});

storezillaadminapp.controller('SZAProductDeleteController',function($scope,$routeParams,ProductService,$location){
    $scope.product = ProductService.listProducts[$routeParams.id];
    ProductService.removeProduct($routeParams.id).success(function(response){
        $location.path('/listproducts');
    });
});
