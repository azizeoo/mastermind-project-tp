/**
 * 
 */
package fr.norsys.dojo.mastermind.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import org.hsqldb.jdbc.JDBCDataSource;

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
}
