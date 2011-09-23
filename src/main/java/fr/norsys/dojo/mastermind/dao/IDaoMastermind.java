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
	 * M�thode DAO pour persister une partie dans la base de donn�es
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int createPartie(Partie p) throws SQLException;
	/**
	 * M�thode DAO pour faire la mise � jour d'une partie dans la base
	 * 
	 * @param p
	 * @return
	 * @throws SQLException
	 */
	public int updatePartie(Partie p) throws SQLException;
	/**
	 * M�thode DAO pour selectionner l'ensemble des enregitrements de la base
	 * 
	 * @return
	 * @throws SQLException
	 */
	
	public ResultSet selectAllPartie() throws SQLException;
	/**
	 * M�thode DAO pour supprimer une partie donn�e de la base
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int deletePartie(int id) throws SQLException;
	/**
	 * M�thode DAO pour recuperer un enregitrement par id
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ResultSet selectPartieById(int id) throws SQLException;

}
