/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Cliente;

import Controller.Controller;
import Model.Cliente.Cliente;
import Model.Cliente.ClienteList;
import View.View;

/**
 *
 * @author maryc
 */
public  class ClienteController implements Controller<Cliente> {
    private ClienteList list;
    private View view;

    public ClienteController(View view){
        list=ClienteList.getInstance();
        this.view=view;
    }
    
    @Override
    public void insert(Cliente obj) {
  if(obj.isComplete()){
      this.list.insert(obj);
      this.readAll();
  }else{
     this.view.displayErrorMessage("Faltan datos");
  }
    }

    @Override
    public void update(Cliente obj) {
      if (obj.isComplete()){
            this.list.update(obj);
            this.readAll();
        }else{
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Cliente obj) {
   if (this.list.delete(obj)){
            this.readAll();
        }else{
            this.view.displayErrorMessage("El miembro no se encuentra registrado");
        }
    }

    @Override
    public void read(Object id) {
   Cliente cliente=this.list.search(id);
        if (cliente!=null){
            this.view.display(cliente);
        }else{
            this.view.displayErrorMessage("El miembro buscado no se encuentra registrado");
        }
    }

    @Override
    public void readAll() {
     Cliente[] clientes=this.list.toArray();
        if (clientes.length>0){
            this.view.displayAll(clientes);
        }
    }
}
