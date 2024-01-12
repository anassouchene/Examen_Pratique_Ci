
import com.ehei;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitServiceTest {
    private ProduitService produitService;

    @Before
    public void setUp() {
        produitService = new ProduitService();
    }

    @Test
    public void testAjouterProduit() throws Exception {
        Produit produit = new Produit(1L, "Ordinateur", 999.99, 5);
        produitService.ajouterProduit(produit);

        assertEquals(1, produitService.getProduits().size());
        assertTrue(produitService.getProduits().contains(produit));
    }

    @Test(expected = Exception.class)
    public void testAjouterProduitExistant() throws Exception {
        Produit produit = new Produit(1L, "Ordinateur", 999.99, 5);
        produitService.ajouterProduit(produit);
        produitService.ajouterProduit(produit); 
    }

    @Test(expected = Exception.class)
    public void testAjouterProduitPrixNegatif() throws Exception {
        Produit produit = new Produit(2L, "Téléphone", -199.99, 10);
        produitService.ajouterProduit(produit);  
    }

    @Test
    public void testLireProduit() throws Exception {
        Produit produit = new Produit(3L, "Tablette", 299.99, 8);
        produitService.ajouterProduit(produit);

        Produit produitLu = produitService.lireProduit(3L);
        assertNotNull(produitLu);
        assertEquals(produit, produitLu);
    }

    @Test(expected = Exception.class)
    public void testLireProduitInexistant() throws Exception {
        produitService.lireProduit(4L); 
    }


}
