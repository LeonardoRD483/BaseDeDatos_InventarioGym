/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author eduardobaldivieso
 */
public class Producto {
    private int codigo;
    private String nombre;
    private float precio;

    public Producto(String nombre, float precio) {
        this.codigo = 0;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

  
    
    
}
