/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Administrador;
import Modelo.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ususario
 */
public class ControladorAdmin {
    
    private BaseDatos baseDatos;
    private Administrador ADM;

    //Constructor ControllerAdmin
    public ControladorAdmin(BaseDatos baseDatos, Administrador ADM) {
        this.baseDatos = baseDatos;
        this.ADM = ADM;
    }
    
    //verifica si existen o no administradores
    public boolean existenAdministradores() {
        String sql = "SELECT * FROM `administradores`;";
        try (ResultSet rs = baseDatos.getPreparedStatement(sql).executeQuery(sql)){
            return rs.next() && rs.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
// Actualizar contraseña
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
