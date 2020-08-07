/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.SucursalesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import tablas.Sucursal;

/**
 *
 * @author eduardobaldivieso
 */
public class SucursalesPsDao extends SucursalesDao {

    @Override
    public Sucursal get(int id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Sucursal p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sucursales WHERE codigo_id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerSucursal(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public List<Sucursal> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Sucursal> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sucursales");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerSucursal(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Sucursal s) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Sucursal p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE sucursales SET nombre = ?, direccion = ?  WHERE codigo_id = ?");
            stmt.setString(1, s.getNombre());
            stmt.setString(2, s.getDireccion());
            stmt.setInt(3, s.getCodigo());
            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM sucursales WHERE codigo_id = ?");
            stmt.setInt(1, id);
            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Sucursal leerSucursal(ResultSet rs) throws SQLException {
        Sucursal p = new Sucursal();
        p.setCodigo(rs.getInt("codigo_id"));
        p.setNombre(rs.getString("nombre"));
        p.setDireccion(rs.getString("direccion"));

        return p;
    }

}
