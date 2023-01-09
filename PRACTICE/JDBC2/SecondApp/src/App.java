import java.sql.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       try{
        Class.forName("com.mysql.jdbc.Driver");
        String x="jdbc:mysql://localhost/APPDEV2";
        String y="JOSHUA";
        String z="Joshua2003";
        Properties pro=new Properties();
        pro.put("user",y);
        pro.put("password",z);
        Connection asht=DriverManager.getConnection(x,pro);
        System.out.println("Connection successful");
        Statement state=asht.createStatement();
        String qry1="CREATE DATABASE UNIVERSITY2";
        state.execute(qry1);
       }
       catch(ClassNotFoundException e){
        System.out.println("Driver not found"+ e.getMessage());
       }
    }
}
