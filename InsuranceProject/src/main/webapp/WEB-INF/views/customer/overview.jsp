<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account Overview</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" href="main.css">  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body style = "background-image: url(https://cdn.pixabay.com/photo/2017/06/27/11/48/team-spirit-2447163_960_720.jpg);">

<div class="jumbotron text-left banner frosted " >
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0" class="logo img-circle col-md-4 " alt="hands holding a family">
  <h1>Assure Insurance </h1>
  <p>You're In Good Hands with Assure Insurance</p> 
</div>
    <div class="container frosted" >
        <div class="row">
<!--  col #2   -->
            <div class="col-sm-12 col-md-4  col-lg-6 text-center align-middle">  
				 <sf:form action= "overview" modelAttribute = "customer" >
   					<table>
                        <tr><th>Policy Number:</th> <td><sf:input path="policyNum" readonly = "true"/></td></tr>
                        <tr><th>Name:</th> <td><sf:input path="firstName" readonly = "true"/></td><td><sf:input path="firstName" readonly = "true"/></td></tr>
                        <tr><th>UserName:</th> <td><sf:input path="username" readonly = "true"/></td></tr>
   						<tr><th>Email:</th> <td><sf:input path="email" readonly = "true"/></td></tr>
   						<tr><th>Status:</th> <td><sf:input path="status" readonly = "true"/></td></tr>
   						<br><br>
   					</table>
    			</sf:form>
    		</div> <!-- out col #2 -->
    	
        
 <!--  col #1   -->       
            <div class="col-sm-12 col-md-4  col-lg-6">
               <form action = "makeclaim">
                   <button type="Submit"  class="btn btn-danger btn-block"> <h2>Make A Claim</h2></button>
                </form><br><br>
                 <form action = "checkClaim">
                   <button type="Submit"  class="btn btn-warning btn-block"> <h2>Check Claim Status</h2></button>
                </form><br><br>
                <form action = "myClaims">
                   <button type="Submit"  class="btn btn-info btn-block"> <h2>View MyClaims</h2></button>
                </form>
           </div><!-- out col #1 -->
    </div> <!-- out row -->
 </div> <!-- out container -->
    


</body>
</html>