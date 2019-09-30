<%-- 
    Document   : exito
    Created on : 26-sep-2019, 13:40:45
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EX--XI- TOOOOOO</title>
    </head>
    <body>
        <h1>yo ejecuto tu pedazo de código super bien realizado</h1>
        <label for ="nombre">Nombre:</label>
        <input type="readonly" value=" <%= request.getParameter("nombre")%>">

        <%--  
        SI LO USAMOS CON GET Y CONTROLAMOS LA ENTRADA DE DATOS CON UN IF PERSONA LLEGA A NULL O VACIO
        <input id ="nombre" readonly value="<%= ((Persona) session.getAttribute("resultadoBusq")).getNombre() %>"> 
        --%>
        
        <label for ="edad">Edad: </label>
        <input type="readonly" value=" <%= request.getParameter("edad")%>">



    </body>
</html>
