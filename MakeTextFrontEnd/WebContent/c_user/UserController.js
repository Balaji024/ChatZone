myApp.controller("UserController",function($scope,$rootScope,$http,$location){
	$scope.User={loginName:'',password:'',userName:'',emailId:'',mobileNumber:'',address:'',role:''}
	
	$scope.register=function()
	{
		console.log('Entered into SignUp');
		$scope.User.role='ROLE-USER';
		$http.post('http://localhost:8082/MakeTextMiddleWare/registerUser',$scope.User)
		.then(function(response)
		{
			console.log('Registration Completed');
			console.log(response.statusText);
			$location.path("/login");
		});
	}
	
	$scope.login=function()
	{
		console.log('Entered into Login');
		
		$http.post('http://localhost:8082/MakeTextMiddleWare/checkLogin',$scope.User)
		.then(function(response)
		{
			$scope.User=response.data;
			$rootScope.currentUser=response.data;
			
			
			console.log(rootScope.currentUser);
			$location.path("/UserHome");
		});
	}
});
