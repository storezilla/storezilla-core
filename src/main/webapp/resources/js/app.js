/* global angular, _contextPath */

var storezillaadminapp = angular.module('storezilla-admin',['ngRoute']);

storezillaadminapp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.when("/liststores",{
            templateUrl:_contextPath+"/stores/getallstores",
            controller : "SZAStoreListController"
        });
        $routeProvider.when("/editstore/:id",{
            templateUrl:_contextPath+"/stores/geteditstore",
            controller : "SZAStoreEditController"
        });
        $routeProvider.when("/removestore/:id",{
            templateUrl:_contextPath+"/stores/getallstores",
            controller : "SZAStoreDeleteController"
        });
        $routeProvider.when("/addstore",{
            templateUrl:_contextPath+"/stores/geteditstore",
            controller : "SZAStoreAddController"
        });
        $routeProvider.when("/updatestore",{
            templateUrl:_contextPath+"/stores/geteditstore",
            controller : "SZAStoreUpdateController"
        });
   }]);   