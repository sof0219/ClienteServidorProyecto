/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteservidorproyecto;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Biblioteca {
    private ArrayList<Cliente> cliente;
    
    public Biblioteca() {
        this.cliente = new ArrayList<Cliente>();
    }
    
    public void agregarCliente(Cliente c) {
        cliente.add(c);
    }
    
    public void eliminarCliente(int idCliente) {
        for(Cliente c : cliente) {
            if(c.getIdCliente() == idCliente) {
                cliente.remove(c);
                break;
            }
        }
    }
    
    public Cliente buscarCliente(int idCliente) {
        for(Cliente c : cliente) {
            if(c.getIdCliente() == idCliente) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Cliente>getCliente(){
        return cliente;
    }
}
