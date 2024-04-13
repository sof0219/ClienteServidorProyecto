/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clienteservidorproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca B = new Biblioteca();
        
        B.agregarCliente(new Cliente("Sofia", 19, 169025861));
        B.agregarCliente(new Cliente("Miguel", 20, 109289233));
        B.agregarCliente(new Cliente("Adriana", 36, 178262702));
        B.agregarCliente(new Cliente("Angie", 19, 123778297));
        
        System.out.println("Lista de clientes en la biblioteca: ");
        for(Cliente c : B.getCliente()){
            System.out.println("Nombre: " + c.getNombreCliente() + 
                    "\nEdad: " + c.getEdadCliente() + 
                    "\nID: " + c.getIdCliente());   
        }
        
        String nombreClienteNuevo = JOptionPane.showInputDialog("Ingrese el nombre del nuevo cliente:");
        int edadClienteNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo cliente:"));
        int idClienteNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del nuevo cliente:"));
        B.agregarCliente(new Cliente(nombreClienteNuevo, edadClienteNuevo, idClienteNuevo));

        // Mostrar la lista de clientes actualizada en la biblioteca
        System.out.println("\nLista de clientes actualizada en la biblioteca:");
        for (Cliente c : B.getCliente()) {
            System.out.println("Nombre: " + c.getNombreCliente() +
                    ", Edad: " + c.getEdadCliente() +
                    ", ID: " + c.getIdCliente());
        }
    }  
}
