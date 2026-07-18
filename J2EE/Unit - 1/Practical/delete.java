import java.sql.*;

public class update {

        public static void main(String[] args) {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");

                        PreparedStatement pst = con.prepareStatement("delete from tryTB where id=?");

                        pst.setInt(1, 1);        // id

                        System.out.println(pst.executeUpdate()+ " Recored Delete");

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