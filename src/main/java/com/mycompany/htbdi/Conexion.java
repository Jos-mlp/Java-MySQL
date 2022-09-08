/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.htbdi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    Connection connection = null;
    Integer levelS=2;
    public Connection getConnection(){
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/trans?autoReconnect=true&useSSL=false","root","12345");
           connection.setTransactionIsolation(levelS);
           
            if(connection != null){
                System.out.println("Se realizo la conexión");
               
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
    public void Sesion(Integer nivel) throws SQLException
    {
        levelS=nivel;
    }
    public void VSesion()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/trans?autoReconnect=true&useSSL=false","root","12345");
            connection.setTransactionIsolation(levelS);
            connection.getTransactionIsolation();
            int resp=connection.getTransactionIsolation();
            
            switch (resp)
            {
                case 1:
                    Dialogo("READ-UNCOMMITTED");
                    break;
                case 2:
                    Dialogo("READ-COMMITTED");
                    break;
                case 4:
                    Dialogo("REPEATABLE-READ");
                    break;
                case 8:
                    Dialogo("SERIALIZABLE");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ha surgido un Error", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Dialogo(String Mensaje)
    {
        JOptionPane.showMessageDialog(null, "Tu tipo de Sesion es "+Mensaje);
    }
}
