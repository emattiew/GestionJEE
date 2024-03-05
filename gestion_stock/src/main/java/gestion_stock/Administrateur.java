package gestion_stock;

public class Administrateur {
    private static final String DEFAULT_USERNAME = "admin";
    private static String DEFAULT_PASSWORD = "admin";

    public static boolean verifierIdentifiantMotDePasse(String identifiant, String motDePasse) {
        return DEFAULT_USERNAME.equals(identifiant) && DEFAULT_PASSWORD.equals(motDePasse);
    }

    public static void modifierMotDePasse(String nouveauMotDePasse) {
        DEFAULT_PASSWORD = nouveauMotDePasse;
    }

    public static String getIdentifiantParDefaut() {
        return DEFAULT_USERNAME;
    }
}

