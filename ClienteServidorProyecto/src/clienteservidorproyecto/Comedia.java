
package com.mycompany.herencia1;

/**
 *
 * @author angie
 */
public class Comedia  extends Pelicula{
    private int mayoresEdad;
    private String tipoComedia;
    private String actores;
    
    public Comedia(int idPelicula, String nombrePelicula, String fechaPublicacion, String autorPelicula) {
        super(idPelicula, nombrePelicula, fechaPublicacion, autorPelicula);
        
        this.mayoresEdad = mayoresEdad;
        this.tipoComedia = tipoComedia;
        this.actores = actores;
    }
    
}
