package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b195", "root", "root");
		String query = "select * from Student";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
			int rollno = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(rollno +":"+name);
		}
	}
}
