/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Habitaciones;

import Controller.Controller;
import Model.Habitaciones.HabitacionList;
import Model.Habitaciones.Habitaciones;
import View.View;

/**
 *
 * @author UTN
 */
public class HabitacionesController implements Controller<Habitaciones>{
    
    private HabitacionList list;
    private View view;

    public HabitacionesController(View view) {
        list = HabitacionList.getInstance();
        this.view = view;
    }
    
    @Override
    public void insert(Habitaciones obj) {
          if (obj.isComplete()) {
            this.list.insert(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void update(Habitaciones obj) {
        if (obj.isComplete()) {
            this.list.update(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Habitaciones obj) {
         if (this.list.delete(obj)) {
            this.readAll();
        } else {
            this.view.displayErrorMessage("La Tarea no se encuentra registrada");
        }
    }

    @Override
    public void read(Object id) {
        Habitaciones hab = this.list.search(id);
        if (hab != null) {
            this.view.display(hab);
        } else {
            this.view.displayErrorMessage("La habitacion no se encuentra");
        }
    }

    @Override
    public void readAll() {
          Habitaciones[] habs = this.list.toArray();
        if (habs.length > 0) {
            this.view.displayAll(habs);
        }
    }
}
