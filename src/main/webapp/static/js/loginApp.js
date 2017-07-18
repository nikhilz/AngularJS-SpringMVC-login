'use strict';

var app = angular.module("loginApp", []);

app.controller('loginCtrl', ['$scope','$http', function($scope,$http) {
	
	

   
	$scope.submit=  function() {
	     $scope.data = {						//JSON
	            "username" : $scope.username,
	            "password": $scope.password
	        };

		
	var successCallBack = function(response){
		alert("success")
    window.location.replace("Spring4MVCAngularJSExample/UserManagement");

    };
    
    var errorCallBack = function(response){
		document.write("error")
    };
	
    $http.post('http://localhost:8080/Spring4MVCAngularJSExample/login', $scope.data).then(successCallBack, errorCallBack);
	

	}
	}]);
