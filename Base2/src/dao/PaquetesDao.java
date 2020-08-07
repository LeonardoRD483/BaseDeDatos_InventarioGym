/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Paquete;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class PaquetesDao {

    public abstract Paquete get(String id);

    public abstract List<Paquete> get();

    public abstract void save(Paquete p);

    public abstract void delete(String id);
}
