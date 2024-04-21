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
                    JOptionPane.showMessageDialog(null, "Has seleccionado Comedia");
                    
                    frmComedia menuComedia = new frmComedia();
                    menuComedia.setVisible(true);
                    menuComedia.setLocationRelativeTo(null);
                }
                case "Drama" -> {
                    JOptionPane.showMessageDialog(null, "Has seleccionado Drama");
                    frmDrama menuDrama = new frmDrama();
                    menuDrama.setVisible(true);
                    menuDrama.setLocationRelativeTo(null);
                }
                case "Ficcion" -> {
                    JOptionPane.showMessageDialog(null, "Has seleccionado Ficcion");
                    frmFiccion menuFiccion = new frmFiccion();
                    menuFiccion.setVisible(true);
                    menuFiccion.setLocationRelativeTo(null);
                }
                case "Historia" -> {
                    JOptionPane.showMessageDialog(null, "Has seleccionado Historia");
                    frmHistoria menuHistoria = new frmHistoria();
                    menuHistoria.setVisible(true);
                    menuHistoria.setLocationRelativeTo(null);
                }
                case "Cliente" -> {
                    JOptionPane.showMessageDialog(null, "Has seleccionado Cliente");
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
