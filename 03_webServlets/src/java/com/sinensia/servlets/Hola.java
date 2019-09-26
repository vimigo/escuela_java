

package com.sinensia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hola extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) 
            throws ServletException, IOException {
       String ruta=peticion.getContextPath();//ruta
       // super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    //no necesitamos llamar al padre
    //construimos el html de respuesta
    respuesta.setContentType("text/html;charset=UTF-8");
    try (PrintWriter salida = respuesta.getWriter()){
    salida.println("<html>");
    salida.println("<head><title> HTML creado desde Servlet</title></head>");
    salida.println("<body>");
    salida.println("<h1>Html creado desde servlet</h1>");
    salida.println("<p>Ruta: " + ruta + "</p>");
    salida.println("<ul>");
     for (int i=0;i <10; i++){
     salida.println("<li>Numero generado" +i + "</li>");
     }
    salida.println("</ul>");
    salida.println("</body>");
    salida.println("</html>");
    }
    }
    
    
}
