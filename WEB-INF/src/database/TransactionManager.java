package database;

import java.sql.*;

public class TransactionManager {

	private Connect connect;

	public Connection getConnect()throws Exception {
		try {
			return this.connect.getConnection();
		}
		catch(Exception e) {
			throw e;
		}
	}

	public TransactionManager(String driver, String urlConexao, String usuario, String senha) {
		connect = new Connect(driver, urlConexao, usuario, senha);
	}

	public ResultSet executeQuery(String sql) throws Exception {
		try {
			Statement statement = connect.getConnection().createStatement();
			ResultSet rs = 	statement.executeQuery(sql);
			//connect.close();
			return rs;
		} catch(Exception e) {
			throw e;
		}
	}

	public int executeUpdate(String sql) throws Exception {
		try {
			connect.getConnection().setAutoCommit(true);
			Statement statement = connect.getConnection().createStatement();
			int reg = statement.executeUpdate(sql);
			//connect.close();
			return reg;
		}catch(Exception e) {
			throw e;
		}
	}

	public int executeUpdate(String sql, boolean autoCommit) throws Exception {
			try {
				connect.getConnection().setAutoCommit(autoCommit);
				Statement statement = connect.getConnection().createStatement();
				return statement.executeUpdate(sql);
			}	catch(Exception e) {
				throw e;
			}
	}

	public void commit() throws Exception {
		if(!connect.getConnection().getAutoCommit())
			connect.getConnection().commit();
		//connect.close();
	}


	public void rollback() throws Exception {
		if(!connect.getConnection().getAutoCommit())
			connect.getConnection().rollback();
		//connect.close();
	}

	public void close() throws Exception {
		connect.close();
	}
}