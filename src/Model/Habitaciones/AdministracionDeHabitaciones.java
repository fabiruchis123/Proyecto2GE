/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Habitaciones;

import java.util.ArrayList;

/**
 *
 * @author UTN
 */
public class AdministracionDeHabitaciones {
      private ArrayList<Habitaciones> habitacionesList = new ArrayList<>();

    public void agregarHabitacion(int idhabitacion, Role tipohabitacion, boolean estado, double precio) {
        Habitaciones nuevaHabitacion = new Habitaciones(idhabitacion, tipohabitacion, estado, precio);
        habitacionesList.add(nuevaHabitacion);
    }

      public void actualizarTipoHabitacion(int idhabitacion, Role nuevoTipo) {
        Habitaciones habitacion = buscarHabitacionPorId(idhabitacion);
        if (habitacion != null) {
            habitacion.setTipohabitacion(nuevoTipo);
        }
    }

    public void eliminarHabitacion(int idhabitacion) throws Exception {
        Habitaciones habitacion = buscarHabitacionPorId(idhabitacion);
        if (habitacion != null) {
            if (habitacion.isEstado()) {
                throw new Exception("No se puede eliminar una habitación ocupada.");
            } else {
                habitacionesList.remove(habitacion);
            }
        }
    }
    public Habitaciones buscarHabitacionPorId(int idhabitacion) {
        for (Habitaciones habitacion : habitacionesList) {
            if (habitacion.getIdHabitacion()== idhabitacion) {
                return habitacion;
            }
        }
        return null;
    }
}
