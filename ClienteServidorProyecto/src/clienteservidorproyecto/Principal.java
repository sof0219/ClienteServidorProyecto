/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clienteservidorproyecto;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmComedia menuComedia=new frmComedia();
        menuComedia.setVisible(true);
        menuComedia.setLocationRelativeTo(null);
        
        frmDrama menuDrama=new frmDrama();
        menuDrama.setVisible(true);
        menuDrama.setLocationRelativeTo(null);
        
        frmFiccion menuFiccion=new frmFiccion();
        menuFiccion.setVisible(true);
        menuFiccion.setLocationRelativeTo(null);
        
        frmHistoria menuHistoria=new frmHistoria();
        menuHistoria.setVisible(true);
        menuHistoria.setLocationRelativeTo(null);
        
        
    }
    
}
