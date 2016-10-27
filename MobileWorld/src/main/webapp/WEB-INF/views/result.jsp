<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <table border="1">
  <tr>
  <th>Name</th>
  <th>password</th>
  <th>emailid</th>
  <th>mobileno</th>
  </tr>  
      
   <tr>  
   <td>${uf.name}</td>  
   <td>${uf.password}</td>  
   <td>${uf.emailid}</td>  
   <td>${uf.mobno}</td> 
  </tr> 
   </table> 
   
     
  