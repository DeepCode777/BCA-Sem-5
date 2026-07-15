import java.sql.*;

public class insertMysql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/deep","root","");
			System.out.println("Driver Connected");
			
			PreparedStatement pst = con.prepareStatement("insert into j2ee values(?,?,?)");
			
			pst.setInt(1, 5);
			pst.setString(2, "Prakash");
			pst.setString(3, "Jilariya");
			
			System.out.println(pst.executeUpdate()+"Reccord Inserted");
			
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
