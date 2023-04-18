package exservlets;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "SomaServlet", urlPatterns = "/Soma")
public class SomaServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse  response)
        throws ServletException, IOException{

        request.getRequestDispatcher("/soma.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse  response)
        throws ServletException, IOException{

            int numero1 = Integer.parseInt(request.getParameter("numero 1"));
            int numero2 = Integer.parseInt(request.getParameter("numero 2"));

            int resultado = numero1 + numero2;

        

            request.setAttribute("resultado", resultado);

            request.getRequestDispatcher("/soma.jsp").forward(request, response);
        }
    
}