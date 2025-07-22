/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ususario
 */
public class ControladorDoctorVeterinario {
    private DoctorVeterinario DV;
    private BaseDatos baseDatos;
    private ArrayList<DoctorVeterinario> DoctoresVet;
    private GeneradorContraseñas generadorContraseñas;

    public ControladorDoctorVeterinario() {
    }

    public ControladorDoctorVeterinario(DoctorVeterinario DV) {
        this.DV = DV;
    }
    
    public ControladorDoctorVeterinario(DoctorVeterinario DV, BaseDatos baseDatos, GeneradorContraseñas generadorContraseñas) {
        this.DV = DV;
        this.baseDatos = baseDatos;
        this.generadorContraseñas = generadorContraseñas;
    }
    
   //Método que crea al DV en la base de datos
    public String doctorVeterinarioEsCreado(DoctorVeterinario DV) {
        this.baseDatos = new BaseDatos();
        this.generadorContraseñas = new GeneradorContraseñas();
        String contraseña = generadorContraseñas.generarContraseñaTemporal();
        String sql = "INSERT INTO `doctoresveterinarios`(`nombre`, `apellido`, `nDocumeno`, `email`, `numeroTelefono`, `contraseña`, `especialización`) "
                + "VALUES (?,?,?,?,?,?,?)";
 
            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, DV.getNombre());
                pstmt.setString(2, DV.getApellido());
                pstmt.setString(3, DV.getnDocumento());
                pstmt.setString(4, DV.getEmail());
                pstmt.setString(5, DV.getNumeroTelefono());
                pstmt.setString(6, contraseña);
                pstmt.setString(7, DV.getEspecializacion());

                int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            return contraseña;  // Retorna la contraseña generada
        } else {
            return null;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}
    

    //Método que lee a los doctores en la base de datos y los lleva a un array 
    public ControladorDoctorVeterinario (BaseDatos basedatos) {
        
        String select = "SELECT * FROM `doctoresveterinarios` ORDER BY nombre, apellido;";
        try {
            ResultSet rs = basedatos.getStatement().executeQuery(select);
            while (rs.next()) {
                DoctorVeterinario DV = new DoctorVeterinario(
                rs.getInt("ID"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("nDocumento"),
                rs.getString("email"),
                rs.getString("numeroTelefono"),
                rs.getString("contraseña"),
                rs.getString("especialización")
                );
                DoctoresVet.add(DV);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<DoctorVeterinario> obtenerDoctoresPorEspecialidad(String especialidad) {
        List<DoctorVeterinario> doctores = new ArrayList<>();

        String sql = "SELECT * FROM `doctoresveterinarios` WHERE `especialización` = ?";

        try (Connection conn = baseDatos.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DoctorVeterinario doctor = new DoctorVeterinario(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("nDocumento"),
                    rs.getString("email"),
                    rs.getString("numeroTelefono"),
                    rs.getString("contraseña"),
                    rs.getString("especialización")
                );
                doctores.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return doctores;
    }
    
    
    
    //Array de los doctores
    public ArrayList<DoctorVeterinario> getDoctorVeterinarios(){
        return DoctoresVet;
    }
    
    //Método que actualiza la contraseña
    public boolean actualizarContraseña(int id, String nuevaPassword) {
        String sql = "UPDATE `doctoresveterinarios` SET `contraseña`= ? WHERE `ID`=? ";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatementWithKeys(sql)) {
            pstmt.setString(1, nuevaPassword);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Elimina al doctor y a las citas asociadas a la misma debido al cascade de la base de datos
    public boolean eliminarDoctor(int idDoctor) throws SQLException {
        String sql = "DELETE FROM `doctoresveterinarios` WHERE ID = ?";
        try (Connection conn = baseDatos.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idDoctor);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
}
