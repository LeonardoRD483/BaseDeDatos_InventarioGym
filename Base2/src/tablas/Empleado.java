/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Date;

/**
 *
 * @author eduardobaldivieso
 */
public class Empleado extends Persona{
    private String desc_labor;
    private int sucursal_id;
    private double salario;

    public Empleado() {
    }

    public Empleado(String desc_labor, int sucursal_id, float salario, String nombre, String apellidos, String fecha) {
        super(nombre, apellidos, fecha);
        this.desc_labor = desc_labor;
        this.sucursal_id = sucursal_id;
        this.salario = salario;
    }

    public String getDesc_labor() {
        return desc_labor;
    }

    public void setDesc_labor(String desc_labor) {
        this.desc_labor = desc_labor;
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
