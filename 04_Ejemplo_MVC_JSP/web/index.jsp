<%-- 
    Document   : index
    Created on : 26-sep-2019, 12:32:08
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>MVC</title>
    </head>
    <body>
         <div>SOY TU INDEX DEL MVC ( Modelo / Vista / Controlador) </div>
         
           <form name='form1' method='post' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td> NOMBRE: </td>
                    <td> <input type='text' name='nombre' id='nombre'> </td></tr>
                <tr>
                    <td> EDAD: </td>
                    <td > <input type='number' name='edad' id='edad'> </td></tr>
                <tr>
                   
            </table>
            <input type='submit' value='enviar'> 
        </form>
    </body>
</html>
