<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
    
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    
</head>
<body style = "background-image: url(https://cdn.pixabay.com/photo/2017/05/18/11/04/key-2323278_960_720.jpg);">
<div class = " frosted text-left">
    <div class="container">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0" class="logo img-circle col-md-4 " alt="hands holding a family">
        <div class="col-sm-12 col-md-4  col-lg-6">
   <h1 >Assure Insurance </h1>
  <p  class = "hidden-lg-down">You're In Good Hands with Assure Insurance</p>
        </div>
    </div>
</div>
    
 <div class="container frosted mainCenter" >
        <div class="row ">
     
			<!--   String email, String username, String password, 	 -->
   <sf:form class = "form-group col-sm-12 col-md-4  col-lg-6 col-md-offset-2" action= "regSuccess" modelAttribute = "customer" >
   		<label>First Name:</label> <sf:input path="firstName" /><br>
       <label>Last Name:</label> <sf:input path="lastName" /><br>
   		<label>Email:</label><sf:input path="email" /><br>
   		<label>Enter Password:</label><sf:input path="password"/><br>
       <label>Re-enter Password:</label><sf:input path=""/><br>
   	    <Button type=Submit class= "btn btn-success btn-lg" >Submit</Button>
        <Button type="reset" class= "btn btn-info btn-lg" >Clear</Button>
    </sf:form>
    
     </div>
    </div>
</body>
</html>