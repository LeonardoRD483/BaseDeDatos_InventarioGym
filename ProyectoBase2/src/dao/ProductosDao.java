/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Producto;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class ProductosDao {
    
    public abstract Producto get(String id);

    public abstract List<Producto> get();

    public abstract void save(Producto p);

    public abstract void delete(String id);
}
