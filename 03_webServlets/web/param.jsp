<%-- 
    Document   : param
    Created on : 25-sep-2019, 17:36:55
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos introducidos</title>
        <link rel="stylesheet" href="./estilos/estilos.jsp">
    </head>
    <body>
        <%@include file="header.jsp" %>
       
        <h1>Datos introducidos</h1>
        <p>Te llamas <%out.println( request.getParameter("nombre"));%> </p>
        <p>Y tienes <%out.println( request.getParameter("edad") );%> </p>
        <p>Email <%out.println( request.getParameter("email"));%> </p>
        <p>Clave <%out.println( request.getParameter("password"));%> </p>
        
        <ul>
            <%
             for (int i=0; i<10; i++){%>
             <li class="tipo-letra-tam-<%=i %>">Numero <% out.println("" +i);%></li> 
            <%
               }  
            %>
            
        </ul>     
        
    </body>
</html>
