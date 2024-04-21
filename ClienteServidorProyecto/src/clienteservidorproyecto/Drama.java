package clienteservidorproyecto;

/**
 *
 * @author angie
 */
public class Drama  extends Pelicula{
    public  int edadD;
    public String descripcionD;
   

    public Drama(int idPelicula, String nombrePelicula, int fechaEsteno, int edadD, String descripcionD) {
        super(idPelicula, nombrePelicula, fechaEsteno);
        this.idPelicula= idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaEsteno = fechaEsteno;
        this.edadD = edadD;
        this.descripcionD = descripcionD;
    }

    public int getEdadD() {
        return edadD;
    }

    public String getDescripcionD() {
        return descripcionD;
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

    public void setEdadD(int edadD) {
        this.edadD = edadD;
    }

    public void setDescripcionD(String descripcionD) {
        this.descripcionD = descripcionD;
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
