package jdbcCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankAccount {
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","abhi","kali")) {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("select accountno,accountbal from bank");
			
			while(rs.next()) {
				if(rs.getLong(1) == 12233445) {
					rs.updateFloat(2, rs.getFloat(2)+4000);
					rs.updateRow();
				}
			}					
			st.close();			
			System.out.println("updated.....");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
