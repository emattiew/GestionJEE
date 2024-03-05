package gestion_stock;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/modifierMotDePasse")
public class ModifierMotDePasseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ancienMotDePasse = request.getParameter("ancienMotDePasse");
        String nouveauMotDePasse = request.getParameter("nouveauMotDePasse");

        // Vérifier si l'ancien mot de passe correspond à celui de l'administrateur
        if (ancienMotDePasse.equals(admin.getPassword())) {
            admin.setPassword(nouveauMotDePasse);
            response.getWriter().println("Le mot de passe a été modifié avec succès.");
        } else {
            response.getWriter().println("Mot de passe incorrect.");
        }
    }
}
