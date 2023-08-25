/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Servicio;

import Model.List;
import java.util.ArrayList;

/**
 *
 * @author UTN
 */
public class ServiciosList implements List<Servicio> {

    
       private ArrayList<Servicio> arrayservicios = new ArrayList<>();
      private static ServiciosList servicioslist;
  
    public static ServiciosList getInstance(){
    if (servicioslist==null){
        servicioslist= new ServiciosList();
    }
    return servicioslist;
}
    @Override
    public boolean insert(Servicio obj) {
        this.arrayservicios.add(obj.getCodigo(),obj);
        return true;
    }

    @Override
    public boolean update(Servicio obj) {
       for (int i = 0; i < arrayservicios.size(); i++) {
        Servicio servicio = arrayservicios.get(i);
        if (servicio.getDescripcion().equals(obj.getDescripcion())) {
            servicio.setDescripcion(obj.getDescripcion());
            servicio.setPrecio(obj.getPrecio());
            return true; 
        }
    }
    return false;
}

    @Override
    public boolean delete(Servicio obj) {
        return arrayservicios.remove(obj);
    }

    @Override
    public Servicio search(Object id) {
         for (Servicio servicios : arrayservicios) {
        if (id instanceof Integer && servicios.getCodigo() == (int) id) {
            return servicios;
        } 
    }
    return null;
    }

    @Override
    public Servicio[] toArray() {
    return this.arrayservicios.toArray(new Servicio[0]);    
    }
    
}
