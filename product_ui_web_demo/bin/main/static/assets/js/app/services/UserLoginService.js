/**
 * @author manikanta.nsk
 */

productApp.service("userLoginService",['$http',function($http){
	
	this.getAllUsers = function() { 
		return new Promise(function(resolve,reject){
			
			$http.get('https://inmardemo.cfapps.io/api/v1/users').then(
				function(response){
					resolve(response.data);
					
				},
				function(error){
					console.log("No data found / Connection error");
					reject([]);
				});
		});
		}
	
	
	//signup
	
	this.signUpUser = function(data) { 
		return new Promise(function(resolve,reject){
			
			$http.post('https://inmardemo.cfapps.io/api/v1/users/signup',data).then(
				function(response){
					resolve(response.data);
					
				},
				function(error){
					console.log("No data found / Connection error");
					reject([]);
				});
		});
		}
	
	this.signInUser = function(data) { 
		return new Promise(function(resolve,reject){
			
			$http.post('https://inmardemo.cfapps.io/api/v1/users/signin',data).then(
				function(response){
					resolve(response.data);
					
				},
				function(error){
					console.log("No data found / Connection error");
					reject([]);
				});
		});
		}
}]);