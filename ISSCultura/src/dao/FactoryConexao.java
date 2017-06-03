package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FactoryConexao {

	private static Connection conn;
	private static String serverName = "localhost";
	private static String portNumber = "1521";
	private static String servico = "XE";
	private static String userName = "system";
	private static String password = "alunofatec";

	private static String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + servico;

	public static Connection getConexao() throws Exception {
		if (isConnected())
			return conn;
		else {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			return conn;
		}
	}

	public static void fechaConexao() {

	}

	public static boolean isConnected() {
		if (conn != null)
			return true;
		else
			return false;
	}

	public static void commit() {

	}

	public static void rollback() {

	}
}