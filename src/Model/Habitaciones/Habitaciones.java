/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Habitaciones;

import Model.Entity;
import static Model.Habitaciones.Role.INDIVIDUAL;

/**
 *
 * @author UTN
 */
public class Habitaciones implements Entity {
    private int idHabitacion;
    private Role tipohabitacion;
    private boolean estado;
    private double precio;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Role getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(Role tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     public void ocuparHabitacion() {
        estado = true;
    }

    public void liberarHabitacion() {
        estado = false;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Habitaciones(int idHabitacion, Role tipohabitacion, boolean estado, double precio) {
        this.idHabitacion = idHabitacion;
        this.tipohabitacion = tipohabitacion;
        this.estado = estado;
        this.precio = preciosuge();
    }

    public Habitaciones(int idHabitacion) {
        this.idHabitacion = idHabitacion;
        this.tipohabitacion = INDIVIDUAL;
        this.estado = false;
        this.precio = 45000;
        
    }

    public Habitaciones(Role tipohabitacion) {
        this.idHabitacion = 0;
        this.tipohabitacion = tipohabitacion;
        this.estado = false;
        this.precio = 0;
    }
    

    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + ", tipohabitacion=" + tipohabitacion + ", estado=" + estado + ", precio=" + precio + '}';
    }
     private double preciosuge() {
        switch (tipohabitacion) {
            case INDIVIDUAL:
                return 45000;
            case DOBLE:
                return 80000;
            case SUITE:
                return 140000;
            default:
                return 0;
        }
    }

    @Override
    public boolean isComplete() {
      return this.getIdHabitacion() != 0 && this.tipohabitacion != Role.DOBLE.INDIVIDUAL.SUITE && this.estado && this.precio != 0.0;
    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.idHabitacion,this.tipohabitacion,this.estado,this.precio,this.toString()};
    }

   
     
}
