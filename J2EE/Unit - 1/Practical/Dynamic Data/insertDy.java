import java.sql.*;
import java.io.*;

// Dynamicaly insert Data into DB using JDBC
public class insertDy {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
            System.out.println("Driver Connected");
            
            PreparedStatement pst = con.prepareStatement("insert into demo values(?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            
            System.out.println("Enter ID : ");
            int id = Integer.parseInt(br.readLine());
            
            System.out.println("Enetr Name : ");
            String name = br.readLine();
            
            System.out.println("Enetr City : ");
            String city = br.readLine();
            
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, city);
            
            System.out.println(pst.executeUpdate()+"Reccord Inserted");
            
            ResultSet rs = pst.executeQuery("select * from demo");
            while(rs.next()) {
                System.out.println("ID : "+ rs.getInt(1)+ "\nName : "+ rs.getString(2)+ "\nCity : " +rs.getString(3));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}