/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databasemidtermreq;



import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public static Connection connectDB() {
        try {
            
            String url = "jdbc:mysql://localhost:3306/midterm_req"; 
            String user = "root";
            String password = ""; 
            
            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Connection Error: " + e.getMessage());
            return null;
        }
    }
}