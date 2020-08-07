/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.ProductosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Producto;

/**
 *
 * @author eduardobaldivieso
 */
public class ProductosPsDao extends ProductosDao {

    @Override
    public Producto get(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        Producto p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos WHERE codigo_id = ?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerProducto(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public List<Producto> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Producto> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerProducto(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Producto p) {

        if (p.getCodigo() == 0) {
            insert(p);
        } else {
            update(p);
        }

    }

    @Override
    public void delete(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM productos WHERE codigo_id = ?");
            stmt.setString(1, id);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Producto leerProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setNombre(rs.getString("nombre"));
        p.setCodigo(rs.getInt("codigo_id"));
        p.setPrecio(rs.getFloat("precio"));

        return p;
    }

    private void insert(Producto p) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO productos VALUES(DEFAULT, ?,?)");
            stmt.setFloat(1, p.getPrecio());
            stmt.setString(2, p.getNombre());     
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void update(Producto p) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE productos SET nombre = ?, precio = ? WHERE codigo_id = ?");
            stmt.setString(1, p.getNombre());
            stmt.setFloat(2, p.getPrecio());
            stmt.setInt(3, p.getCodigo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
