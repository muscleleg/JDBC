package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Prgram4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String title ="TEST3";
		String content="hahaha3";
		String files = "";
		int id = 7;
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql="DELETE NOTICE WHERE ID=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"newlec","0000");
		//Statement st = con.createStatement();
		PreparedStatement st =con.prepareStatement(sql);

		st.setInt(1,id);
		int result = st.executeUpdate();
		System.out.println(result);
		
		
		st.close();
		con.close();
		
	}

}
