package jdbcCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordPrepared {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","abhi","kali")){
			PreparedStatement pr = con.prepareStatement("insert into bank values(?,?)");
			pr.setLong(1, 193244754);
			pr.setFloat(2, 500);			
			pr.addBatch();
			
			
			pr.setLong(1, 433324754);
			pr.setFloat(2, 700);			
			pr.addBatch();
			
			pr.setLong(1, 343324754);
			pr.setFloat(2, 800);			
			pr.addBatch();
			
			pr.setLong(1, 123324754);
			pr.setFloat(2, 900);
			pr.addBatch();
			
			pr.setLong(1, 433314233);
			pr.setFloat(2, 250);
			pr.addBatch();
			
			pr.executeBatch();
			System.out.println("inserted....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
