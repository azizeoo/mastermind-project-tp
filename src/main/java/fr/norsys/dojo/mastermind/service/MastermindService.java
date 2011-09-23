package fr.norsys.dojo.mastermind.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.norsys.dojo.mastermind.dao.IDaoMastermind;
import fr.norsys.dojo.mastermind.dao.impl.DaoMastermindImpl;
import fr.norsys.dojo.mastermind.dto.Partie;
import fr.norsys.dojo.mastermind.util.ApplicationContext;

public class MastermindService {
	/**
	 * Méthode appelle le dao pour ajouter une partie dans la base de données
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int ajouterPartie(Partie p) throws SQLException{
		Connection conn = ApplicationContext.getConnexion();
		IDaoMastermind daoPartie = new DaoMastermindImpl(conn);
		int maj = daoPartie.createPartie(p);
		conn.close();
		return maj;
	}
	/**
	 * Méthode appelle le dao pour modifier une partie dans la base de données
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int modifierPartier(Partie p) throws SQLException{
		Connection conn = ApplicationContext.getConnexion();
		IDaoMastermind daoPartie = new DaoMastermindImpl(conn);
		int maj = daoPartie.updatePartie(p);
		conn.close();
		return maj;
	}
	/**
	 * Méthode appelle le dao pour supprimer une partie donnée
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int supprimerPartier(int id) throws SQLException{
		Connection conn = ApplicationContext.getConnexion();
		IDaoMastermind daoPartie = new DaoMastermindImpl(conn);
		int maj = daoPartie.deletePartie(id);
		conn.close();
		return maj;
	}
	public List<Partie> rechercherPartier(int id) throws SQLException{
		Connection conn = ApplicationContext.getConnexion();
		IDaoMastermind daoPartie = new DaoMastermindImpl(conn);
		ResultSet r = daoPartie.selectAllPartie();
		conn.close();
		return ApplicationContext.resultSetToList(r);
	}
	/**
	 * Méthode appelle le dao pour affchier tous les enregitrements
	 * 
	 * @return
	 * @throws SQLException
	 */
	public List<Partie> listerPartie() throws SQLException{
		Connection conn = ApplicationContext.getConnexion();
		IDaoMastermind daoPartie = new DaoMastermindImpl(conn);
		ResultSet r = daoPartie.selectAllPartie();
		conn.close();
		return ApplicationContext.resultSetToList(r);
	}
}
