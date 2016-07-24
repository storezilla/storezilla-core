
/* global storezillaadminapp */

storezillaadminapp.controller('SZAProductListController',function($scope,ProductService){
    ProductService.getAllProducts().success(function(response){
       ProductService.listProducts = response;
       $scope.products = response;
    });
});

storezillaadminapp.controller('SZAProductAddController',function($scope,$location,ProductService){
    $('.menu .item').tab();
    $('select.dropdown').dropdown();
    $('.ui.checkbox').checkbox();
    $('.ui.radio.checkbox').checkbox();
    $('.ui.dropdown').dropdown({allowAdditions: true});
    $('.ui.special.dropdown').dropdown({allowAdditions: false});
    $scope.SaveProduct = function() {
        ProductService.addProduct($scope.product).success(function(response) {
            $location.path('/listproducts');
        });
    };
    $scope.attributes = [];
    $scope.addRow = function() {
        var attribute = {name : $scope.name , value:$scope.value};
      $scope.attributes.push(attribute);
    };
    $scope.removeAttribute = function(index) {
        $scope.attributes.splice(index,1);
    };
});

storezillaadminapp.controller('SZAProductEditController',function($scope,$routeParams,ProductService,$location){
    $('.menu .item').tab();
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
