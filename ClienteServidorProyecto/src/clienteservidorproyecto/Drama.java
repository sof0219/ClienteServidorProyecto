
package com.mycompany.herencia1;

/**
 *
 * @author angie
 */
public class Drama  extends Pelicula{
    private int numeroEscenas;
    private String descripcionDrama;
    private int numeroActos;
    
    //Constructor
    public Drama(int idPelicula, String nombrePelicula, String fechaPublicacion, String autorPelicula) {
        super(idPelicula, nombrePelicula, fechaPublicacion, autorPelicula);
        
        this.numeroEscenas = numeroEscenas;
        this.descripcionDrama = descripcionDrama;
        this.numeroActos = numeroActos;
        
        
    }
    
}
