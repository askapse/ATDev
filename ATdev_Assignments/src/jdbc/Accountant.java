package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Accountant {
	Connection con;

	public Accountant() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "abhi", "kali");
	}

	public boolean createTable() {
		;
		Statement st;
		try {
			st = con.createStatement();
			int i = st.executeUpdate(
					"create table accountant(id int not null auto_increment,name varchar(50),email varchar(100),password varchar(30) , primary key(id))");
			st.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean insertAccountant(Ac ac) {
		try {
			PreparedStatement pr = con.prepareStatement("insert into accountant values(?,?,?,?)");
			pr.setInt(1, ac.id);
			pr.setString(2, ac.name);
			pr.setString(3, ac.email);
			pr.setString(4, ac.pass);

			if (pr.executeUpdate() > 0)
				return true;

			pr.close();
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void display() {
		try {
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select *from accountant");
			while (rs.next()) {
				System.out.printf("%-3d %-30s %-50s %-30s\n", rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4));
			}

			st.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error while retriving records....");
		}
	}

	public boolean delete(int id) {
		try {
			PreparedStatement pr = con.prepareStatement("delete from accountant where id=?");
			pr.setInt(1, id);

			if (pr.executeUpdate() > 0)
				return true;
			return false;
		} catch (SQLException e) {
			return false;
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Accountant ac = new Accountant();

		System.out.println("Accountant table created : " + ac.createTable());
		System.out.println(
				"Insert record : " + ac.insertAccountant(new Ac(1, "Abhi Kapse", "askapse@gmail.com", "abhi99")));
		System.out.println(
				"Insert record : " + ac.insertAccountant(new Ac(2, "Datta Jadhav", "djadhav@gmail.com", "datta6001")));
		ac.display();

		System.out.println("\nDelete record : " + ac.delete(2));

		ac.display();

	}
}

class Ac {
	int id;
	String name;
	String email;
	String pass;

	public Ac(int id, String name, String email, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
}
