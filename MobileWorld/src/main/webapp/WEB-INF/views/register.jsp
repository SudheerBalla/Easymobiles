<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form:form action="register" method="post" commandName="uf">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"> Registration</h2></td>
                </tr>
                <tr>
                    <td>name:</td>
                    <td><form:input path="name"></form:input></td>
                     <td>password:</td>
                    <td><form:input path="password"></form:input></td>
                     <td>emailid:</td>
                    <td><form:input path="emailid"></form:input></td>
                     <td>mobno:</td>
                    <td><form:input path="mobno"></form:input></td>
                    <td colspan="2"><input type="submit" value="Save"></td>    
         </tr>    
        </table>    
          </form:form>    
                    
