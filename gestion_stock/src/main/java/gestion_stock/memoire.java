package gestion_stock;


	import java.util.HashMap;
	import java.util.Map;

	public class memoire {
		
		private static Map<String , Produit> Services = new HashMap<>();

		public static Map<String , Produit> getproduits() {
			return Services;
		}

		 
		public static Map<String, Magasin> getMagasins() {
			// TODO Auto-generated method stub
			return null;
		}


		public static Map<String, Services> getServices() {
			// TODO Auto-generated method stub
			return null;
		}

	}


