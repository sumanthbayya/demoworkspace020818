/**
 * 
 */


productApp.service("departmentService",['$http',function($http){
	
	this.getAllDepartments = function() { 
		return new Promise(function(resolve,reject){
			
			$http.get('https://inmardemo.cfapps.io/api/v1/department').then(
				function(response){
					resolve(response.data);
					
				},
				function(error){
					console.log("No data found / Connection error");
					reject([]);
				});
		});
		}
	
	//save departments
		this.postDepartments = function(data){
			
			return new Promise(function(resolve,reject){
				
				$http.post('https://inmardemo.cfapps.io/api/v1/department/addDepartments',data).then(
					function(response){
						resolve(response.data);
					},
					function(error){
						console.log("Unable to insert data / Connection error");
						reject([]);
					});
				
			});
			
		}
		
		
		//update departments
			this.updateDepartments = function(data){
				
				return new Promise(function(resolve,reject){
					
					$http.post('https://inmardemo.cfapps.io/api/v1/department/updateDepartments',data).then(
						function(response){
							resolve(response.data);
						},
						function(error){
							console.log("Unable to insert data / Connection error");
							reject([]);
						});
					
				});
				
			}
			
			
			//delete departments
					this.deleteDepartments = function(id){
						
						return new Promise(function(resolve,reject){
							
							$http.delete('https://inmardemo.cfapps.io/api/v1/location/'+id+'/department/'+id+'/category').then(
								function(response){
									resolve(response.data);
								},
								function(error){
									console.log("Unable to insert data / Connection error");
									reject([]);
								});
							
						});
						
					}
		
}]);