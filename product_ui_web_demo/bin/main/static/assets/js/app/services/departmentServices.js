/**
 * 
 */


productApp.service("departmentService",['$http',function($http){
	
	this.getAllDepartments = function() { 
		return new Promise(function(resolve,reject){
			
			$http.get('http://localhost:9010/api/v1/department').then(
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