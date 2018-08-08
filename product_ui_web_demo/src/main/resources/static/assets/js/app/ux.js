productApp.controller("uxController",["$scope","$route",function($scope,$route) {
						
						$scope.init = function(){
							//Persist data from db and initialise during page load
							$scope.tableData = [{
								id: "1",
								type : "Executive",
								name : "Ann Brown",
								title :"CEO",
								phone:"1234567891",
								ext:"+91",
								fax:"+442427321",
								email:"annbrown@dummy.com"
							},
							{
								id: "2",
								type : "Inmar AR",
								name : "Mary Smith",
								title :"Vice President Sales",
								phone:"1234567891",
								ext:"+91",
								fax:"+442427321",
								email:"marysmith@dummy.com"
							},
							{
								id: "3",
								type : "Executive",
								name : "Jhon Doe",
								title :"CTO",
								phone:"1234567891",
								ext:"+91",
								fax:"+442427321",
								email:"jhondoe@dummy.com"
							},
							{
								id: "4",
								type : "Daily",
								name : "Nicholas Dan",
								title :"Product Manager",
								phone:"1234567891",
								ext:"+91",
								fax:"+442427321",
								email:"nicholas@dummy.com"
							},
							{
								id: "5",
								type : "Other",
								name : "Nick Jonas",
								title :"VP Marketing",
								phone:"1234567891",
								ext:"+91",
								fax:"+442427321",
								email:"nickjonas@dummy.com"
							}];
							$scope.contactData = $scope.tableData;	
							$scope.rowCollection=$scope.tableData;
							$scope.dataadd=false;
					     	$scope.selectdt=false;
					     	$scope.selected =[];
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
					       
						//addnewdata
					   	$scope.addcollection=[];
					       $scope.processAddRow = function(){
					        	$scope.contactData = [];   
					        	$scope.dataadd=true;
					        	$scope.selectdt=true;
					        	$scope.selected =[];
					        	$scope.addcollection.push({
					        		'id':$scope.addcollection.length+1,
									type : null,
									name : null,
									title :null,
									phone:null,
									ext:null,
									fax:null,
									email:null,
									isSelected:true
					        });   
					        	angular.forEach($scope.addcollection, function(val) {
					        	     var found = $scope.selected.indexOf(val.id);
					        	      if(found == -1) $scope.selected.push(val.id);
					        	    });

					        	$scope.contactData=$scope.addcollection;
					        	$scope.rowCollection=$scope.addcollection;
					          };
						
						//Saving Row data
//						$scope.processSave = function(collection){
//							$scope.contactData = [];   
//				        	$scope.dataadd=true;
//				        	$scope.selectdt=true;
//				        	$scope.selected =[];
//							angular.forEach(collection,function(values){
//								$scope.tableData.push({
//					        		'id':$scope.tableData.length+1,
//									type : values.type,
//									name : values.name,
//									title : values.title,
//									phone:values.phone,
//									ext:values.ext,
//									fax:values.fax,
//									email:values.email
//					        });
//							});
//							$scope.contactData.push($scope.tableData);
//							$scope.rowCollection.push($scope.tableData);
//						};	
						
						
						$scope.refresh = function(){
							$scope.init();
							$scope.addcollection = [];
						}
						
						$scope.hideDatatable=function(){
							$scope.collapseFlag = false;
						}
						
						$scope.showDatatable=function(){
							$scope.collapseFlag = true;
						}
							
						}]);
