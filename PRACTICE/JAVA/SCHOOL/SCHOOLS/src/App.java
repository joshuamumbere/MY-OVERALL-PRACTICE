import java.sql.*;
public class App {
    public static void main(String[] args){
        // System.out.println("Hello, World!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://127.0.0.1/Scholar?user=MASAMBA&password=Masamba2003";
            System.out.println("Database connection successful");
            Connection con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to register Driver "+ e.getMessage());}
            catch (SQLException e) {
                System.out.println("Database connection error"+ e.getMessage());
                                     }
                    }
        
    }

