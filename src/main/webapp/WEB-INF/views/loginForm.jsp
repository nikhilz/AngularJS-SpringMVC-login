<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<script src="<c:url value='/static/js/loginApp.js' />"></script>

 <title>AngularJS $http Example</title>  
   
</head>





<body  ng-app="loginApp" >
<div ng-controller="loginCtrl">
<form ng-submit="submit()" id="login">
 UserName: <input type="text"  id="username" ng-model="username"><br>
 Password: <input type="password"  id="password" ng-model="password"><br>
<button type="submit" ng-click="submit()">Login</button>
</form> 
</div>
<div>

</div>





</body>
</html>