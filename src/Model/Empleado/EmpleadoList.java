/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Empleado;

import Model.List;
import java.util.HashMap;

/**
 *
 * @author maryc
 */
public class EmpleadoList implements List<Empleado> {
private static EmpleadoList empleadoList;
public static EmpleadoList getInstance(){
    if(empleadoList==null){
        empleadoList= new EmpleadoList();
    }
    return empleadoList;
}
HashMap <String,Empleado> empleados;
private EmpleadoList(){
    this.empleados= new HashMap<>();
}
    @Override
    public boolean insert(Empleado obj) {
   this.empleados.put(obj.getIdentificacion(), obj);
    return true;
    }

    @Override
    public boolean update(Empleado obj) {
    return this.insert(obj);
    }

    @Override
    public boolean delete(Empleado obj) {
  obj= this.search(obj.getIdentificacion());
    return this.empleados.remove(obj.getIdentificacion(), obj);
    }

    @Override
    public Empleado search(Object id) {
   return this.empleados.get(id.toString());
    }

    @Override
    public Empleado[] toArray() {
    return this.empleados.values().toArray(new Empleado[0]);
    }
    
}
