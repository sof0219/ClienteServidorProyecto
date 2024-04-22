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

             mostrarMenuPrincipal();
    }

    // Meto para llamar el menu
    public static void mostrarMenuPrincipal() {
        String[] opciones = {"Comedia", "Drama", "Ficcion", "Historia", "Cliente", "Salir"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Bienvenido a la app de películas FideMovie para administradores \n\n"
                        + " Selecciona una opción:",
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

                    String nombre = capturarNombre();
                    int edad = capturarEdad();
                    int id = capturarID();

                    Cliente cliente = new Cliente(nombre, edad, id);
                    registro.agregarCliente(cliente);

                    StringBuilder mensaje = new StringBuilder("Lista de Clientes:\n");
                    for (Cliente cl : registro.getCliente()) {
                        mensaje.append("Nombre: ").append(cl.getNombreCliente()).append("\n")
                                .append("Edad: ").append(cl.getEdadCliente()).append("\n")
                                .append("ID: ").append(cl.getIdCliente()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje.toString());

                    int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas volver al menú principal?", "Volver al Menú", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        mostrarMenuPrincipal(); // Volver a mostrar el menú principal
                    } else {
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    }
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

    private static String capturarNombre() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente :");
        if (nombre.isEmpty()) {
            return capturarNombre();
        }
        return nombre;
    }

    private static int capturarEdad() {
        try {
            String edadStr = JOptionPane.showInputDialog("Ingrese la edad del cliente:");
            return Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad.", "Error", JOptionPane.ERROR_MESSAGE);
            return capturarEdad();
        }
    }

    private static int capturarID() {
        try {
            String idStr = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
            return Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return capturarID();
        }
    }
}