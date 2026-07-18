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
                        break;
                        
                    case 2:
                        update();
                        break;
                        
                    case 3:
                        delet();
                        break;
                        
                    case 4:
                        showdata();
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
