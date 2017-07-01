/* global angular, _contextPath */

var storezillaadminapp = angular.module('storezilla-admin',['ngMaterial','ngRoute','textAngular']);

storezillaadminapp.config(['$routeProvider','$locationProvider',
    function($routeProvider,$locationProvider) {
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
        $routeProvider.when("/listcategories",{
            templateUrl:_contextPath+"/categories/getallcategories",
            controller : "SZACategoryListController"
        });
        $routeProvider.when("/editcategory/:id",{
            templateUrl:_contextPath+"/categories/geteditcategory",
            controller : "SZACategoryEditController"
        });
        $routeProvider.when("/removecategory/:id",{
            templateUrl:_contextPath+"/categories/getallcategories",
            controller : "SZACategoryDeleteController"
        });
        $routeProvider.when("/addcategory",{
            templateUrl:_contextPath+"/categories/geteditcategory",
            controller : "SZACategoryAddController"
        });
        $routeProvider.when("/updatecategory",{
            templateUrl:_contextPath+"/categories/geteditcategory",
            controller : "SZACategoryUpdateController"
        });
        $routeProvider.when("/listproducts",{
            templateUrl:_contextPath+"/products/getallproducts",
            controller : "SZAProductListController"
        });
        $routeProvider.when("/editproduct/:id",{
            templateUrl:_contextPath+"/products/geteditproduct",
            controller : "SZAProductEditController"
        });
        $routeProvider.when("/removeproduct/:id",{
            templateUrl:_contextPath+"/products/getallproducts",
            controller : "SZAProductDeleteController"
        });
        $routeProvider.when("/addproduct",{
            templateUrl:_contextPath+"/products/geteditproduct",
            controller : "SZAProductAddController"
        });
        $routeProvider.when("/updateproduct",{
            templateUrl:_contextPath+"/products/geteditproduct",
            controller : "SZAProductUpdateController"
        });
        //$locationProvider.html5Mode({enabled : true});
   }]);
   
    storezillaadminapp.config(['$provide', function($provide){
      // this demonstrates how to register a new tool and add it to the default toolbar
      $provide.decorator('taOptions', ['$delegate', function(taOptions){
          // $delegate is the taOptions we are decorating
          // here we override the default toolbars and classes specified in taOptions.
          taOptions.forceTextAngularSanitize = true; // set false to allow the textAngular-sanitize provider to be replaced
          taOptions.keyMappings = []; // allow customizable keyMappings for specialized key boards or languages
          taOptions.toolbar = [
              ['h1', 'h2', 'h3', 'h4', 'h5', 'h6', 'p', 'pre', 'quote'],
              ['bold', 'italics', 'underline', 'ul', 'ol', 'redo', 'undo', 'clear'],
              ['justifyLeft','justifyCenter','justifyRight', 'justifyFull'],
              ['html', 'insertImage', 'insertLink', 'wordcount', 'charcount']
          ];
          taOptions.classes = {
              focussed: 'focussed',
              toolbar: 'ui secondary vertical icon borderless menu',//ui vertical icon borderless menu    
              toolbarGroup: 'ui items small basic icon buttons',
              toolbarButton: 'ui button',
              toolbarButtonActive: 'active',
              disabled: 'disabled',
              textEditor: 'form-control',
              htmlEditor: 'form-control'
/* Working              
              focussed: 'ui segment focussed',
              toolbar: 'ui basic attached segment',
              toolbarGroup: 'ui small basic icon buttons',
              toolbarButton: 'ui button',
              toolbarButtonActive: 'active',
              disabled: 'disabled',
              textEditor: 'form-control',
              htmlEditor: 'form-control'
*/              
          };
          return taOptions; // whatever you return will be the taOptions
      }]);
      // this demonstrates changing the classes of the icons for the tools for font-awesome v3.x
      $provide.decorator('taTools', ['$delegate', function(taTools){
          taTools.bold.iconclass = 'bold icon';
          taTools.italics.iconclass = 'italic icon';
          taTools.underline.iconclass = 'underline icon';
          taTools.ul.iconclass = 'unordered list icon';
          taTools.ol.iconclass = 'ordered list icon';
          taTools.undo.iconclass = 'undo icon';
          taTools.redo.iconclass = 'repeat icon';
          taTools.justifyLeft.iconclass = 'align left icon';
          taTools.justifyRight.iconclass = 'align right icon';
          taTools.justifyCenter.iconclass = 'align center icon';
          taTools.justifyFull.iconclass = 'align justify icon';
          taTools.clear.iconclass = 'ban icon';
          taTools.insertLink.iconclass = 'linkify icon';
          taTools.insertImage.iconclass = 'file image outline icon';
          taTools.quote.iconClass = "quote right icon";
          return taTools;
      }]);   
    }]);