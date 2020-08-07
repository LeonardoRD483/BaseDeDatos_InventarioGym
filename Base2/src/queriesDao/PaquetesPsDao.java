/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.PaquetesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Paquete;

/**
 *
 * @author eduardobaldivieso
 */
public class PaquetesPsDao extends PaquetesDao {

    @Override
    public Paquete get(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Paquete p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM paquetes WHERE codigo_id = ?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerPaquete(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public List<Paquete> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Paquete> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerPaquete(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Paquete p) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE paquetes SET nombre = ?, precio = ?, descripcion = ? WHERE codigo_id = ?");

            stmt.setString(1, p.getNombre());
            stmt.setFloat(2, p.getPrecio());
            stmt.setString(3, p.getDescripcion());
            stmt.setInt(4, p.getCodigo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM paquetes WHERE codigo_id = ?");
            stmt.setString(1, id);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Paquete leerPaquete(ResultSet rs) throws SQLException {
            Paquete p = new Paquete();
            p.setCodigo(rs.getInt("codigo_id"));
            p.setNombre(rs.getString("nombre"));
            p.setPrecio(rs.getFloat("precio"));
            p.setDescripcion(rs.getString("descripcion"));
            return p;
    }

}
