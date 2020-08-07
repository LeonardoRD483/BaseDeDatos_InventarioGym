/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class FactoryDao {
    public static FactoryDao getFactory() {
        return new FactoryPsDao();
    }

    public abstract PersonaDao getPersonaDao();
    public abstract PaquetesDao getPaquetesDao();
    public abstract ProductosDao getProductosDao();
    public abstract SucursalesDao getSucursalesDao();
    public abstract ClientesDao getClientesDao();
    public abstract EmpleadosDao getEmpleadosDao();
}
