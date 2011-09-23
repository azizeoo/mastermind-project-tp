/**
 * 
 */
package fr.norsys.dojo.mastermind.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.norsys.dojo.mastermind.dto.Partie;

/**
 * @author technomaker09
 *
 */
public interface IDaoMastermind {
	/**
	 * Méthode DAO pour persister une partie dans la base de données
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int createPartie(Partie p) throws SQLException;
	/**
	 * Méthode DAO pour faire la mise à jour d'une partie dans la base
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int updatePartie(Partie p) throws SQLException;
	/**
	 * Méthode DAO pour selectionner l'ensemble des enregitrements de la base
	 * 
	 * @return
	 * @throws SQLException
	 */
	
	public ResultSet selectAllPartie() throws SQLException;
	/**
	 * Méthode DAO pour supprimer une partie donnée de la base
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int deletePartie(int id) throws SQLException;
	/**
	 * Méthode DAO pour recuperer un enregitrement par id
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ResultSet selectPartieById(int id) throws SQLException;

}
