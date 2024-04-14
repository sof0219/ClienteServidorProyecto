/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteservidorproyecto;

/**
 *
 * @author cienc
 */
public class Peliculas {

    private String titulo;
    private String genero;
    private int año;
    private String Director;
    private String Descripcion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String genero, int año, String Director, String Descripcion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.Director = Director;
        this.Descripcion = Descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
