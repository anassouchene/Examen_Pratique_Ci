import java.util.ArrayList;
import java.util.List;

public class ProduitService {
	   private List<Produit> produits;
	    public ProduitService() {
	        this.produits = new ArrayList<>();
	    }
	   
	 
	    public void mettreAJourProduit(Produit produit) throws Exception {
	        if (!produitExiste(produit.getId())) {
	            throw new Exception("Produit non trouvé pour la mise à jour.");
	        }
	        if (produit.getPrix() < 0 || produit.getQuantite() < 0) {
	            throw new Exception("Le prix et la quantité doivent être positifs.");
	        }
	    }
	 
	    private boolean produitExiste(String nom) {
	        return produits.stream().anyMatch(produit -> produit.getNom().equals(nom));
	    }
}
