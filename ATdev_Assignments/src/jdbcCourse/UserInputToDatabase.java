package jdbcCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInputToDatabase {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		String [] data = new String[3];
		
		System.out.print("\nEnter Contry name : ");
		data[0] = in.nextLine();
		
		System.out.print("\nEnter Region id : ");
		data[1] = in.nextLine();
		
		
		System.out.print("\nEnter Rigion name : ");
		data[2] = in.nextLine();
				
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","abhi","kali")){
			PreparedStatement st = con.prepareStatement("insert into contries(contry_name,region_id,region_name) values(?,?,?)");
			st.setString(1, data[0]);
			st.setInt(2, Integer.parseInt(data[1]));
			st.setString(3, data[2]);
						
			st.executeUpdate();			
			st.close();
			System.out.println("Data Inserted....");
		} catch (SQLException e) {
			System.err.println("failed to insert recored....");
			e.printStackTrace();
		}
	}
}
