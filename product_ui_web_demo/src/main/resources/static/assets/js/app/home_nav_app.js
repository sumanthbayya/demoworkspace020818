var productApp = angular.module('productApp', [ 'ngRoute', 'smart-table','ui.bootstrap', 'ngSanitize','ngAnimate','pdf' ]);



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
	.when('/reference', {
		templateUrl : 'views/pdfViewSample.html',
		controller : 'referenceController'
	})
	.when('/run', {
		templateUrl : 'views/run.html',
		controller : 'runController'
	});

});

productApp.controller("homeController",[
						"$scope","$rootScope","userLoginService","$timeout",
						
						function($scope,$rootScope,userLoginService,$timeout) {

									
							$scope.signUpFlag = false;
							$scope.username = "";
							$scope.password = "";
							$scope.signIn = function(){
								$scope.message=null;
								$scope.reqErrMsg = null;
								$scope.user=
									{
										id:'1',
									username : $scope.username,
									password : $scope.password,
									active : 'y'
									}
									
								;
								console.log($scope.user);
								userLoginService.signInUser($scope.user).then(
							  			function(data){
							  				$scope.successSignInFlag = data;
							  				console.log($scope.successSignInFlag);
							  				if($scope.successSignInFlag == true){
							  				
												$scope.message='Hi '+$scope.user.username + ', Welcome';
												$scope.$digest();
												$timeout(function () {
													$scope.message= null;
													angular.element('#loginScreen').modal('hide');
											    }, 2000);
							  				}
							  				else{
							  					$scope.reqErrMsg ='Username / password is incorrect';
							  					$scope.$digest();
							  				}
							  			},
							  			function()
											{
											}
							  			);
								
								
							}
							
							
							$scope.signUp = function(){
								$scope.message=null;
								$scope.reqErrMsg = null;
								$scope.user=
								{
									id:'1',
								username : $scope.username,
								password : $scope.password,
								active : 'y'
								}
								
							;
								userLoginService.signUpUser($scope.user).then(
							  			function(data){
							  				$scope.successSignupFlag = data;
							  				console.log($scope.successSignupFlag);
							  				if($scope.successSignupFlag == true){
							  					
												$scope.message='Hi '+$scope.user.username + '. Welcome, Signup successful';
												$scope.$digest();
												$timeout(function () {
													$scope.message= null;
													angular.element('#loginScreen').modal('hide');
											    }, 2000);
//							  					
							  				}
							  				else{
							  					
							  					$scope.reqErrMsg='Already Signed up ! Please Sign in !!';
							  					$scope.$digest();
							  				}
							  				
							  			},
							  			function()
											{
											}
							  			);
								
								console.log($scope.user);
							}
							
							if($rootScope.username == undefined){
							angular.element('#loginScreen').modal('show');
							}
							
							
							
							
							
							
							
							
						} ]);






