package fr.norsys.dojo.mastermind.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.dojo.mastermind.dto.Partie;



public class MastermindServiceTest {
	private static MastermindService service;
	
	@Test
	public void testerPartie()  {
		int idJoueur = 10300;
		try {
			service = new MastermindService();
			assertNotNull(service);
			//ajout d'enregitrement
			assertTrue(1 == service.ajouterPartie(creerObjetPartie(idJoueur)));
			//modification d'enregitrement
			assertTrue(1 == service.modifierPartier(modifierObjetPartie(idJoueur)));
			//test d'enregitrement
			
			//recuperation  d'enregitrement
			assertTrue(1 == service.rechercherPartier(idJoueur).size());
			//suppresion  d'enregitrement
			assertTrue(1 == service.supprimerPartier(idJoueur));
			//recuperation  d'enregitrement
			assertTrue(0 == service.rechercherPartier(idJoueur).size());
		} catch (SQLException e) {

		}
		
		
	}

	private static Partie creerObjetPartie(int idJoueur){
		Partie p = new Partie();
		int victoire = 3;
		int defaite = 5;
		int score	= 9;
		p.setIdJoueur(idJoueur);
		p.setVictoire(victoire);
		p.setDefaite(defaite);
		p.setScore(score);
		return p;
	}
	private static Partie modifierObjetPartie(int idJoueur){
		Partie p = new Partie();
		int vectoire = 15;
		int defaite = 16;
		int score	= 17;
		p.setIdJoueur(idJoueur);
		p.setVictoire(vectoire);
		p.setDefaite(defaite);
		p.setScore(score);
		return p;
	}

}
