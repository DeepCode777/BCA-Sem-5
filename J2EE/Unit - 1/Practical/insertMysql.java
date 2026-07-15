import java.sql.*;

public class insertMysql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
			System.out.println("Driver Connected");
			
			PreparedStatement pst = con.prepareStatement("insert into tryTB values(?,?,?)");

            // database_name : demo
			// table_name : tryTB
			pst.setInt(1, 3);  // id
			pst.setString(2, "Deep");  // name
			pst.setString(3, "Rajkot");  // city
			
			System.out.println(pst.executeUpdate()+" Reccord Inserted");
			
			ResultSet rs = pst.executeQuery("select * from j2ee");
			while(rs.next()) {
				System.out.println("ID : "+ rs.getInt(1)+ "\nName : "+ rs.getString(2)+ "\nCity : " +rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
