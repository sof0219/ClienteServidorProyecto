package clienteservidorproyecto;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class DatosComedia {

    public boolean insertarComedia(Comedia comedia) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO comedia (IdC, NombreC, FechaC, EdadC, TipoC) VALUES (?,?,?,?,?)";
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, comedia.getIdPelicula());
            ps.setString(2, comedia.getNombrePelicula());
            ps.setInt(3, comedia.getFechaEsteno());
            ps.setInt(4, comedia.getMayoresEdad());
            ps.setString(5, comedia.getTipoComedia());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar artículo: " + e.getMessage());
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

    public ArrayList<Comedia> todasLasComedias() {
        ArrayList<Comedia> miListaComedia = new ArrayList<>();
        try {
            Conexion con = new Conexion(); // Crear la conexión a la base de datos
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM comedia"); // Crear el PreparedStatement con la consulta SQL
            ResultSet rs = st.executeQuery(); // Ejecutar la consulta
            while (rs.next()) {
                // Crear un objeto Comedia con los datos obtenidos de la base de datos y agregarlo a la lista
                Comedia comedia = new Comedia(rs.getInt("EdadC"), rs.getString("TipoC"), rs.getInt("IdC"), rs.getString("NombreC"), rs.getInt("FechaC"));
                miListaComedia.add(comedia);
            }
            rs.close();
            con.close(); // Cerrar la conexión a la base de datos
        } catch (SQLException e) {
            Logger.getLogger(DatosComedia.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaComedia;
    }

    public ArrayList<Comedia> BuscarcomediaNombre(String NombreC) {
        ArrayList<Comedia> miListaComedia = new ArrayList<>();
        try {
            Conexion con = new Conexion(); // Crear la conexión a la base de datos
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM comedia WHERE NombreC LIKE ?"); // Crear el PreparedStatement con la consulta SQL
            NombreC = '%' + NombreC + '%';
            st.setString(1, NombreC); // Establecer el parámetro en el PreparedStatement
            ResultSet rs = st.executeQuery(); // Ejecutar la consulta
            while (rs.next()) {
                // Crear un objeto Comedia con los datos obtenidos de la base de datos
                Comedia comedia = new Comedia(
                        rs.getInt("EdadC"), // mayoresEdad
                        rs.getString("TipoC"), // tipoComedia
                        rs.getInt("IdC"), // idPelicula
                        rs.getString("NombreC"), // nombrePelicula
                        rs.getInt("FechaC") // fechaEsteno
                );
                miListaComedia.add(comedia); // Agregar el objeto Comedia a la lista
            }
            rs.close();
            con.close(); // Cerrar la conexión a la base de datos
        } catch (SQLException e) {
            Logger.getLogger(DatosComedia.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaComedia;
    }
}
