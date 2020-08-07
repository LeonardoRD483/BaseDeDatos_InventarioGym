/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobase2;


import Conexion.Queries;
import dao.*;
import java.sql.SQLException;
import tablas.*;

/**
 *
 * @author eduardobaldivieso
 */
public class ProyectoBase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        FactoryDao factory = FactoryDao.getFactory();
        Queries q = new Queries();
        PersonaDao cdao = factory.getPersonaDao();
         System.out.println(q.getFecha());
        
    }
    
}
