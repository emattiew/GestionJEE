package gestion_stock;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ajouterProduit")
public class Ajouterproduitservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les données du formulaire
        String nom = request.getParameter("nom");
        String codeBarre = request.getParameter("codeBarre");
        double prix = Double.parseDouble(request.getParameter("prix"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));

        // Créer un nouvel objet Produit avec les données du formulaire
        produit produit = new produit(nom, codeBarre, prix, quantite);

        // Ajouter le produit au stock du magasin (supposons que le magasin est déjà créé et accessible)
        Magasin magasin = new Magasin(); // Vous pouvez obtenir le magasin à partir d'une source de données
        magasin.ajouterProduit(produit);



        response.sendRedirect("confirmation.html");
    }
}
