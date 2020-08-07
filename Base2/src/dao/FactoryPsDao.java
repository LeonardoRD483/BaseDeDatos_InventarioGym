/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import queriesDao.ClientesPsDao;
import queriesDao.EmpleadosPsDao;
import queriesDao.PaquetesPsDao;
import queriesDao.PersonaPsDao;
import queriesDao.ProductosPsDao;
import queriesDao.SucursalesPsDao;

/**
 *
 * @author eduardobaldivieso
 */
public class FactoryPsDao extends FactoryDao{

    @Override
    public PersonaDao getPersonaDao() {
        return new PersonaPsDao();
    }

    @Override
    public PaquetesDao getPaquetesDao() {
        return new PaquetesPsDao();
    }
    
    @Override
    public ProductosDao getProductosDao(){
        return new ProductosPsDao();
    }

    @Override
    public SucursalesDao getSucursalesDao() {
        return new SucursalesPsDao();
    }

    @Override
    public ClientesDao getClientesDao() {
        return new ClientesPsDao();
    }

    @Override
    public EmpleadosDao getEmpleadosDao() {
        return new EmpleadosPsDao();
    }
    
}
