/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Reservas;

import Model.Cliente.Cliente;
import Model.Habitaciones.Role;
import Model.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author UTN
 */
public class ReservaList implements List<Reservas>{
    private static ReservaList reservalist;
    
  public static ReservaList getInstance(){
    if (reservalist==null){
        reservalist= new ReservaList();
    }
    return reservalist;
}

    
    private ArrayList<Reservas> arrayreserva;

    public ReservaList() {
        arrayreserva = new ArrayList<>();
    }
    
    @Override
    public boolean insert(Reservas obj) {
        this.arrayreserva.add(obj);
        return true;
    }

    @Override
    public boolean update(Reservas obj) {
         int index = arrayreserva.indexOf(obj);
        if (index != -1) {
            arrayreserva.set(index, obj);
            System.out.println("Reserva actualizada: " + obj);
        } else {
            System.out.println("Reserva no encontrada, no se puede actualizar.");
        }
    return false;
    }

    @Override
    public boolean delete(Reservas obj) {
        this.arrayreserva.remove(obj);
        return true;
    }

    @Override
    public Reservas search(Object id) {
        for (Reservas reser : arrayreserva) {
        if (id instanceof Integer && reser.getNumero() == (int) id) {
            return reser;
        } 
    }
    return null;
    }

    @Override
    public Reservas[] toArray() {
        return this.arrayreserva.toArray(new Reservas[0]);
    }
     public void cancelar(Reservas reserva) {
        if (reserva.getEstado() == Estadoreserva.PENDIENTE) {
            reserva.setEstado(Estadoreserva.CANCELADA);
            
            System.out.println("Reserva cancelada: " + reserva);
        } else {
            System.out.println("La reserva no se puede cancelar.");
        }
    }
     public void finalizar(Reservas reserva) {
        if (reserva.getEstado() == Estadoreserva.EN_EJECUCION) {
            reserva.setEstado(Estadoreserva.FINALIZADA);
            System.out.println("Reserva finalizada: " + reserva);
        } else {
            System.out.println("La reserva no se puede finalizar.");
        }
    }
         public void activar(Reservas reserva) {
        if (reserva.getEstado() == Estadoreserva.PENDIENTE) {
            reserva.setEstado(Estadoreserva.EN_EJECUCION);
            // Marcar la habitación como no disponible.
            System.out.println("Reserva activada: " + reserva);
        } else {
            System.out.println("La reserva no se puede activar.");
        }
    }
      public boolean reservar(int numero, Cliente cliente, Role tipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
       if (verificarDisponibilidad(tipoHabitacion, fechaEntrada, fechaSalida)) {
        long duracionEstadia = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);

        double precioTotal = tipoHabitacion.getPrecioPorNoche() * duracionEstadia;

        Reservas reserva = new Reservas(numero, cliente, tipoHabitacion, fechaEntrada, fechaSalida, Estadoreserva.PENDIENTE, precioTotal);
        return reserva.add(reserva);
    } else {
        System.out.println("La habitación no está disponible para las fechas especificadas.");
        return false;
    }
      }
      private boolean verificarDisponibilidad(Role tipoHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        for (Reservas reserva : arrayreserva) {
        if (reserva.getTipoHabitacion() == tipoHabitacion &&
            !fechaSalida.isBefore(reserva.getFechaEntrada()) &&
            !fechaEntrada.isAfter(reserva.getFechaSalida())) {
            return false; 
        }
    }
    return true;
    }
}
