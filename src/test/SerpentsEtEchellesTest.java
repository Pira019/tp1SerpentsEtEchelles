package test;

  

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import main.SerpentsEtEchelles;

public class SerpentsEtEchellesTest {
	
	//int nbrJoueur = 6;
	
	@Test
	@RepeatedTest(6)
	public void test_si_valeur_radom() {
		int val = SerpentsEtEchelles.rouleLeDe(); 
		assertEquals(true, val >= 1);
		assertEquals(true, val <= 6);
	}
	
	@Test 
	public void test_nbr_joueur() { 
		assertEquals(5,SerpentsEtEchelles.verifierLeNbrDeJoueur(5)); 
	}
	
	@Test 
	public void test_nbr_joueur_errone()
	{  
		assertThrows(IllegalArgumentException.class,()-> SerpentsEtEchelles.verifierLeNbrDeJoueur(45)); 
	}
	 
	@Test 
	@RepeatedTest(20)
	public void test_nombre_aleatoire()
	{  
		int nbrAleatoire = SerpentsEtEchelles.genererAleatoire();
		System.out.println(nbrAleatoire);
		assertTrue(nbrAleatoire > 95 && nbrAleatoire < 99);
	}
	
}
