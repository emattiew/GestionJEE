package gestion_stock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/magasinservlet")
public class MagasinServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<Integer, Magasin> magasins = new HashMap<>();
   
    public MagasinServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Ajouter un magasin</title></head><body>");
        response.getWriter().println("<h1>Ajouter un magasin</h1>");
        response.getWriter().println("<form method=\"post\">");
        response.getWriter().println("ID: <input type=\"text\" name=\"id\"><br>");
        response.getWriter().println("Nom: <input type=\"text\" name=\"nom\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Ajouter\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
        response.getWriter().println("<html><head><title>Liste des Magasins</title></head><body>");
        response.getWriter().println("<h1>Liste des Magasins</h1>");
        response.getWriter().println("<table border=\"1\">");
        response.getWriter().println("<tr><th>ID</th><th>Nom</th></tr>");
        
        for (Map.Entry<Integer, Magasin> entry : magasins.entrySet()) {
            Magasin magasin = entry.getValue();
            response.getWriter().println("<tr>");
            response.getWriter().println("<td>" + magasin.getId() + "</td>");
            response.getWriter().println("<td>" + magasin.getNom() + "</td>");
            response.getWriter().println("</tr>");
        }
        
        response.getWriter().println("</table>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nom");
        
        Magasin magasin = new Magasin(id, nom);
        magasins.put(id, magasin);
        
        response.sendRedirect(request.getContextPath() + "/magasinservlet");
    }
    
    public Map<Integer, Magasin> getMagasins() {
        return magasins;
    }
}
