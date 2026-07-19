import java.sql.*;
import java.io.*;

public class CRUD{

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Connected");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
            
            do {
                
                System.out.println("Enter 1 : Insert Data");
                System.out.println("Enter 2 : Update Data");
                System.out.println("Enter 3 : Delete Data");
                System.out.println("Enter 4 : Display Data");
                System.out.println("Enter 5 : EXIT");
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                System.out.println("Eneter Your Choice between 1-5 : ");
                int num = Integer.parseInt(br.readLine());
                
                switch(num) {
                    case 1:
                        insert();
                        PreparedStatement ps = con.prepareStatement("insert into demo values(?, ?, ?)");
                        
                        System.out.println("Enter ID : ");
                        int id = Integer.parseInt(br.readLine());
                        
                        System.out.println("Enter Name : ");
                        String name = br.readLine();
                        
                        System.out.println("Enter City Name : ");
                        String city = br.readLine();
                        
                        ps.setInt(1, id);;
                        ps.setString(2, name);
                        ps.setString(3, city);
                        
                        System.out.println(ps.executeUpdate()+ " Record Inserted");
                        break;
                        
                    case 2:
                        update();
                        PreparedStatement psup = con.prepareStatement("update demo set name=?, city=? where id=?");
                        
                        System.out.println("Enter name to Update : ");
                        String nameUp = br.readLine();
                        
                        System.out.println("Enter City Name To update : ");
                        String cityUp = br.readLine();
                        
                        System.out.println("Enter Id Where To Update : ");
                        int idUp = Integer.parseInt(br.readLine());
                        
                        psup.setString(1, nameUp);
                        psup.setString(2, cityUp);
                        psup.setInt(3, idUp);
                        
                        System.out.println(psup.executeUpdate()+ " Record Updated");
                        break;
                        
                    case 3:
                        delet();
                        PreparedStatement pDel = con.prepareStatement("delete from demo where id=?");
                        
                        System.out.println("Enter Id for delete Record : ");
                        int idDel = Integer.parseInt(br.readLine());
                        
                        pDel.setInt(1, idDel);
                        
                        System.out.println(pDel.executeUpdate()+ " Record Deleted");
                        break;
                        
                    case 4:
                        showdata();
                        PreparedStatement pshow = con.prepareStatement("select * from demo");
                        ResultSet rs = pshow.executeQuery();
                        
                        while(rs.next()) {
                            System.out.println("ID : "+ rs.getInt(1)+ " Name : "+ rs.getString(2)+ " City : "+ rs.getString(3));
                        }
                        break;
                        
                    case 5:
                        System.out.println("EXIT");
                        break;
                        
                    default:
                        System.out.print("Please Enter Valid Choice");
                        break;
                }
                
                System.out.print("Do you Want to Coninue y/n : ");
                String yn = br.readLine();
                if(yn.startsWith("n")) {
                    System.out.println("Thank You...!");
                    break;
                }
            }while(true);
            con.close();
            
        }
            catch(Exception e) {
                System.out.println(e);
        }

    }
        public static void insert() {
            System.out.println("Add Data into Database");
            
        }
        
        public static void update() {
            System.out.println("Update Data into Database");
            return ;
        }
        
        public static void delet() {
            System.out.println("Delete Data from Database");
        }
        
        public static void showdata() {
            System.out.println("Show");
        }
}
