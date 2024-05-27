package database;

import java.sql.*;

public class Connect {

	private Connection connection = null;

	private String driver, urlConexao, usuario, senha;

	public Connect( String driver, String urlConexao, String usuario, String senha ){
		this.driver     = driver;
		this.urlConexao = urlConexao;
		this.usuario    = usuario;
		this.senha      = senha;
	}

	public Connection getConnection() throws Exception {
		try {
			if( this.connection == null ){
				Class.forName( driver );
	    		this.connection = DriverManager.getConnection( urlConexao, usuario, senha );
			}

			return this.connection;
		} catch( Exception e ){
			    throw e;
	    }
	}

	public void close() throws Exception {
		try {
			connection.close();
		} catch( Exception e ){
				 throw e;
		} finally {
			connection = null;
		}
	}
}