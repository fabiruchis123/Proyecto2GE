/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Servicio;

import java.util.ArrayList;

/**
 *
 * @author UTN
 */
public class AdministraciondeServicios {
    
    private ArrayList<Servicio> serviciosList = new ArrayList<>();

    public void agregarServicio(String nombre, String descripcion, double precio) {
        Servicio nuevoServicio = new Servicio(nombre, descripcion, precio);
        serviciosList.add(nuevoServicio);
    }
    
     public void actualizarServicio(int codigo, String nuevaDescripcion, double nuevoPrecio) {
        for (Servicio servicio : serviciosList) {
            if (servicio.getCodigo() == codigo) {
                servicio.setDescripcion(nuevaDescripcion);
                servicio.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    public void eliminarServicio(int codigo) {
        serviciosList.removeIf(servicio -> servicio.getCodigo() == codigo);
    }
    public void mostrarServicios() {
        for (Servicio servicio : serviciosList) {
            System.out.println(servicio);
        }
    }
    
}
