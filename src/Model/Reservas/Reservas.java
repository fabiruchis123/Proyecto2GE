/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Reservas;

import Model.Cliente.Cliente;
import Model.Entity;
import Model.Habitaciones.Habitaciones;
import Model.Habitaciones.Role;
import java.time.LocalDate;

/**
 *
 * @author UTN
 */
public class Reservas implements Entity{
    
    private static int contnumero = 1;

    private int numero;
    private Cliente clienteCedula;
    private Cliente clienteNombre;
    private Role tipoHabitacion;
    private Habitaciones habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Estadoreserva estado;
    private double precioPorNoche;

    public Reservas(int numero, Cliente clienteCedula, Role tipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida, Estadoreserva estado, double precioPorNoche) {
        this.numero = contnumero++;
        this.clienteCedula = clienteCedula;
        this.clienteNombre = clienteNombre;
        this.tipoHabitacion = tipoHabitacion;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado.PENDIENTE;
        this.precioPorNoche = precioPorNoche;
    }

    public static int getContnumero() {
        return contnumero;
    }

    public static void setContnumero(int contnumero) {
        Reservas.contnumero = contnumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Cliente clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public Cliente getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(Cliente clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public Role getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(Role tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitaciones habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Estadoreserva getEstado() {
        return estado;
    }

    public void setEstado(Estadoreserva estado) {
        this.estado = estado;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    
     public double calPrecioTotal() {
        int duracionEstadia = (int) fechaEntrada.until(fechaSalida).getDays();
        return precioPorNoche * duracionEstadia;
    }

    @Override
    public String toString() {
        return "Reservas{" + "numero=" + numero + ", clienteCedula=" + clienteCedula + ", clienteNombre=" + clienteNombre + ", tipoHabitacion=" + tipoHabitacion + ", habitacion=" + habitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", estado=" + estado + ", precioPorNoche=" + precioPorNoche + '}';
    }

    @Override
    public boolean isComplete() {
      return this.numero != 0 && this.clienteCedula != null && this.clienteNombre != null && this.tipoHabitacion != Role.INDIVIDUAL.DOBLE.SUITE && this.habitacion != null && this.fechaEntrada != null && this.fechaSalida != null && this.estado != Estadoreserva.PENDIENTE.EN_EJECUCION.FINALIZADA.CANCELADA && this.precioPorNoche != 0.0;
    }

    @Override
    public Object[] toArrayObject() {
         return new Object[]{this.numero,this.clienteCedula,this.clienteNombre,this.tipoHabitacion,this.habitacion,this.fechaEntrada,this.fechaSalida,this.estado,this.precioPorNoche,this.toString()};
    }

    boolean add(Reservas reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
     
}
