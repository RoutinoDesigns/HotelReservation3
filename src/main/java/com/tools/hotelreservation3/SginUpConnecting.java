/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tools.hotelreservation3;

/**
 *
 * @author Murtada
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class SginUpConnecting {
    Connection c;
    public static Connection ConnectDb() {
        try{
            Class.forName("org.sqlite.JDBC")
                    Connection c = DriverManager.getConnection("C:\\Users\\Murtada\\Desktop\\HotelReservation3\\HRS.sqlite");
                    return c;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
