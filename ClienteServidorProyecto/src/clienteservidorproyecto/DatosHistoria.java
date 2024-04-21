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
public class DatosHistoria {
    public boolean insertarHistoria(Historia historia) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO historia (IdH, NombreH, FechaH, EdadH, MomentoH) VALUES (?,?,?,?,?)";
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, historia.getIdPelicula());
            ps.setString(2,historia.getNombrePelicula());
            ps.setInt(3, historia.getFechaEsteno());
            ps.setInt(4, historia.getEdadH());
            ps.setString(5, historia.getMomentoHistorico() );
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar Historia: " + e.getMessage());
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

    public ArrayList<Historia> todasLasHistoria() {
        ArrayList<Historia> miListaHistoria = new ArrayList<>(); 
        try {
            Conexion con = new Conexion(); // Primero hay que crear la conexión a la base de datos
            PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM historia"); 
            ResultSet rs = st.executeQuery(); 
            while (rs.next()) {
               
                 Historia historia = new Historia (rs.getInt("IdH"), rs.getString("NombreH"), rs.getInt("FechaH"), rs.getInt("EdadH"), rs.getString("MomentoH"));
                 miListaHistoria.add(historia);
            }
            rs.close();
            con.close(); 
        } catch (SQLException e) {
            Logger.getLogger(DatosHistoria.class.getName()).log(Level.SEVERE, null, e); 
        }
        return miListaHistoria;
    }


    public ArrayList<Historia> BuscarHistoriaNombre(String NombreH) {
    ArrayList<Historia> miListaHistoria = new ArrayList<>();
    try {
        Conexion con = new Conexion(); 
        PreparedStatement st = con.getConexion().prepareStatement("SELECT * FROM historia WHERE NombreH LIKE ?"); 
        NombreH = '%' + NombreH + '%';
        st.setString(1, NombreH); 
        ResultSet rs = st.executeQuery(); 
        while (rs.next()) {
           
            Historia historia = new Historia(
                rs.getInt("IdD"),         
                rs.getString("NombreD"),  
                rs.getInt("FechaD"),      
                rs.getInt("EdadD"),       
                rs.getString("DescripcionD") 
            );
            miListaHistoria.add(historia); 
        }
        rs.close();
        con.close(); 
    } catch (SQLException e) {
        Logger.getLogger(DatosHistoria.class.getName()).log(Level.SEVERE, null, e);
    }
    return miListaHistoria;
}
}
    

