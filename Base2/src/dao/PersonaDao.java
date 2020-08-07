/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import tablas.Persona;

/**
 *
 * @author eduardobaldivieso
 */
public abstract class PersonaDao {

    public abstract Persona get(String id);

    public abstract List<Persona> get();

    public abstract void save(Persona p);

    public abstract void delete(String id);
}
