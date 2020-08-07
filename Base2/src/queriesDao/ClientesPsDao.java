/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.ClientesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Cliente;

/**
 *
 * @author eduardobaldivieso
 */
public class ClientesPsDao extends ClientesDao {

    @Override
    public Cliente get(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        Cliente p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas NATURAL JOIN clientes WHERE codigo_id = ?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerCliente(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientesPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public List<Cliente> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Cliente> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas NATURAL JOIN clientes ");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerCliente(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientesPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Cliente c) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE personas SET nombre = ?,apellidos = ?,f_nacimiento = ?  WHERE codigo_id = ?");
            stmt.setString(1, c.getCodigo());
            stmt.setString(2, c.getApellidos());
            stmt.setString(3, c.getFecha());
            stmt.setString(4, c.getCodigo());
            stmt.executeQuery();

            stmt = conn.prepareStatement("UPDATE clientes SET sucursal_id = ?, permitido = ? WHERE codigo_id = ?");
            stmt.setInt(1, c.getSucursal_id());
            stmt.setBoolean(2, c.isPermitido());
            stmt.setString(3, c.getCodigo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClientesPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM personas WHERE codigo_id = ?");
            stmt.setString(1, id);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClientesPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Cliente leerCliente(ResultSet rs) throws SQLException {
        Cliente c = new Cliente();
        c.setCodigo(rs.getString("codigo_id"));
        c.setNombre(rs.getString("nombre"));
        c.setApellidos(rs.getString("apellidos"));
        c.setFecha(rs.getString("f_nacimiento"));
        c.setUsuario(rs.getString("n_usuario"));
        c.setContra(rs.getString("contra"));
        c.setF_entrada(rs.getString("f_entrada"));
        c.setSucursal_id(rs.getInt("sucursal_id"));
        c.setPermitido(rs.getBoolean("permitido"));
        
        return c;
    }

}
