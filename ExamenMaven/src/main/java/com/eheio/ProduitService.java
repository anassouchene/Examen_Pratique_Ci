import java.util.ArrayList;
import java.util.List;

public class ProduitService {
	   private List<Produit> produits;
	    public ProduitService() {
	        this.produits = new ArrayList<>();
	    }
	  
	    public Produit lireProduit(Long id) throws Exception {
	        for (Produit produit : produits) {
	            if (produit.getId().equals(id)) {
	                return produit;
	            }
	        }
	        throw new Exception("Produit non trouvé.");
	    }

	   
}
