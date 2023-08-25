
package Model.Cliente;

import Model.List;
import java.util.HashMap;


public class ClienteList implements List <Cliente>{
private static ClienteList clienteList;
public static ClienteList getInstance(){
    if (clienteList==null){
        clienteList= new ClienteList();
    }
    return clienteList;
}
HashMap <String,Cliente> clientes;
private ClienteList(){
    this.clientes= new HashMap<>();
}
    @Override
    public boolean insert(Cliente obj) {
   this.clientes.put(obj.getIdentificacion(), obj);
   return true; 
    }

    @Override
    public boolean update(Cliente obj) {
          return this.insert(obj);
    }

    @Override
    public boolean delete(Cliente obj) {
obj= this.search(obj.getIdentificacion());
return this.clientes.remove(obj.getIdentificacion(), obj);
    }

    @Override
    public Cliente search(Object id) {
  return this.clientes.get(id.toString());
    }

    @Override
    public Cliente[] toArray() {
   return this.clientes.values().toArray(new Cliente[0]);
    }
    
}
