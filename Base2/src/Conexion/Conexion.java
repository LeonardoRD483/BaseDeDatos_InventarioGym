/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * local : "jdbc:postgresql://localhost:5432/gym_de_cania?user=postgres&password=1234&useSSL=false&allowPublicKeyRetrieval=true";
 * @author eduardobaldivieso
 */
public class Conexion {
    private final String url = "jdbc:postgresql://localhost/gym_de_cania?user=postgres&password=1234&useSSL=false&allowPublicKeyRetrieval=true";
    private Connection conn ;
    
    private static Conexion singleCon = null;
    
    public static Conexion getOrCreate(){
        try {
            if(singleCon == null || singleCon.conn.isClosed()){
                singleCon = new Conexion();
            }
        } catch (SQLException ex) {
            singleCon = new Conexion();
        }
        return singleCon;
    }
    
    private Conexion(){
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    
}
