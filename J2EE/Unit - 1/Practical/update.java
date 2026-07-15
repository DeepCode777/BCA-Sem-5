import java.sql.*;

public class update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
			System.out.println("Driver Connected");
			
			PreparedStatement pst = con.prepareStatement("update tryTB set name=?, city=? where id=?");
			
			pst.setString(1, "Ashish");        // name
			pst.setString(2, "Amarnagaer");    // city
			pst.setInt(3, 3);                  // id
			
			System.out.println(pst.executeUpdate()+ " Recored Upadate");
			
			ResultSet rs = pst.executeQuery("select * from tryTB");
			while(rs.next()) {
				System.out.println("ID : "+ rs.getInt(1) +"\nName : "+rs.getString(2) +"\nCity : "+ rs.getString(3));
			}
			
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
