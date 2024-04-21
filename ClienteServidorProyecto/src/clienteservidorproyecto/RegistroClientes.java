/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteservidorproyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class RegistroClientes {
    private ArrayList<Cliente> cliente;
    
    public RegistroClientes() {
        this.cliente = new ArrayList<>();
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
    
    public void mostrarClientes() {
        StringBuilder mensaje = new StringBuilder("Lista de Clientes:\n");
        for (Cliente c : cliente) {
            mensaje.append("Nombre: ").append(c.getNombreCliente()).append("\n")
                    .append("Edad: ").append(c.getEdadCliente()).append("\n")
                    .append("ID: ").append(c.getIdCliente()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
