/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connections;

import java.sql.*;

/**
 *
 * @author hoep
 */
public class ConnectDB {
    
    public static Connection getConnection() {
        final String username = "sa";
        final String password = "123";
        
        final String url = "jdbc:sqlserver://DESKTOP-42IL4C3:1433;"
                + "databaseName=btl_java_quanlynhadat;"
                + "encrypt=true;trustServerCertificate=true;"
                + "user=" + username 
                + ";password=" + password;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connect database success!");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return null;
    }
    
}
