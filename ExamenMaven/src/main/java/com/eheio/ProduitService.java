import java.util.ArrayList;
import java.util.List;

public class ProduitService {
	   private List<Produit> produits;
	    public ProduitService() {
	        this.produits = new ArrayList<>();
	    }
	    
	    public void supprimerProduit(Long id) throws Exception {
	        if (!produitExiste(id)) {
	            throw new Exception("Produit non trouvé pour la suppression.");
	        }
	        produits.removeIf(produit -> produit.getId().equals(id));
	    }
	    private boolean produitExiste(Long id) {
	        return produits.stream().anyMatch(produit -> produit.getId().equals(id));
	    }
	    private boolean produitExiste(String nom) {
	        return produits.stream().anyMatch(produit -> produit.getNom().equals(nom));
	    }
}
