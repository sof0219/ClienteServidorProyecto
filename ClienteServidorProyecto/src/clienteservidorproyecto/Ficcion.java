
package clienteservidorproyecto;

/**
 *
 * @author angie
 */
public class Ficcion extends Pelicula {
   
    private String ambientacionF;
    private int edadF;

    public Ficcion(int idPelicula, String nombrePelicula, int fechaEsteno, int edadF, String ambientacionF) {
        super(idPelicula, nombrePelicula, fechaEsteno);
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaEsteno = fechaEsteno;
        this.edadF = edadF;
        this.ambientacionF = ambientacionF;
    }

    public String getAmbientacionF() {
        return ambientacionF;
    }

    public int getEdadF() {
        return edadF;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getFechaEsteno() {
        return fechaEsteno;
    }

    public void setAmbientacionF(String ambientacionF) {
        this.ambientacionF = ambientacionF;
    }

    public void setEdadF(int edadF) {
        this.edadF = edadF;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setFechaEsteno(int fechaEsteno) {
        this.fechaEsteno = fechaEsteno;
    }
   
}
