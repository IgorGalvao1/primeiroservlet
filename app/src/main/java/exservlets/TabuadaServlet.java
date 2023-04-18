package exservlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(name = "TabuadaServlet", urlPatterns = "/tabuada")
public class TabuadaServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            request.getRequestDispatcher("/tabuada.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            int numero = integer.parseInt(request.getParameter("numero"));
            int[] resultado = new int[10];

            for(int i = 0;i < 10;i++) {
                resultado[i] = (i+1) * numero;
            }

            request.setAttribute("resultado", resultado);

            request.getRequestDispatcher("/tabuada.jsp").forward(request, response);
    }
}