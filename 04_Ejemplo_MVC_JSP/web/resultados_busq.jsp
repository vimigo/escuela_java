<%-- 
    Document   : resultados_busq
    Created on : 26-sep-2019, 15:55:55
    Author     : alumno
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC con JSP y Servlet</title>
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlet</h1>
        <h2>Usuario</h2>
        
        <% Persona pers = (Persona) session.getAttribute("resultadoBusq"); %>
    
        <% if (pers != null) { %>
        
        <form>
                <label for="nombre">Nombre: </label>
                <input id="nombre" readonly 
                       value="<%= pers.getNombre() %>"/>
                <label for="edad">Edad </label>
                <input id="edad" readonly value="<%= pers.getEdad() %>"/>
                
                <label for="email">email: </label>
                <input id="email" readonly 
                       value="<%= pers.getEmail() %>"/>
                <label for="clave">clave </label>
                <input id="clave" readonly value="<%= pers.getContrasena() %>"/>
                <input id="oculto" name="oculto" type="hidden"/>
                <input type="button" id="modificar" value="Modificar" onclick="modificarf();"/>
                <input type="button" id="borrar" value="Borrar" onclick="borrarf();"/>
             </form>
                
        <% } else { %>            
                <span style="color: red">
                    No se han encontrado personas
                </span>
        <% } %>
   <script>
    function borrarf(){
    var oculto= document.getElementById("oculto");
     oculto.value="borrar";
    
      
    }
    function modificarf(){
     var oculto = document.getElementById("oculto");
     oculto.value="modificar";
    }
    </script>
    </body>
</html>

