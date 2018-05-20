/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tools.hotelreservation3;

/**
 *
 * @author Marouane
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class jconnection {
    
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hisham\\Desktop\\ELTE\\NewSem2\\ToolsOfSoftware\\HotelReservation3\\HRS.sqlite");
            return c;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
