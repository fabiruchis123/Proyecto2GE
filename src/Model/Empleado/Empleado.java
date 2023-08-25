/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Empleado;

import Model.Entity;

/**
 *
 * @author maryc
 */
public class Empleado implements Entity{
private String identificacion;
    private String nombre;
    private String telefono;
    private String puesto;
    private int salario;
    private Role role;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public Empleado(String identificacion, String telefono1, String puesto1) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = salario;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Empleado{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", telefono=" + telefono + ", puesto=" + puesto + ", salario=" + salario + ", role=" + role + '}';
    }
    
    
    @Override
    public boolean isComplete() {
         return !this.identificacion.equals("") && !this.nombre.equals("") && !this.telefono.equals("") && !this.puesto.equals("");
   }

    @Override
    public Object[] toArrayObject() {
     return new Object[]{this.identificacion, this.nombre, this.telefono, this.puesto, this.salario,this.role, this.toString()};
    }
    public double CalcularSalario(Empleado empleado){
        switch(empleado.puesto.toLowerCase()){
            case "recepcionista":
                return 800000;
            case "gerente":
                return 1400000;
            case "conserje":
                return 550000;
            case "supervisor":
                return 1100000;
            case "mantenimiento":
                return 650000;
            default:
                return 0;
        }
    }
}
