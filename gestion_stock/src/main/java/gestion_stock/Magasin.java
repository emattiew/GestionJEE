package gestion_stock;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private int id;
    private String nom;
    private List<Produit> stock;

    // Constructeur
    public Magasin(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.stock = new ArrayList<>();
    }

    // Méthode pour ajouter un produit au stock du magasin
    public void ajouterProduit(Produit produit) {
        stock.add(produit);
    }

    // Méthode pour retirer un produit du stock du magasin
    public void retirerProduit(Produit produit) {
        stock.remove(produit);
    }

    // Méthode pour obtenir le stock du magasin
    public List<Produit> getStock() {
        return stock;
    }

    // Méthode pour obtenir le nom du magasin
    public String getNom() {
        return nom;
    }

    // Méthode pour définir le nom du magasin
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // Méthode pour obtenir l'ID du magasin
    public int getId() {
        return id;
    }

    // Méthode pour définir l'ID du magasin
    public void setId(int id) {
        this.id = id;
    }

	public Produit getProductById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProduct(Produit produit) {
		// TODO Auto-generated method stub
		
	}
	

}
