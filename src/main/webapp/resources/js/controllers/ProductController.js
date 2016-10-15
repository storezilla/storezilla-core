
/* global storezillaadminapp */

storezillaadminapp.controller('SZAProductListController',function($scope,$location,ProductService){
    ProductService.getAllProducts().success(function(response){
       ProductService.listProducts = response;
       $scope.products = response;
    });
    $scope.editProduct = function(productId) {
      $location.path("/editproduct/"+productId);
    };
    $scope.removeProduct = function(productId) {
      $location.path("/removeproduct/"+productId);
    };
    $scope.addProduct = function() {
        $location.path("/addproduct");
    };
});

storezillaadminapp.controller('SZAProductAddController',function($scope,$location,ProductService,ManufacturerService){
    $('.menu .item').tab();
    $('select.dropdown').dropdown();
    $('.ui.checkbox').checkbox();
    $('.ui.radio.checkbox').checkbox();
    $('.ui.dropdown').dropdown({allowAdditions: true});
    $('.ui.special.dropdown').dropdown({allowAdditions: false});
    ManufacturerService.getAllManufacturers().success(function(response){
        $scope.manufacturers =  response;
    });
    //alert($scope.manufacturers[0].manufacturerName.value);
            //ManufacturerService.getAllManufacturers();[{id:1,name:'Dell'},{id:2,name:'Sony'},{id:3,name:'Lenovo'}];
    $scope.product = {attributes:[]};
    $scope.addRow = function() {
        var attribute = {name : $scope.name , value:$scope.value};
        $scope.product.attributes.push(attribute);
    };
    
    $scope.selectManufacturer = function(manufacturer) {
       // $scope.selectedItem = manufacturer;
    };
    $scope.removeAttribute = function(index) {
        $scope.product.attributes.splice(index,1);
    };
    $scope.SaveProduct = function() {
        ProductService.addProduct($scope.product).success(function(response) {
            $location.path('/listproducts');
        });
    };
});

storezillaadminapp.controller('SZAProductEditController',function($scope,$routeParams,ProductService,ManufacturerService,$location){
    $('.menu .item').tab();
    $('select.dropdown').dropdown();
    $('.ui.checkbox').checkbox();
    $('.ui.radio.checkbox').checkbox();
    $('.ui.dropdown').dropdown({allowAdditions: true});
    $('.ui.special.dropdown').dropdown({allowAdditions: false});
    ManufacturerService.getAllManufacturers().success(function(response){
        $scope.manufacturers =  response;
    });
    $scope.selectManufacturer = function(manufacturer) {
        $scope.selectedItem = manufacturer;
    };
    ProductService.getProductById($routeParams.id).success(function(response) {
         $scope.product = response; 
    });  
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
