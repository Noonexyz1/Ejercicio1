
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");

        String nombre = (request.getParameter("nombre") != null)? request.getParameter("nombre") : "sin nombre";
        String edadString = (request.getParameter("edad") != null)? request.getParameter("edad") : "0";
        int edad = Integer.parseInt(edadString);
        
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
            out.println("<title>Servlet Principal</title>");
        out.println("</head>");
        out.println("<body>");
            out.println("<h1>Hola " + nombre + "</h1>");
            out.println("<p>tienes " + edad + " años</p>");
        out.println("</body>");
        out.println("</html>");
              
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    

}
