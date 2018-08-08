/**
 * 
 */

productApp.controller("locationController",["$scope","locationService","$route","$timeout",function($scope,locationService,$route,$timeout) {
	
	$scope.init = function(){
		
		$scope.statusDropDown = ["Active","In-Active"];
		$scope.dataadd=false;
     	$scope.selectdt=false;
     	$scope.selected =[];
		$scope.collapseFlag = true;
		
		
		locationService.getAllLocations().then(
	  			function(data){
						 $scope.collection=data;
				    	  $scope.locationData = [].concat($scope.collection);
				    	  $scope.rowCollection= data;
				    	  $scope.$digest();
	  			},
	  			function()
					{
						alert('error no data found');
					}
	  			); 
		
	}
	
	
	$scope.processSave = function(collection){
		console.log(collection);
	}
	
	$scope.hideDatatable=function(){
		$scope.collapseFlag = false;
	}
	
	$scope.showDatatable=function(){
		$scope.collapseFlag = true;
	}
	
	// Function to get data for all selected items
    $scope.selectAll = function (collection) {
      // if there are no items in the 'selected' array, 
      // push all elements to 'selected'
 	   
      if ($scope.selected.length === 0) {
        angular.forEach(collection, function(val) {
         $scope.selected.push(val.id); 
          
        });
      // if there are items in the 'selected' array, 
      // add only those that ar not
      } else if ($scope.selected.length > 0 && $scope.selected.length != collection.length) {
        angular.forEach(collection, function(val) {
          var found = $scope.selected.indexOf(val.id);
          if(found == -1) $scope.selected.push(val.id);
          
        });
        
      // Otherwise, remove all items
      } else  {
        $scope.selected = [];
      }
     
    };
    // Function to get data by selecting a single row
    $scope.select = function(id) {
 	
      var found = $scope.selected.indexOf(id); 
      if(found == -1){
     	 $scope.selected.push(id);
      }
      else {
     	 $scope.selected.splice(found, 1);
     	 if($scope.selected.length == 0	){
     	 }
         	 
      }
      
    }
	$scope.addcollection=[];
    $scope.processAddRow = function(){
    	$scope.saveFlag= true;
     	$scope.locationData = [];   
     	$scope.dataadd=true;
     	$scope.selectdt=true;
     	$scope.selected =[];
     	
     	
     	$scope.addcollection.push({
     		'id':$scope.addcollection.length+1,
     		locationName : null,
     		locationDesc : null,
     		active :null,
     		isSelected:true
				
     });   
     	angular.forEach($scope.addcollection, function(val) {
     	     var found = $scope.selected.indexOf(val.id);
     	      if(found == -1) $scope.selected.push(val.id);
     	    });

     	$scope.locationData=$scope.addcollection;
     	$scope.rowCollection=$scope.addcollection;
       };
       
       
       $scope.processSave = function(collection){
    	   $scope.tempSaveArray = [];
    	   angular.forEach(collection,function(values){
    		  if(values.isSelected == true){
    			  
    			  $scope.tempSaveArray.push(values);
    			  
    			  
    		  }
    		  
    	   });
    	   
    	   console.log($scope.tempSaveArray);
    	   locationService.postLocations($scope.tempSaveArray).then(
		  			function(data){
		  				
		  			},
		  			function()
						{
						}
		  			); 
    	   
    	   $timeout(function () {
    		   $route.reload();
    	    }, 2000);
    	   
    	   
		};
		
		$scope.processUpdate = function(collection){
	    	   $scope.tempSaveArrayNew = [];
	    	   angular.forEach(collection,function(values){
	    		  if(values.isSelected == true){
	    			  
	    			  $scope.tempSaveArrayNew.push(values);
	    			  
	    			  
	    		  }
	    		  
	    	   });
	    	   
	    	   console.log($scope.tempSaveArrayNew);
	    	   locationService.updateLocations($scope.tempSaveArrayNew).then(
			  			function(data){
			  			},
			  			function()
							{
							}
			  			); 
	    	   
	    	   $timeout(function () {
	    		   $route.reload();
	    	    }, 2000);
			};
			
			
			$scope.processDelete = function(collection){
		    	   angular.forEach(collection,function(values){
		    		  if(values.isSelected == true){
		    			  
		    			  locationService.deleteLocation(values.id).then(
						  			function(data){
						  			},
						  			function()
										{
										}
						  			); 
		    			  
		    		  }
		    		  
		    	   });
		    	   
		    	   
		    	   
		    	   $timeout(function () {
		    		   $route.reload();
		    	    }, 2000);
				};
		
		$scope.refresh = function(){
			$route.reload();
			
		}
	
	
}]);


