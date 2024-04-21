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
public class DatosDrama {
    public boolean insertarDrama(Drama drama) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO drama (IdD, NombreD, FechaD, EdadD, DescripcionD) VALUES (?,?,?,?,?)";
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, drama.getIdPelicula());
            ps.setString(2, drama.getNombrePelicula());
            ps.setInt(3, drama.getFechaEsteno());
            ps.setInt(4, drama.getEdadD());
            ps.setString(5, drama.getDescripcionD() );
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar drama: " + e.getMessage());
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

    public ArrayList<Drama> todasLasDramas() {
        ArrayList<Drama> miListaDrama = new ArrayList<>(); 
        try {
            Conexion con = new Conexion(); // Primero hay que crear la conexión a la base de datos
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM drama"); 
            ResultSet rs = st.executeQuery(); 
            while (rs.next()) {
               
                 Drama drama = new Drama (rs.getInt("IdD"), rs.getString("NombreD"), rs.getInt("FechaD"), rs.getInt("EdadD"), rs.getString("DescripcionD"));
                 miListaDrama.add(drama);
            }
            rs.close();
            con.close(); 
        } catch (SQLException e) {
            Logger.getLogger(DatosDrama.class.getName()).log(Level.SEVERE, null, e); 
        }
        return miListaDrama;
    }


    public ArrayList<Drama> BuscarDramaNombre(String NombreD) {
    ArrayList<Drama> miListaDrama = new ArrayList<>();
    try {
        Conexion con = new Conexion(); 
        PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM drama WHERE NombreD LIKE ?"); 
        NombreD = '%' + NombreD + '%';
        st.setString(1, NombreD); 
        ResultSet rs = st.executeQuery(); 
        while (rs.next()) {
           
            Drama drama = new Drama(
                rs.getInt("IdD"),         
                rs.getString("NombreD"),  
                rs.getInt("FechaD"),      
                rs.getInt("EdadD"),       
                rs.getString("DescripcionD") 
            );
            miListaDrama.add(drama); 
        }
        rs.close();
        con.close(); 
    } catch (SQLException e) {
        Logger.getLogger(DatosDrama.class.getName()).log(Level.SEVERE, null, e);
    }
    return miListaDrama;
}
}
    

