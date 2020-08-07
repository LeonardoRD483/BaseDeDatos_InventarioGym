/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Cliente;
import tablas.Empleado;

/**
 *
 * @author eduardobaldivieso
 */
public class Queries {

    public String getFechaActual() throws SQLException {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select now()");
        String rest = "";
        if (rs.next()) {
            rest += rs.getDate(1);
        }
        return rest;
    }

    public String encriptarPass(String pass) throws SQLException {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        PreparedStatement stmt = conn.prepareStatement("Select encriptar_pass(?)");
        stmt.setString(1, pass);
        ResultSet rs = stmt.executeQuery();
        String rest = "";
        if (rs.next()) {
            rest = rs.getString(1);
        }
        return rest;
    }

    public void insertar_actualizar_empleado(Empleado e) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
//ins_upd_empleado(fecha_nac date, snombre text, sapellido text,
        //	 carnet text,surcusal int,labor text,Salario decimal(9,2))
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT ins_upd_empleado(?,?,?,?,?,?,?)");
            
            stmt.setString(1, e.getFecha());
            stmt.setString(2, e.getNombre());
            stmt.setString(3, e.getApellidos());
            stmt.setString(4, e.getCi());
            stmt.setInt(5, e.getSucursal_id());
            stmt.setString(6, e.getDesc_labor());
            stmt.setDouble(7, e.getSalario());
            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar_actualizar_cliente(Cliente e) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        
//iins_upd_persona(fecha_nac date, snombre text, sapellido text,
        //carnet text,surcusal int,permitido boolean)
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT ins_upd_cliente(?,?,?,?,?,?)");
            
            stmt.setString(1, e.getFecha().toString());
            stmt.setString(2, e.getNombre());
            stmt.setString(3, e.getApellidos());
            stmt.setString(4, e.getCi());
            stmt.setInt(5, e.getSucursal_id());
            stmt.setBoolean(6, e.isPermitido());

            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
