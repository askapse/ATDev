package jdbcCourse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUsingFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("./properties");
		if(!f.exists()) f.createNewFile();
		String username = "";
		String host =  "";
		String password = "";
		
		try(FileReader fin = new FileReader(f)) {
			try(BufferedReader bfin = new BufferedReader(fin)){
				String str = null;
				while((str = bfin.readLine()) != null) {
					if(str.startsWith("username")) {
						username = str.split("=")[1].trim();
					}
					
					if(str.startsWith("password")) {
						password = str.split("=")[1].trim();
					}
					
					if(str.startsWith("host")) {
						host = str.split("=")[1].trim();
					}									
				}				
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try(Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":3306/",username,password)){
			System.out.println("Connection established successfully......");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.err.println("Connection not established...........");
		}
		
	}
}
