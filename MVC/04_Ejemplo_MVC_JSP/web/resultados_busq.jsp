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

        <% if (pers != null) {%>
        <form name='form2' method='post' action='./personas.do'>          
            <label for="nombre">Nombre: </label>
            <input id="nombre" name = "nombre"   value="<%= pers.getNombre()%>"/>
            <label for="edad">Edad </label>
            <input id="edad" name = "edad"  value="<%= pers.getEdad()%>"/>
            <label for="email">Email </label>
            <input id="email" name = "email"  value="<%= pers.getEmail()%>"/>
            <label for="contrasena">Contrasena </label>
            <input id="contrasena" name = "contrasena"   value="<%= pers.getContrasena()%>"/>
            <input type='hidden' name='metodo' id="metodo" />
            <input type='hidden' name='emailV' id="emailV" value="<%= pers.getEmail()%>" />
            <input type='submit' id="botonBorrar"  value="borrar"/> 
            <input type='submit' id="botonModificar" value ="modificar" /> 
        </form>
        <% } else { %>            
        <span style="color: red">
            No se han encontrado personas
        </span>
        <% }%>
<br/>
          <a href="./index.jsp">INICIO</a>
        <script>
                document.getElementById("botonBorrar").addEventListener("click", borrar);
                document.getElementById("botonModificar").addEventListener("click", modificar);
          
            function borrar() {
                var metodo = document.getElementById("metodo");
                metodo.value = "borrar";
            }

            function modificar() {
                var metodo = document.getElementById("metodo");
               metodo.value = "modificar";
            }


        </script>

    </body>
</html>
