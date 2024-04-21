package clienteservidorproyecto;
/**
 *
 * @author angie
 */
public class Comedia extends Pelicula{
    private int mayoresEdad;
    private String tipoComedia;

    public Comedia(int mayoresEdad, String tipoComedia, int idPelicula, String nombrePelicula, int fechaEsteno) {
        super(idPelicula, nombrePelicula, fechaEsteno);
        this.mayoresEdad = mayoresEdad;
        this.tipoComedia = tipoComedia;
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaEsteno = fechaEsteno;
    }
 
    public int getMayoresEdad() {
        return mayoresEdad;
    }

    public String getTipoComedia() {
        return tipoComedia;
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

    
    public void setMayoresEdad(int mayoresEdad) {
        this.mayoresEdad = mayoresEdad;
    }

    public void setTipoComedia(String tipoComedia) {
        this.tipoComedia = tipoComedia;
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
