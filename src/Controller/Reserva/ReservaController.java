/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Reserva;

import Controller.Controller;
import Model.Reservas.ReservaList;
import Model.Reservas.Reservas;
import View.View;

/**
 *
 * @author UTN
 */
public class ReservaController implements Controller<Reservas>{
    
     private ReservaList list;
    private View view;

    public ReservaController(View view) {
        list = ReservaList.getInstance();
        this.view = view;
    }
    
    @Override
    public void insert(Reservas obj) {
              if (obj.isComplete()) {
            this.list.insert(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void update(Reservas obj) {
        if (obj.isComplete()) {
            this.list.update(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Reservas obj) {
        if (this.list.delete(obj)) {
            this.readAll();
        } else {
            this.view.displayErrorMessage("La Tarea no se encuentra registrada");
        }
    }

    @Override
    public void read(Object id) {
            Reservas reser = this.list.search(id);
        if (reser != null) {
            this.view.display(reser);
        } else {
            this.view.displayErrorMessage("La habitacion no se encuentra");
        }
    }

    @Override
    public void readAll() {
             Reservas[] resers = this.list.toArray();
        if (resers.length > 0) {
            this.view.displayAll(resers);
        }
    }
}
