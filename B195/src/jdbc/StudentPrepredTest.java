package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class StudentPrepredTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter Rollno:");
		student.setRollno(sc.nextInt());
		System.out.println("Enter Name:");
		student.setName(sc.next());
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b195","root","root");
			String query = "insert into student values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getName());
			ps.execute();
			con.close();System.out.println("data added Successfully...!");
		}catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
