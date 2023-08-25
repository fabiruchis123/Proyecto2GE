/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Habitaciones;

import Model.List;
import java.util.ArrayList;

/**
 *
 * @author UTN
 */
public class HabitacionList implements List<Habitaciones>{
    private static HabitacionList habitacionlist;
    
  public static HabitacionList getInstance(){
    if (habitacionlist==null){
        habitacionlist= new HabitacionList();
    }
    return habitacionlist;
}
      private ArrayList<Habitaciones> arrayhabitaciones = new ArrayList<>();

    @Override
    public boolean insert(Habitaciones obj) {
      this.arrayhabitaciones.add(obj.getIdHabitacion(),obj);
        return true;
    }

    @Override
    public boolean update(Habitaciones obj) {
        for (int i = 0; i < arrayhabitaciones.size(); i++) {
        Habitaciones habitacion = arrayhabitaciones.get(i);
        if (habitacion.getTipohabitacion().equals(obj.getTipohabitacion())) {
            habitacion.setTipohabitacion(obj.getTipohabitacion());
            arrayhabitaciones.set(i, obj); 
            return true; 
        }
    }
    return false;
    }

    @Override
    public boolean delete(Habitaciones obj) {
         return arrayhabitaciones.remove(obj);
    }

    @Override
    public Habitaciones search(Object id) {
        for (Habitaciones habitacion : arrayhabitaciones) {
        if (id instanceof Integer && habitacion.getIdHabitacion() == (int) id) {
            return habitacion;
        } 
    }
    return null;
    }

    @Override
    public Habitaciones[] toArray() {
       return this.arrayhabitaciones.toArray(new Habitaciones[0]);
    }
}
