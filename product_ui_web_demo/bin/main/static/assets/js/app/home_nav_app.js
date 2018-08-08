var productApp = angular.module('productApp', [ 'ngRoute', 'smart-table','ui.bootstrap', 'ngSanitize','ngAnimate' ]);



productApp.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'views/background_gif.html',
		controller : 'homeController'
	})
	.when('/location', {
		templateUrl : 'views/masters/location.html',
		controller : 'locationController'
	})
	.when('/department', {
		templateUrl : 'views/masters/department.html',
		controller : 'departmentController'
	})
	.when('/category', {
		templateUrl : 'views/masters/category.html',
		controller : 'categoryController'
	})
	.when('/subCategory', {
		templateUrl : 'views/masters/subCategory.html',
		controller : 'subCategoryController'
	})
	.when('/ux', {
		templateUrl : 'views/ux.html',
		controller : 'uxController'
	})
	.when('/ship', {
		templateUrl : 'views/ship.html',
		controller : 'shipController'
	})
	.when('/run', {
		templateUrl : 'views/run.html',
		controller : 'runController'
	});

});

productApp.controller("homeController",[
						"$scope",
						
						function($scope) {
							
							
							
							
							
							
						} ]);




