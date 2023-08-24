/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Habitaciones;

/**
 *
 * @author UTN
 */
public class Habitaciones {
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

    public boolean isEstado() {
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
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idHabitacion=" + idHabitacion + ", tipohabitacion=" + tipohabitacion + ", estado=" + estado + ", precio=" + precio + '}';
    }
    
}
