
package com.mycompany.herencia1;

/**
 *
 * @author angie
 */
public class Ficcion extends Pelicula {
    private String tipoNarrador;
    private String ambientacion;
    private String descripcionFiccion;
    
   //Constructor 
    public Ficcion(int idPelicula, String nombrePelicula, String fechaPublicacion, String autorPelicula) {
        super(idPelicula, nombrePelicula, fechaPublicacion, autorPelicula);
        
        this.tipoNarrador = tipoNarrador;
        this.ambientacion = ambientacion;
        this.descripcionFiccion = descripcionFiccion;
        
        
    }
}
