/**
 * 
 */
package fr.norsys.dojo.mastermind.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCDataSource;

import fr.norsys.dojo.mastermind.dto.Partie;

/**
 * @author technomaker09
 *
 */
public class ApplicationContext {
	private static final String URL 	= "jdbc:hsqldb:file:data/mastermind_db";
	private static final String USER	= "TEST";
	private static final String PWD		= "test";
	private static JDBCDataSource DATASOURCE;
	private static DataSource getApplicationDataSource() {
		if (DATASOURCE == null) {
			DATASOURCE = new JDBCDataSource();
			DATASOURCE.setUrl(URL);
			DATASOURCE.setUser(USER);
			DATASOURCE.setPassword(PWD);
		}
		return DATASOURCE;
	}


	public static Connection getConnexion() throws SQLException{
		DataSource ds = getApplicationDataSource();
		Connection conn;
			conn = ds.getConnection();
		return conn;
	}
	
	public static List<Partie> resultSetToList(ResultSet r) throws SQLException{
		Partie partie;
		List<Partie> listPartie = new ArrayList<Partie>();
		while(r.next()){
			partie = new Partie();
			partie.setIdJoueur(r.getInt("id_joueur"));
			partie.setVictoire(r.getInt("victoire"));
			partie.setDefaite(r.getInt("defaite"));
			partie.setScore(r.getInt("score"));
			listPartie.add(partie);
		}
		return listPartie;
	}
}
