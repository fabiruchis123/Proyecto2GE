/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Empleado;

import Controller.Controller;
import Model.Cliente.Cliente;
import Model.Empleado.Empleado;
import Model.Empleado.EmpleadoList;
import View.View;

/**
 *
 * @author maryc
 */
public class EmpleadoController implements Controller<Empleado>{
private EmpleadoList list;
private View view;

public EmpleadoController(View view){
    list=EmpleadoList.getInstance();
    this.view=view;
    
}
    @Override
    public void insert(Empleado obj) {
     if(obj.isComplete()){
      this.list.insert(obj);
      this.readAll();
  }else{
     this.view.displayErrorMessage("Faltan datos");
  }
    }

    @Override
    public void update(Empleado obj) {
    if (obj.isComplete()){
            this.list.update(obj);
            this.readAll();
        }else{
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Empleado obj) {
 if (this.list.delete(obj)){
            this.readAll();
        }else{
            this.view.displayErrorMessage("El miembro no se encuentra registrado");
        }
    }

    @Override
    public void read(Object id) {
   Empleado empleado=this.list.search(id);
        if (empleado!=null){
            this.view.display(empleado);
        }else{
            this.view.displayErrorMessage("El miembro buscado no se encuentra registrado");
        }
    
    }

    @Override
    public void readAll() {
  Empleado[] empleados=this.list.toArray();
        if (empleados.length>0){
            this.view.displayAll(empleados);
        }
    }
    
}
