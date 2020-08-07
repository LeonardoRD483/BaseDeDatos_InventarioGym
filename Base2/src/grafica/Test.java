/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import Conexion.Queries;
import java.sql.Date;
import java.sql.SQLException;
import tablas.Cliente;
import tablas.Empleado;

/**
 *
 * @author eduardobaldivieso
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Queries q = new Queries();
        Empleado e = new Empleado();
        e.setNombre("Teasdf");
        e.setApellidos("Trosito");
        e.setDesc_labor("Flojonaso!");
        e.setSalario(1235.41);
        e.setSucursal_id(1);
        e.setCi("859424");
        e.setFecha("19971001");
        //e.setPermitido(false);
        
        q.insertar_actualizar_empleado(e);
        
    }
    
}
