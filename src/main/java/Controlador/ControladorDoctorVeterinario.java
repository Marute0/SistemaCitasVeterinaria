/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ususario
 */
public class ControladorDoctorVeterinario {
    private DoctorVeterinario DV;
    private BaseDatos baseDatos;
    private ArrayList<DoctorVeterinario> DoctoresVet;

    public ControladorDoctorVeterinario(DoctorVeterinario DV, BaseDatos baseDatos) {
        this.DV = DV;
        this.baseDatos = baseDatos;
    }
    
    //Método que crea al DV en la base de datos
    public boolean doctorVeterinarioEsCreado() {
        String sql = "INSERT INTO doctoresveterinarios (nombre, apellido, nDocumento, email, numeroTelefono, contraseña, especialización) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, DV.getNombre());
                pstmt.setString(2, DV.getApellido());
                pstmt.setString(3, DV.getnDocumento());
                pstmt.setString(4, DV.getEmail());
                pstmt.setString(5, DV.getNumeroTelefono());
                pstmt.setString(6, DV.getContraseña());
                pstmt.setString(7, DV.getEspecializacion());

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    

    //Método que lee a los doctores en la base de datos y los lleva a un array 
    public ControladorDoctorVeterinario (BaseDatos basedatos) {
        String select = "SELECT * FROM `doctoresveterinarios`;";
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
    
    public ArrayList<DoctorVeterinario> getDoctorVeterinarios(){
        return DoctoresVet;
    }
    
    public boolean actualizarDoctorVeterinario() {
        String sql = "UPDATE `doctoresveterinarios` SET `ID`='?',`nombre`='?',`apellido`='?',`nDocumeno`='?',"
                + "`email`='?',`numeroTelefono`='?',`contraseña`='?',`especialización`='?'";

            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, DV.getNombre());
                pstmt.setString(2, DV.getApellido());
                pstmt.setString(3, DV.getnDocumento());
                pstmt.setString(4, DV.getEmail());
                pstmt.setString(5, DV.getNumeroTelefono());
                pstmt.setString(6, DV.getContraseña());
                pstmt.setString(7, DV.getEspecializacion());

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    
    //Método que actualiza la contraseña
    public boolean actualizarContraseña(int id, String nuevaPassword) {
        String sql = "UPDATE `administradores` SET `contraseña`= ? WHERE `ID`=? ";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatementWithKeys(sql)) {
            pstmt.setString(1, nuevaPassword);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
