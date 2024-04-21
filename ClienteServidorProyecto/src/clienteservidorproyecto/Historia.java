
package clienteservidorproyecto;

/**
 *
 * @author angie
 */
public class Historia extends Pelicula{
    private String momentoHistorico;
    private int edadH;

    public Historia(int idPelicula, String nombrePelicula, int fechaEsteno,int edadH,  String momentoHistorico ) {
        super(idPelicula, nombrePelicula, fechaEsteno);
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaEsteno = fechaEsteno;
        this.edadH = edadH;
        this.momentoHistorico = momentoHistorico;
    }

    public String getMomentoHistorico() {
        return momentoHistorico;
    }

    public int getEdadH() {
        return edadH;
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

    public void setMomentoHistorico(String momentoHistorico) {
        this.momentoHistorico = momentoHistorico;
    }

    public void setEdadH(int edadH) {
        this.edadH = edadH;
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
