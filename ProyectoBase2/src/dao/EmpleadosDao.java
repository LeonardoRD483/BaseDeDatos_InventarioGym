/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Empleado;

/**
 *
 * @author Cordova
 */
public abstract class EmpleadosDao {
    public abstract Empleado get(String id);

    public abstract List<Empleado> get();

    public abstract void save(Empleado e);

    public abstract void delete(String id);
}
