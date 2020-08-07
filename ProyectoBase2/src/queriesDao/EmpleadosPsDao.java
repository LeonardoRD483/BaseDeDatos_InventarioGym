/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesDao;

import Conexion.Conexion;
import dao.EmpleadosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Empleado;

/**
 *
 * @author eduardobaldivieso
 */
public class EmpleadosPsDao extends EmpleadosDao {

    @Override
    public Empleado get(String id) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        Empleado p = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas NATURAL JOIN empleados WHERE codigo_id = ?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = leerEmpleado(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public List<Empleado> get() {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();
        List<Empleado> list = new ArrayList();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas NATURAL JOIN empleados ");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(leerEmpleado(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void save(Empleado e) {
        Conexion ps = Conexion.getOrCreate();
        Connection conn = ps.getConn();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE personas SET nombre = ?,apellidos = ?,f_nacimiento = ?  WHERE codigo_id = ?");
            stmt.setString(1, e.getCodigo());
            stmt.setString(2, e.getApellidos());
            stmt.setString(3, e.getFecha());
            stmt.setString(4,e.getCodigo());
            stmt.executeQuery();

            stmt = conn.prepareStatement("UPDATE clientes SET sucursal_id = ?, permitido = ? WHERE codigo _id = ?");
            stmt.setInt(1, e.getSucursal_id());
            stmt.setString(2, e.getDesc_labor());
            stmt.setString(3,e.getCodigo());
            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosPsDao.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EmpleadosPsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Empleado leerEmpleado(ResultSet rs) throws SQLException {
        Empleado e = new Empleado();
        e.setCodigo(rs.getString("codigo_id"));
        e.setNombre(rs.getString("nombre"));
        e.setApellidos(rs.getString("apellidos"));
        e.setFecha(rs.getString("f_nacimiento"));
        e.setUsuario(rs.getString("n_usuario"));
        e.setContra(rs.getString("contra"));
        e.setDesc_labor(rs.getString("desc_labor"));
        e.setSucursal_id(rs.getInt("sucursal_id"));
        e.setSalario(rs.getFloat("salario"));
        
        return e;
    }

}
