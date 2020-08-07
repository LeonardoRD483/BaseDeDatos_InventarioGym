/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author eduardobaldivieso
 */
public class Queries {
    public String getFecha() throws SQLException{
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select now()");
        String rest = "";
        if(rs.next()){
            rest += rs.getDate(1); 
        }
        return rest;
    }
}
