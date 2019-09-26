<%-- 
    Document   : registrojsp
    Created on : 26-sep-2019, 10:28:40
    Author     : alumno
--%>
<%@include file="head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%= head("inicio") %>
<body>
    <%@include file="header.jsp" %>
    
 <div>TODO write content</div>
        <form name='form1' method='post' action='./param.jsp'>
            <table border='1'>
                <tr><td>Nombre</td>
                    <td><input type='text' name='nombre' id= 'nombre' /></td></tr>
                <tr><td>Edad</td>
                    <td><input type='number' name='edad' id= 'edad' /></td></tr>
                <tr><td>Email</td>
                    <td><input type='email' name='email' id= 'email' /></td></tr>
                <tr><td>Pass</td>
                    <td><input type='password' name='password' id= 'password' /></td></tr>

            </table>
            <input type='submit' value='enviar'/>
        </form>
</body></html>