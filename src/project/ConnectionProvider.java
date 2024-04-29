/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;


/**
 *
 * @author Yogesh KB
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","kbyogesh@01");
            return con;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
