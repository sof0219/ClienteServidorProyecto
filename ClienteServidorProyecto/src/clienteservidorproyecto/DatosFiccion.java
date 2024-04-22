/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteservidorproyecto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DatosFiccion {

    public boolean insertarFiccion(Ficcion ficcion) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO ficcion (IdF, NombreF, FechaF, EdadF, AmbientacionF) VALUES (?,?,?,?,?)";
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, ficcion.getIdPelicula());
            ps.setString(2, ficcion.getNombrePelicula());
            ps.setInt(3, ficcion.getFechaEsteno());
            ps.setInt(4, ficcion.getEdadF());
            ps.setString(5, ficcion.getAmbientacionF());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar ficcion: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }

    public ArrayList<Ficcion> todasLasFicciones() {
        ArrayList<Ficcion> miListaFiccion = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM ficcion");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Ficcion ficcion = new Ficcion(
                        rs.getInt("IdF"),
                        rs.getString("NombreF"),
                        rs.getInt("FechaF"),
                        rs.getInt("EdadF"),
                        rs.getString("AmbientacionF")
                );
                miListaFiccion.add(ficcion);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            Logger.getLogger(DatosFiccion.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaFiccion;
    }

    public ArrayList<Ficcion> buscarFiccionNombre(String NombreF) {
        ArrayList<Ficcion> miListaFiccion = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM ficcion WHERE NombreF LIKE ?");
            NombreF = '%' + NombreF + '%';
            st.setString(1, NombreF);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Ficcion ficcion = new Ficcion(
                        rs.getInt("IdF"),
                        rs.getString("NombreF"),
                        rs.getInt("FechaF"),
                        rs.getInt("EdadF"),
                        rs.getString("AmbientacionF")
                );
                miListaFiccion.add(ficcion);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            Logger.getLogger(DatosFiccion.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaFiccion;
    }

    public boolean eliminarFiccion(int idFiccion) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "DELETE FROM ficcion WHERE IdF=?";
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, idFiccion);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar ficción: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }

        }
    }
}
