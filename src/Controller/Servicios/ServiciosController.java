/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Servicios;

import Controller.Controller;
import Model.Servicio.Servicio;
import Model.Servicio.ServiciosList;
import View.View;

public class ServiciosController implements Controller<Servicio>{

    private ServiciosList list;
    private View view;

    public ServiciosController(View view) {
        list = ServiciosList.getInstance();
        this.view = view;
    }
    
    @Override
    public void insert(Servicio obj) {
         if (obj.isComplete()) {
            this.list.insert(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos para insertar");
        }
    }

    @Override
    public void update(Servicio obj) {
         if (obj.isComplete()) {
            this.list.update(obj);
            this.readAll();
        } else {
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Servicio obj) {
         if (this.list.delete(obj)) {
            this.readAll();
        } else {
            this.view.displayErrorMessage("La Tarea no se encuentra registrada");
        }
    }

    @Override
    public void read(Object id) {
         Servicio servi = this.list.search(id);
        if (servi != null) {
            this.view.display(servi);
        } else {
            this.view.displayErrorMessage("Servicio no disponible");
        }
    }

    @Override
    public void readAll() {
        Servicio[] servis = this.list.toArray();
        if (servis.length > 0) {
            this.view.displayAll(servis);
        }
    }   
}
