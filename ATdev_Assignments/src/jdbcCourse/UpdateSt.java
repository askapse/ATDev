package jdbcCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSt {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","abhi","kali")){
			Statement st = con.createStatement();
			st.executeUpdate("update bank set accountbal = 0 where accountno = 123324754");
			st.close();
			System.out.println("Updated....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
