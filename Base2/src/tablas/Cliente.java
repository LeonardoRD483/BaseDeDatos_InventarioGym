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
public class Cliente extends Persona {
    private int sucursal_id;
    private String f_entrada;
    private boolean permitido;

    public Cliente(int sucursal_id, String f_entrada, boolean permitido, String nombre, String apellidos, String fecha) {
        super(nombre, apellidos, fecha);
        this.sucursal_id = sucursal_id;
        this.f_entrada = f_entrada;
        this.permitido = permitido;
    }
    
    

    public Cliente() {
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }

    public String getF_entrada() {
        return f_entrada;
    }

    public void setF_entrada(String f_entrada) {
        this.f_entrada = f_entrada;
    }

    public boolean isPermitido() {
        return permitido;
    }

    public void setPermitido(boolean permitido) {
        this.permitido = permitido;
    }
    
    
}
