import java.util.ArrayList;
import java.util.List;

public class ProduitService {
	   private List<Produit> produits;
	    public ProduitService() {
	        this.produits = new ArrayList<>();
	    }
	    public void ajouterProduit(Produit produit) throws Exception
	 {
	       
	        if (produitExiste(produit.getId()) || produitExiste(produit.getNom()))
		 {
	            throw new Exception("Un produit avec le même ID ou nom existe déjà.");
	        }
	        if (produit.getPrix() < 0 || produit.getQuantite() < 0) 
		{
	            throw new Exception("Le prix et la quantité doivent être positifs.");
	        }
	        produits.add(produit);
	    }
}