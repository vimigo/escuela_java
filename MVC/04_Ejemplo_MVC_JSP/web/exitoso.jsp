<%-- 
    Document   : exitoso
    Created on : 27-sep-2019, 10:38:32
    Author     : alumno
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% boolean  pers = (boolean) session.getAttribute("exitoso"); %>
        <h1>HAS BORRADO GENIAL!</h1>
      
          <% if (pers = true) {%>
        
            <span style="color: red">
            NO HAY NADA
        </span>

        <% } else { %>            
        <span style="color: red">
           NO HAS BORRADO
        </span>
        <% }%>
    </body>
</html>
