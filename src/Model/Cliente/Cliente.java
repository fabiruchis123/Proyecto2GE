/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

import Model.Entity;


public class Cliente implements Entity {
private String identificacion;
private String nombre;
private String fechaNacimiento;
private String telefono;
private String correo; 

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente(String identificacion, String nombre, String fechaNacimiento, String telefono, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cliente(String identificacion) {
        this.identificacion = identificacion;
        this.nombre = "";
        this.fechaNacimiento= "";
        this.telefono = "";
        this.correo = "";
                
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correo=" + correo + '}';
    }



    @Override
    public boolean isComplete() {
    return !this.identificacion.equals("") && !this.nombre.equals("") && !this.fechaNacimiento.equals("") && !this.telefono.equals("") && !this.correo.equals("");
    }

    @Override
    public Object[] toArrayObject() {
   return new Object[]{ this.identificacion,this.nombre,this.fechaNacimiento,this.telefono,this.correo,this.toString()}; 
    }
    
}
