/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Iliyas
 */
public class MysqlConnect {
    Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;

    public static Connection connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_reservation","root","");
           // JOptionPane.showMessageDialog(null,"Connected to Database");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
