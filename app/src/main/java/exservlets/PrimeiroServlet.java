package exservlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class PrimeiroServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            String n = request.getParameter("nome");
            request.setAttribute("nome", n);
            //response.getWriter().print("Olá" + n);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    
}
