/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.PersonaDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Persona;

/**
 *
 * @author eduardobaldivieso
 */
public class PersonaPsDao extends PersonaDao {

    @Override
    public Persona get(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Persona p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas WHERE codigo_id = ?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerPersona(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;

    }

    @Override
    public List<Persona> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Persona> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerPersona(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Persona p) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE personas SET nombre = ?, apellidos = ?, f_nacimiento = ? WHERE codigo_id = ?");            
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellidos());
            stmt.setDate(3, Date.valueOf(p.getFecha()));
            stmt.setString(4, p.getCodigo());
            stmt.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM personas WHERE codigo_id = ?");
            stmt.setString(1, id);
            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Persona leerPersona(ResultSet rs) throws SQLException {
        Persona p = new Persona();
        p.setNombre(rs.getString("nombre"));
        p.setApellidos(rs.getString("apellidos"));
        p.setFecha(rs.getDate("f_nacimiento").toString());
        p.setUsuario(rs.getString("n_usuario"));
        p.setContra(rs.getString("contra"));
        
        return p;
    }

}
