<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>
<%@ taglib prefix = "jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Make a Claim</title>
    
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <!-- to be erased once css connection is fixed -->  

<style type="text/css">
body{
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover
}
.frosted {
     background:rgba(255,255,255, 0.75);
    padding: 20;
}
</style>  
  
</head>



<body style = "background-image: url(https://cdn.pixabay.com/photo/2017/05/18/11/04/key-2323278_960_720.jpg);">
<div class = " frosted text-center">
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
        
<sf:form action= "updateClaim" modelAttribute ="claim" method = "post">
		<table class="col-sm-12 col-md-4  col-lg-6 align-items-center text-center">
            <tr><th>Policy Number:</th><td><sf:input path="policyNum" placeholder = "Policy Number"/></td></tr>
            <tr><th>Incident Date:</th><td><sf:input type= "date" path="claimDate"/></td></tr>
            <tr><th>Incident Description:</th><td><sf:input path="claimDescription"/></td></tr>
            <!-- ERIC ADD -->
            <sf:input type= "hidden" path = "id"/>
            	<sf:form modelAttribute ="report" method = "post" class="well">
            		<tr><th>Report Id:</th><td><sf:input path = "rid"/></td></tr>
            		<tr><th>Report Description: </th><td><sf:textarea path = "descr" rows="5" cols="30"/></td></tr>
            		<tr><th>Repair Cost:</th><td><sf:input path = "repairCost"/></td></tr>
          		</sf:form>
          		
          	<sf:select path="assessorId">
          		 <jstl:forEach items="${assessors}" var="assessor" >
          		 	<option value="${assessor.id}"> ${assessor.firstname}, ${assessor.lastName}, ${assessor.id} </option>
          		</jstl:forEach>
          	</sf:select>
          	<sf:select path="status" value = "Pending">
          		<option value= -1 > Rejected </option>
          		<option value= 0 > Pending </option>
          		<option value = 1> Approved </option>
          	</sf:select>
          	
          	<tr><th>Remarks: </th><td><sf:textarea path = "remark" rows="3" cols="40"/></td></tr>
          	
          	
            <tr><td><Button type=Submit class= "btn btn-success btn-lg" >Submit Claim</Button></td>
                <td><Button type="reset" class= "btn btn-info btn-lg" >Clear Claim</Button></td></tr>
		</table>
		

</sf:form>
     </div>
    </div>
</body>
</html>