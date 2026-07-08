import java.sql.*;

// Database Connectivity with MySQL Using JAVA
public class DB_connection {
	public static void main(String[] args) {
		try {
			//DRIVER :- mysql driver connection
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver connect");
			
			//URL - Connection with DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
			
			//Statement - SQL
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into std (id,name,age) values (1,'Ashish',45)");

			if(result > 0){
				System.out.println("Inserted");
			}else{
				System.out.println("Not inserted");
			}
			
     // Fatch Data From DataBase
			ResultSet rs = stmt.executeQuery("select *from std");
			
			while(rs.next()){
				System.out.println("ID: "+rs.getInt("id")+" Name: "+rs.getString("name")+" Age: "+rs.getInt("age"));
			}
			con.close();	
		}
		catch(Exception e) {
			System.out.println(e);
		 }
	}
}