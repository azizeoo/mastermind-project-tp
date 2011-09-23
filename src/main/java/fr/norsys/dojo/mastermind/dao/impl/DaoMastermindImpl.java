/**
 * 
 */
package fr.norsys.dojo.mastermind.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.norsys.dojo.mastermind.dao.IDaoMastermind;
import fr.norsys.dojo.mastermind.dto.Partie;

/**
 * @author technomaker09
 *
 */
public class DaoMastermindImpl implements IDaoMastermind {
	private String addPartieQuery		= "INSERT INTO JOUEUR VALUES(? , ? , ? , ?)";
	private String modifyPartieQuery	= "UPDATE JOUEUR SET VICTOIRE= ?, DEFAITE= ?, SCORE= ? WHERE ID_JOUEUR= ?";
	private String deletePartieQuery	= "DELETE FROM JOUEUR WHERE ID_JOUEUR= ?";
	private String listPartieQuery		= "SELECT * FROM JOUEUR ";
	private String byIdQuery			= "WHERE ID_JOUEUR= ?";
	private Connection conn;
	
	public DaoMastermindImpl(Connection conn) {
		this.conn = conn;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.norsys.dojo.mastermind.dao.IDaoMastermind#createPartie(fr.norsys.dojo.mastermind.dto.Partie)
	 */
	public int createPartie(Partie p) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(addPartieQuery);
		pstmt.setInt(1, p.getIdJoueur());
		pstmt.setInt(2, p.getVictoire());
		pstmt.setInt(3, p.getDefaite());
		pstmt.setInt(4, p.getScore());
		int maj = pstmt.executeUpdate();
		pstmt.close();
		return maj;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.norsys.dojo.mastermind.dao.IDaoMastermind#updatePartie(fr.norsys.dojo.mastermind.dto.Partie)
	 */
	public int updatePartie(Partie p) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(modifyPartieQuery);
		pstmt.setInt(4, p.getIdJoueur());
		pstmt.setInt(1, p.getVictoire());
		pstmt.setInt(2, p.getDefaite());
		pstmt.setInt(3, p.getScore());
		int maj = pstmt.executeUpdate();
		pstmt.close();
		return maj;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.norsys.dojo.mastermind.dao.IDaoMastermind#selectAllPartie()
	 */
	public ResultSet selectAllPartie() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(listPartieQuery);
		ResultSet rs = pstmt.executeQuery();
		pstmt.close();
		return rs;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.norsys.dojo.mastermind.dao.IDaoMastermind#deletePartie(int)
	 */
	public int deletePartie(int id) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(deletePartieQuery);
		pstmt.setInt(1, id);
		int maj = pstmt.executeUpdate();
		pstmt.close();
		return maj;
	}
	public ResultSet selectPartieById(int id) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(listPartieQuery + byIdQuery);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		pstmt.close();
		return rs;
	}
}
