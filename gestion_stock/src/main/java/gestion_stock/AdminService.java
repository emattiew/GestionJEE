package gestion_stock;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/admin")
public class AdminService {
    

//  http://localhost:9000/gestion_stock/app/admin/motdepasse?ancienMotDePasse=admin&nouveauMotDePasse=1234

	
    @PUT
    @Path("/motdepasse")
    public Response modifierMotDePasseAdmin(@QueryParam("ancienMotDePasse") String ancienMotDePasse,
                                            @QueryParam("nouveauMotDePasse") String nouveauMotDePasse) {
        if (validerAncienMotDePasse(ancienMotDePasse)) {
            modifierMotDePasseAdmin(nouveauMotDePasse);
            return Response.ok("Mot de passe modifié avec succès").build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).entity("Mot de passe incorrect").build();
        }
    }

    private boolean validerAncienMotDePasse(String ancienMotDePasse) {
        
        String motDePasseActuel = admin.getPassword();
        return ancienMotDePasse.equals(motDePasseActuel);
    }

    private void modifierMotDePasseAdmin(String nouveauMotDePasse) {
        // Assuming there is only one admin
        admin.setPassword(nouveauMotDePasse);
    }
    
    //http://localhost:9000/gestion_stock/app/admin/tous
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/tous")
    public Response getAllAdmins() {
        String adminNom = admin.getLogin();
        String adminPass = admin.getPassword();
        return Response.ok("nom:"+adminNom+"  motdepasse:"+adminPass).build();
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/modifierQuantite")
    public Response modifierQuantiteProduit(@QueryParam("idProduit") int idProduit, 
                                            @QueryParam("nouvelleQuantite") int nouvelleQuantite) {
        // Récupérer le produit à partir de l'ID (vous devez implémenter cette logique)
        Produit produit = trouverProduitParId(idProduit);

        if (produit != null) {
            // Modifier la quantité du produit
            produit.setQuantity(nouvelleQuantite);

            // Ici, vous pouvez implémenter la logique pour enregistrer la modification dans votre base de données

            return Response.ok("Quantité du produit ID " + idProduit + " modifiée avec succès").build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Produit non trouvé").build();
        }
    }

	private Produit trouverProduitParId(int idProduit) {
	
		return null;
	}
}