/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Servicio;

/**
 *
 * @author UTN
 */
public class Servicio {
    
    private static int codigoauto = 1;
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
     public Servicio(String nombre, String descripcion, double precio) {
        this.codigo = codigoauto++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static int getCodigoauto() {
        return codigoauto;
    }

    public static void setCodigoauto(int codigoauto) {
        Servicio.codigoauto = codigoauto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}
