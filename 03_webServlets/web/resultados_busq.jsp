<%-- 
    Document   : resultados_busq
    Created on : 26-sep-2019, 15:56:07
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados busqueda</title>
    </head>
    <body>
        <h1>Resultados busqueda</h1>
        <h2>usuario</h2> 
            <%
                Person pers = (Persona) session.getAttribute("resultadoBusq");
            %>
            <% if (pers != null) {%>
            <label for="nombre">Nombre:</label>
            <input type='readonly' value='<%= pers.getNombre()%>'/>
            <label for="edad">Edad:</label>
            <input type='readonly' value='<% pers.getEdad();%>'>
            <%} else {%>
            <span style="color:red">
                No se han encontrado personas
            </span>

            }

            }}    
       
    </body>
</html>
