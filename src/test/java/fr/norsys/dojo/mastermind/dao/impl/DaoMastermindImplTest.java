package fr.norsys.dojo.mastermind.dao.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import fr.norsys.dojo.mastermind.dao.IDaoMastermind;
import fr.norsys.dojo.mastermind.dto.Partie;
import fr.norsys.dojo.mastermind.util.ApplicationContext;

public class DaoMastermindImplTest{
	private static IDaoMastermind dao;
	private static  Connection conn;
	
	@Test
	public void testerPartie()  {
		int idJoueur = 10300;
		try {
			conn = ApplicationContext.getConnexion();
			assertNotNull(conn);
			dao = new DaoMastermindImpl(conn);
			assertNotNull(dao);
			//ajout d'enregitrement
			assertTrue(1 == dao.createPartie(creerObjetPartie(idJoueur)));
			//modification d'enregitrement
			assertTrue(1 == dao.updatePartie(modifierObjetPartie(idJoueur)));
			//test d'enregitrement
			ResultSet r = dao.selectPartieById(idJoueur);
			assertNotNull(r);
			//recuperation  d'enregitrement
			assertTrue(1 == ApplicationContext.resultSetToList(r).size());
			//suppresion  d'enregitrement
			assertTrue(1 == dao.deletePartie(idJoueur));
			//recuperation  d'enregitrement
			assertTrue(0 == ApplicationContext.resultSetToList(dao.selectPartieById(idJoueur)).size());
			conn.close();
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
