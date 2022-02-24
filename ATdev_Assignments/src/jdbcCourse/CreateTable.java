package jdbcCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","abhi","kali")){
			Statement st = con.createStatement();
			
			//create table query
			
//			st.executeUpdate("create table contries(contry_id int not null auto_increment primary key,contry_name varchar(100),region_id int)");
			
			//alter table query
			
			st.executeUpdate("alter table contries add column region_name varchar(100)");
			
			st.close();
			System.out.println("table created....");
		} catch (SQLException e) {
			System.err.println("failed to create table....");
			e.printStackTrace();
		}
		
	}
}
