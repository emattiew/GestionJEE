package gestion_stock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/directeurservlet")
public class DirecteurServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<String, String> directeurs = new HashMap<>();
   
    public DirecteurServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Ajouter un directeur</title></head><body>");
        response.getWriter().println("<h1>Ajouter un directeur</h1>");
        response.getWriter().println("<form method=\"post\">");
        response.getWriter().println("Nom: <input type=\"text\" name=\"nom\"><br>");
        response.getWriter().println("Mot de passe: <input type=\"password\" name=\"password\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Ajouter\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String password = request.getParameter("password");
        
        directeurs.put(nom, password);
        
        response.sendRedirect(request.getContextPath() + "/directeurservlet");
    }
    
    public Map<String, String> getDirecteurs() {
        return directeurs;
    }
}
