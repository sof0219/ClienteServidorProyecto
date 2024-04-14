
package com.mycompany.herencia1;

/**
 *
 * @author angie
 */
public class Historia extends Pelicula{
    private String momentoHistorico;
    private String lugarGeografico;
    private String descripcionHistoria;
    
    //Constructor
    public Historia(int idPelicula, String nombrePelicula, String fechaPublicacion, String autorPelicula) {
        super(idPelicula, nombrePelicula, fechaPublicacion, autorPelicula);
        
        this.momentoHistorico = momentoHistorico;
        this.lugarGeografico = lugarGeografico;
        this.descripcionHistoria = descripcionHistoria;
        
                
    }
    
    
    
}
