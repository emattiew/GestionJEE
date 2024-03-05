package gestion_stock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/modifyquantity")
public class ModifyQuantityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<Integer, Produit> produits = new HashMap<>();
   
    public ModifyQuantityServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Le code existant pour gérer les requêtes POST reste inchangé
        int id = Integer.parseInt(request.getParameter("id"));
        int newQuantity = Integer.parseInt(request.getParameter("newQuantity"));
        
        Produit produit = produits.get(id);
        if (produit != null) {
            produit.setQuantity(newQuantity);
            response.getWriter().println("La quantité du produit avec l'ID " + id + " a été modifiée avec succès.");
        } else {
            response.getWriter().println("Produit avec l'ID " + id + " n'existe pas.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implémentez la logique pour gérer les requêtes GET
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Modify Quantity</title></head><body>");
        response.getWriter().println("<h1>Modify Quantity</h1>");
        response.getWriter().println("<form method=\"post\">");
        response.getWriter().println("ID: <input type=\"text\" name=\"id\"><br>");
        response.getWriter().println("New Quantity: <input type=\"text\" name=\"newQuantity\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Modify\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }
}


