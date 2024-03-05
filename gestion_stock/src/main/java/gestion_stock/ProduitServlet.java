package gestion_stock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/produitservlet")
public class ProduitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<Integer, Produit> produits = new HashMap<>();
   
    public ProduitServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Ajouter un produit</title></head><body>");
        response.getWriter().println("<h1>Ajouter un produit</h1>");
        response.getWriter().println("<form method=\"post\">");
        response.getWriter().println("ID: <input type=\"text\" name=\"id\"><br>");
        response.getWriter().println("Nom: <input type=\"text\" name=\"name\"><br>");
        response.getWriter().println("Code barre: <input type=\"text\" name=\"codeBare\"><br>");
        response.getWriter().println("Prix: <input type=\"text\" name=\"price\"><br>");
        response.getWriter().println("Quantité: <input type=\"text\" name=\"quantity\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Ajouter\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
        response.getWriter().println("<html><head><title>Liste des Produits</title></head><body>");
        response.getWriter().println("<h1>Liste des Produits</h1>");
        response.getWriter().println("<table border=\"1\">");
        response.getWriter().println("<tr><th>ID</th><th>Nom</th><th>Code Barre</th><th>Prix</th><th>Quantité</th></tr>");
        
        
        for (Map.Entry<Integer, Produit> entry : produits.entrySet()) {
            Produit produit = entry.getValue();
            response.getWriter().println("<tr>");
            response.getWriter().println("<td>" + produit.getId() + "</td>");
            response.getWriter().println("<td>" + produit.getName() + "</td>");
            response.getWriter().println("<td>" + produit.getCodeBare() + "</td>");
            response.getWriter().println("<td>" + produit.getPrice() + "</td>");
            response.getWriter().println("<td>" + produit.getQuantity() + "</td>");
            response.getWriter().println("</tr>");
        }
        
        response.getWriter().println("</table>");
        response.getWriter().println("</body></html>");
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String codeBare = request.getParameter("codeBare");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
        Produit produit = new Produit(name, codeBare, price, quantity);
        produits.put(id, produit);
        
        response.sendRedirect(request.getContextPath() + "/produitservlet");
    }
    public Map<Integer, Produit> getProduits() {
        return produits;
    }
    
}


