myApp.controller("BlogController",function($rootScope,$scope,$location,$http)
		{
	$scope.blog={'blogId':0,'blogName':'','blogContent':'','createDate':'','likes':'','loginName':'','status':''}
	$scope.blogdata;
	$scope.addBlog=function($scope)
	{
		console.log('Adding Blog information');
		$http.post('http://localhost:8086/MaketextMiddleware/addBlog',$scope.blog)
		.then(function(response)
				{
			$location.path("/blog");
				});
		
	};
	$scope.listblog=function($scope)
{
		console.log('Listing Blog information');
		$http.post('http://localhost:8086/MaketextMiddleware/showAllApprovedBlogs')
		.then(function(response)
				{
			$scope.blogdata=response.data;
				});
		}	
	$scope.listBlog();
		});