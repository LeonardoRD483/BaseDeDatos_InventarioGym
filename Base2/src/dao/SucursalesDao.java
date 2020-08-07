/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Sucursal;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class SucursalesDao {
    
    public abstract Sucursal get(int id);

    public abstract List<Sucursal> get();

    public abstract void save(Sucursal s);

    public abstract void delete(int id);
}
