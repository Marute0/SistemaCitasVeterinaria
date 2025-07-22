/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Dueño;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ususario
 */
public class ControladorDueño {
    private Dueño Dñ;
    private BaseDatos baseDatos;
    private ArrayList<Dueño> Dueños;

    public ControladorDueño() {

    }
    
    public ControladorDueño(Dueño Dñ, BaseDatos baseDatos, ArrayList<Dueño> Dueños) {
        this.Dñ = Dñ;
        this.baseDatos = baseDatos;
        this.Dueños = Dueños;
    }
    
    
        //Método que crea al DV en la base de datos
    public boolean dueñoEsCreado(Dueño Dñ) {
        this.baseDatos = new BaseDatos();
        this.Dñ = new Dueño();
        
        String sql = "INSERT INTO `dueños`(`nombre`, `apellido`, `nDocumeno`, `email`, `numeroTelefono`, `direccion`) "
                + "VALUES (?,?,?,?,?,?)";

            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, Dñ.getNombre());
                pstmt.setString(2, Dñ.getApellido());
                pstmt.setString(3, Dñ.getnDocumento());
                pstmt.setString(4, Dñ.getEmail());
                pstmt.setString(5, Dñ.getNumeroTelefono());
                pstmt.setString(6, Dñ.getDirección());

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    

    //Método que lee a los dueños en la base de datos y los lleva a un array 
    public ControladorDueño (BaseDatos basedatos) {
        
        String select = "SELECT * FROM `dueños` ORDER BY nombre, apellido";
        try {
            ResultSet rs = basedatos.getStatement().executeQuery(select);
            while (rs.next()) {
                Dueño dueño = new Dueño(
                rs.getInt("ID"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("nDocumento"),
                rs.getString("email"),
                rs.getString("numeroTelefono"),
                rs.getString("contraseña"));
                Dueños.add(dueño);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    
    //Elimina al dueño y a las citas y mascotas asociadas a la misma debido al cascade de la base de datos
    public boolean eliminarDueño(int idDueño) throws SQLException {
        String sql = "DELETE FROM `dueños` WHERE `ID` = ?";
        try (Connection conn = baseDatos.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idDueño);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
