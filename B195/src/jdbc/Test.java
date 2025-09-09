package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b195","root","root");
		String query = "insert into student values(101,'MC')";
		Statement statement = con.createStatement();
		int i = statement.executeUpdate(query);
		System.out.println(i);
		con.close();
		

	}

}
