/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clienteservidorproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {

        String[] opciones = {"Comedia", "Drama", "Ficcion", "Historia", "Cliente", "Salir"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Selecciona una opción:",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Comedia" -> {
                    JOptionPane.showMessageDialog(null, "Ingresando a  Comedia");

                    frmComedia menuComedia = new frmComedia();
                    menuComedia.setVisible(true);
                    menuComedia.setLocationRelativeTo(null);
                }
                case "Drama" -> {
                    JOptionPane.showMessageDialog(null, "Ingresando a  Drama");
                    frmDrama menuDrama = new frmDrama();
                    menuDrama.setVisible(true);
                    menuDrama.setLocationRelativeTo(null);
                }
                case "Ficcion" -> {
                    JOptionPane.showMessageDialog(null, "Ingresando a  Ficcion");
                    frmFiccion menuFiccion = new frmFiccion();
                    menuFiccion.setVisible(true);
                    menuFiccion.setLocationRelativeTo(null);
                }
                case "Historia" -> {
                    JOptionPane.showMessageDialog(null, "Ingresando a Historia");
                    frmHistoria menuHistoria = new frmHistoria();
                    menuHistoria.setVisible(true);
                    menuHistoria.setLocationRelativeTo(null);
                }
                case "Cliente" -> {
                    JOptionPane.showMessageDialog(null, "Has seleccionado Cliente");

                    RegistroClientes registro = new RegistroClientes();

                    while (true) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente (o deje vacío para salir):");
                        if (nombre.isEmpty()) {
                            break;
                        }
                        int edad;
                        int id;

                        try {
                            
                            String edadStr = JOptionPane.showInputDialog("Ingrese la edad del cliente:");
                            edad = Integer.parseInt(edadStr);

                            
                            String idStr = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
                            id = Integer.parseInt(idStr);

                            
                            Cliente cliente = new Cliente(nombre, edad, id);
                            registro.agregarCliente(cliente);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad y el ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    registro.mostrarClientes();

                    StringBuilder mensaje = new StringBuilder("Lista de Clientes:\n");
                    for (Cliente cliente : registro.getCliente()) {
                        mensaje.append("Nombre: ").append(cliente.getNombreCliente()).append("\n")
                                .append("Edad: ").append(cliente.getEdadCliente()).append("\n")
                                .append("ID: ").append(cliente.getIdCliente()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje.toString());
                    registro.mostrarClientes();
                }

                case "Salir" -> {
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
        }
    }
}
